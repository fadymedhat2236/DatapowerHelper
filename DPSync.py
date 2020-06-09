import glob
import base64
import requests
import urllib3
import re
import xml.dom.minidom
urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)

#for the constants

url="https://192.168.116.128:5550"
username="admin"
password="idgadmin"
domainName="SABB"
path = "D:\\Projects\\SABB_TFS\\(Common)\\Development\\SourceCode\\Gateway_DP"
xmlManager="default"

def getFolderNames():
    folders= glob.glob(path + '/*/')
    f=[]
    for folder in folders:
        folder=folder.split('\\')
        f.append('local:///'+domainName+'/'+folder[len(folder)-2])
    return f

def getAll(url, username, password, domainName, path ):
    oldFiles = glob.glob(path + '/**/*.*', recursive=True)
    folders = []
    files = []
    for f in oldFiles:
        start = 'local:///'+domainName+'/'
        newFile = start + f.replace(path + "\\", "").replace("\\", "/")
        files.append({"local": f, "name":newFile})
        folders.append(newFile.rsplit('/', 1)[0])
    folders = list(set(folders))
    return folders, files

def deleteFolders():
    f = getFolderNames()
    folders=""
    for folder in f:
        folders = folders + ' <RemoveDir><Dir>'+folder+'</Dir></RemoveDir>\n'

    xmlTemplate = '''<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/">
	                    <env:Body>
		                    <dp:request xmlns:dp="http://www.datapower.com/schemas/management">
			                    <dp:do-action>
				                    '''+folders+'''
			                    </dp:do-action>
		                    </dp:request>
	                    </env:Body>
                    </env:Envelope>'''
    r = requests.post(url, auth=(username, password), data=xmlTemplate, verify=False)
    if r.status_code == 200:
        if 'OK' in r.text:
            print('Deleted successfully')
        else:
            print('Deleted failed')
    else:
        print('connectionError')

def addFolders(folderPaths):
    folders = ""
    for folder in folderPaths:
        folders = folders + ' <CreateDir><Dir>'+folder+'</Dir></CreateDir>\n'

    xmlTemplate = '''<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/">
	                    <env:Body>
		                    <dp:request xmlns:dp="http://www.datapower.com/schemas/management">
			                    <dp:do-action>
                                    '''+folders+'''
			                    </dp:do-action>
		                    </dp:request>
	                    </env:Body>
                    </env:Envelope>'''
    r = requests.post(url, auth=(username, password), data=xmlTemplate, verify=False)
    if r.status_code == 200:
        if 'OK' in r.text:
            print('uploaded successfully')
        else:
            print('upload failed')
    else:
        print('connectionError')

def addFiles(files):
    filesRequest = ""
    for eachFile in files:
        with open(eachFile['local'], 'rb') as lines:
            data = lines.read()
        fileContent = base64.b64encode(data).decode('ascii')
        fileData = '<dp:set-file name="{}">{}</dp:set-file>'
        fileData = fileData.format(eachFile['name'], fileContent)
        filesRequest = filesRequest + fileData

    xmlTemplate = '''<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/">
                        <env:Body>
                            <dp:request xmlns:dp="http://www.datapower.com/schemas/management">
                                ''' + filesRequest + '''
                            </dp:request>
                        </env:Body>
                    </env:Envelope>'''
    r = requests.post(url, auth=(username, password), data=xmlTemplate, verify=False)
    if r.status_code == 200:
        if 'OK' in r.text:
            print('uploaded successfully')
        else:
            print('upload failed')
    else:
        print('connectionError')

def flush():
    xmlTemplate = '''<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/">
	                    <env:Body>
		                    <dp:request domain="'''+domainName+'''" xmlns:dp="http://www.datapower.com/schemas/management">
			                    <dp:do-action>
				                    <FlushStylesheetCache>
					                    <XMLManager>'''+xmlManager+'''</XMLManager>
				                    </FlushStylesheetCache>
				                    <FlushDocumentCache>
					                    <XMLManager>'''+xmlManager+'''</XMLManager>
				                    </FlushDocumentCache>
			                    </dp:do-action>
		                    </dp:request>
	                    </env:Body>
                    </env:Envelope>'''
    r = requests.post(url, auth=(username, password), data=xmlTemplate, verify=False)
    if r.status_code == 200:
        if 'OK' in r.text:
            print('flushed successfully')
        else:
            print('flushing failed')
    else:
        print('connectionError')


folders, files = getAll(url, username, password, domainName, path)
deleteFolders()
addFolders(folders)
addFiles(files)
flush()