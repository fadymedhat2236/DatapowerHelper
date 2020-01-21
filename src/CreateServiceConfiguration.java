import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreateServiceConfiguration {


    public static void createConfigurationFile(){

        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            Element root = document.createElement("c:SERVICE_CONFIGURATION");
            root.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:c", "http://www.ejada.com/SERVICE_CONFIGURATION/");
            document.appendChild(root);
            Element service=document.createElement("c:SERVICE");
            root.appendChild(service);
            Element audit=document.createElement("c:AUDIT");
            service.appendChild(audit);
            Element dump=document.createElement("c:DUMP");
            service.appendChild(dump);

            //service node attributes
            Attr attr=document.createAttribute("c:SERVICE_ID");
            attr.setValue(Constants.serviceName);
            service.setAttributeNode(attr);

            attr=document.createAttribute("c:DISCRIMINATOR_ID");
            attr.setValue("ALL");
            service.setAttributeNode(attr);

            //audit node attributes
            attr=document.createAttribute("c:AUDIT_FLG");
            attr.setValue(Constants.AUDIT_FLG);
            audit.setAttributeNode(attr);

            //dump node attributes
            attr=document.createAttribute("c:DUMP_REQUEST_FLG");
            attr.setValue(Constants.DUMP_REQUEST_FLG);
            dump.setAttributeNode(attr);

            attr=document.createAttribute("c:DUMP_BACKEND_REQUEST_FLG");
            attr.setValue(Constants.DUMP_BACKEND_REQUEST_FLG);
            dump.setAttributeNode(attr);

            attr=document.createAttribute("c:DUMP_BACKEND_RESPONSE_FLG");
            attr.setValue(Constants.DUMP_BACKEND_RESPONSE_FLG);
            dump.setAttributeNode(attr);

            attr=document.createAttribute("c:DUMP_RESPONSE_FLG");
            attr.setValue(Constants.DUMP_RESPONSE_FLG);
            dump.setAttributeNode(attr);

            String path=Constants.serviceFilesPath+Constants.serviceName+"/CONFIGURATION/CONFIGURATION.xml";

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(path));
            transformer.transform(domSource, streamResult);

        }
        catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }
        catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

    public static void createEndPointsFile(){

        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            Element root = document.createElement("se:SERVICE_ENDPOINT");
            root.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:se", "http://www.ejada.com/SERVICE_ENDPOINT/");
            document.appendChild(root);
            Element endPoints=document.createElement("se:ENDPOINTS");
            root.appendChild(endPoints);

            for(int i=0;i<Constants.EP_ID.length;i++){
                Element endPoint=document.createElement("se:ENDPOINT");
                endPoints.appendChild(endPoint);

                Attr attr=document.createAttribute("se:SERVICE_ID");
                attr.setValue(Constants.serviceName);
                endPoint.setAttributeNode(attr);

                attr=document.createAttribute("se:DISCRIMINATOR_ID");
                attr.setValue("ALL");
                endPoint.setAttributeNode(attr);

                attr=document.createAttribute("se:EP_ID");
                attr.setValue(Constants.EP_ID[i]);
                endPoint.setAttributeNode(attr);

                attr=document.createAttribute("se:EP_PROTOCOL");
                attr.setValue(Constants.EP_PROTOCOL[i]);
                endPoint.setAttributeNode(attr);

                attr=document.createAttribute("se:EP_REQUEST");
                attr.setValue(Constants.EP_REQUEST[i]);
                endPoint.setAttributeNode(attr);

                if(Constants.EP_PROTOCOL[i].equals("MQ")){
                    attr=document.createAttribute("se:EP_RESPONSE");
                    attr.setValue(Constants.EP_RESPONSE[i]);
                    endPoint.setAttributeNode(attr);

                    attr=document.createAttribute("se:EP_QMGR");
                    attr.setValue(Constants.EP_QMGR);
                    endPoint.setAttributeNode(attr);

                    attr=document.createAttribute("se:EP_EXPIRY");
                    attr.setValue(Constants.EP_EXPIRY);
                    endPoint.setAttributeNode(attr);

                    attr=document.createAttribute("se:EP_TIMEOUT");
                    attr.setValue(Constants.EP_TIMEOUT);
                    endPoint.setAttributeNode(attr);
                }
            }

            String path=Constants.serviceFilesPath+Constants.serviceName+"/CONFIGURATION/"+Constants.backendName+"-ENDPOINTS.xml";

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(path));
            transformer.transform(domSource, streamResult);

        }
        catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }
        catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

    public static void createauditVarsFile(){

        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            Element root = document.createElement("a:AUDIT_VARS");
            root.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:a", "http://www.ejada.com/DP_AUDIT_VARS/");
            document.appendChild(root);
            Element service=document.createElement("a:SERVICE");
            root.appendChild(service);
            Attr attr=document.createAttribute("a:SERVICE_ID");
            attr.setValue(Constants.serviceName);
            service.setAttributeNode(attr);
            attr=document.createAttribute("a:DISCRIMINATOR_ID");
            attr.setValue("ALL");
            service.setAttributeNode(attr);

            for(int i=0;i<Constants.auditVars.length;i++) {
                Element userDefined = document.createElement("a:"+Constants.auditVars[i][0]);
                service.appendChild(userDefined);

                attr = document.createAttribute("target");
                attr.setValue(Constants.auditVars[i][1]);
                userDefined.setAttributeNode(attr);
                String path = "//*[local-name()='" + Constants.auditVars[i][2] + "']";
                userDefined.appendChild(document.createTextNode(path));
            }

            Element userDefined=document.createElement("a:UsrDef11");
            service.appendChild(userDefined);
            attr = document.createAttribute("target");
            attr.setValue("IRPLY");
            userDefined.setAttributeNode(attr);
            String path="//*[local-name()='"+Constants.errorPaths[0]+"']";
            userDefined.appendChild(document.createTextNode(path));

            userDefined=document.createElement("a:BEErrorCodeXPath");
            service.appendChild(userDefined);
            path=Constants.BEFixedPath+"[local-name()='"+Constants.errorPaths[1]+"']";
            userDefined.appendChild(document.createTextNode(path));

            userDefined=document.createElement("a:BEErrorMsgXPath");
            service.appendChild(userDefined);
            path=Constants.BEFixedPath+"[local-name()='"+Constants.errorPaths[2]+"']";
            userDefined.appendChild(document.createTextNode(path));

            userDefined=document.createElement("a:StatusCode");
            service.appendChild(userDefined);
            path=Constants.FixedPath+"[local-name()='"+Constants.errorPaths[3]+"']";
            userDefined.appendChild(document.createTextNode(path));

            userDefined=document.createElement("a:StatusDesc");
            service.appendChild(userDefined);
            path=Constants.FixedPath+"[local-name()='"+Constants.errorPaths[4]+"']";
            userDefined.appendChild(document.createTextNode(path));


            path=Constants.serviceFilesPath+Constants.serviceName+"/CONFIGURATION/AUDIT_VARS.xml";

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(path));
            transformer.transform(domSource, streamResult);

        }
        catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }
        catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }


}
