import base64
import requests
import urllib3
import re
import xml.dom.minidom
urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)

serviceName="B2BBillMng"

constantFolderPath="D:\\Projects\\SABB_TFS\\(Common)\\Development\\SourceCode\\Gateway_DP\\Services"

url="https://192.168.179.128:5550"
username="admin"
password="idgadmin"
domainName="test"
consumer="SABB"
backendName="ESB"
fileTemplate='''<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/">
                        <env:Body>
                            <dp:request xmlns:dp="http://www.datapower.com/schemas/management">
                                <dp:set-file name="{}">{}</dp:set-file>
                            </dp:request>
                        </env:Body>
                    </env:Envelope>'''
folderTemplate='''<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/">
	                    <env:Body>
		                    <dp:request domain="default" xmlns:dp="http://www.datapower.com/schemas/management">
			                    <dp:do-action>
				                    <CreateDir>
					                    <Dir>local:///testdirectory</Dir>
				                    </CreateDir>
			                    </dp:do-action>
		                    </dp:request>
	                    </env:Body>
                    </env:Envelope'''

def addFolder(folderPath):

    xmlTemplate = '''<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/">
	                    <env:Body>
		                    <dp:request domain="default" xmlns:dp="http://www.datapower.com/schemas/management">
			                    <dp:do-action>
				                    <CreateDir>
					                    <Dir>'''+folderPath+'''</Dir>
				                    </CreateDir>
			                    </dp:do-action>
		                    </dp:request>
	                    </env:Body>
                    </env:Envelope>'''
    r = requests.post(url, auth=(username, password), data=xmlTemplate, verify=False)
    if r.status_code == 200:
        if 'OK' in r.text:
            print(folderPath +' uploaded successfully')
        else:
            print(folderPath +' upload failed')
    else:
        print('connectionError')

def addFile(DPFilePath,localFilePath):

    xmlTemplate = '''<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/">
                        <env:Body>
                            <dp:request xmlns:dp="http://www.datapower.com/schemas/management">
                                <dp:set-file name="{}">{}</dp:set-file>
                            </dp:request>
                        </env:Body>
                    </env:Envelope>'''
    with open(localFilePath, 'rb') as lines:
        data = lines.read()
    fileContent = base64.b64encode(data).decode('ascii')
    xmlRequestStr = xmlTemplate.format(DPFilePath, fileContent).replace('\n', '')
    r = requests.post(url, auth=(username, password), data=xmlRequestStr, verify=False)
    if r.status_code == 200:
        if 'OK' in r.text:
            print(DPFilePath+' uploaded successfully')
        else:
            print(DPFilePath+' upload failed')
    else:
        print('connectionError')

def createFolders():
    path='local:///'+domainName+'/Services/'+serviceName
    addFolder(path)
    
    path='local:///'+domainName+'/Services/'+serviceName+'/CONFIGURATION'
    addFolder(path)
    
    path='local:///'+domainName+'/Services/'+serviceName+'/TRANSFORMATION'
    addFolder(path)

def uploadConfigurationFiles():
    path='local:///'+domainName+'/Services/'+serviceName+'/CONFIGURATION/CONFIGURATION.xml'
    localFilePath=constantFolderPath+"\\"+serviceName+"\\CONFIGURATION\\CONFIGURATION.xml"
    addFile(path,localFilePath)

    path='local:///'+domainName+'/Services/'+serviceName+'/CONFIGURATION/AUDIT_VARS.xml'
    localFilePath=constantFolderPath+"\\"+serviceName+"\\CONFIGURATION\\AUDIT_VARS.xml"
    addFile(path,localFilePath)

    path='local:///'+domainName+'/Services/'+serviceName+'/CONFIGURATION/'+backendName+'-ENDPOINTS.xml'
    localFilePath=constantFolderPath+"\\"+serviceName+"\\CONFIGURATION\\"+backendName+"-ENDPOINTS.xml"
    addFile(path,localFilePath)

def uploadTransformationFiles():
    path='local:///'+domainName+'/Services/'+serviceName+'/TRANSFORMATION/'+consumer+'-'+backendName+'-'+serviceName+'-Rq.xsl'
    localFilePath=constantFolderPath+"\\"+serviceName+"\\TRANSFORMATION\\"+consumer+"-"+backendName+"-"+serviceName+"-Rq.xsl"
    addFile(path,localFilePath)

    path='local:///'+domainName+'/Services/'+serviceName+'/TRANSFORMATION/'+consumer+'-'+backendName+'-'+serviceName+'-Rs.xsl'
    localFilePath=constantFolderPath+"\\"+serviceName+"\\TRANSFORMATION\\"+consumer+"-"+backendName+"-"+serviceName+"-Rs.xsl"
    addFile(path,localFilePath)

    path='local:///'+domainName+'/Services/'+serviceName+'/TRANSFORMATION/'+consumer+'-'+backendName+'-'+serviceName+'-Err.xsl'
    localFilePath=constantFolderPath+"\\"+serviceName+"\\TRANSFORMATION\\"+consumer+"-"+backendName+"-"+serviceName+"-Err.xsl"
    addFile(path,localFilePath)

createFolders()
uploadConfigurationFiles()
uploadTransformationFiles()




