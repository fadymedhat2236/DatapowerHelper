import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.*;

public class GetMapping {
    public static NodeList AddConditions(NodeList nodeList,boolean direction){
        HashMap <String ,String> conditionTags = Constants.getConditionTags(direction);
        int counter=1;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node opNode = nodeList.item(i);
            if ((conditionTags.containsKey(opNode.getNodeName()+counter) && conditionTags.get(opNode.getNodeName())!=" ") ||
                    (conditionTags.containsKey(opNode.getLocalName()) && conditionTags.get(opNode.getLocalName())==" ")) {
                conditionTags.remove(opNode.getNodeName());
                Document doc=opNode.getOwnerDocument();
                Node parent=opNode.getParentNode();
                Element test=doc.createElement("xsl:if");
                test.setAttribute("test","");
                Node temp=opNode.cloneNode(true);
                test.appendChild(temp);
                parent.replaceChild(test,opNode);
                nodeList=doc.getElementsByTagName("*");
                i++;
            }
        }
        return nodeList;
    }

    public static NodeList ParseXMLFile(String filePath) {
        try
        {
            File File = new File(filePath);
            DocumentBuilderFactory Dbf = DocumentBuilderFactory.newInstance();
            Dbf.setIgnoringComments(false);
            Dbf.setNamespaceAware(true); // to ignore namespaces
            DocumentBuilder Db = Dbf.newDocumentBuilder();
            Document Doc = Db.parse(File);
            Doc.getDocumentElement().normalize();
            NodeList nodeList = Doc.getElementsByTagName(Constants.ASTERISK);
            return nodeList;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static String getAttributeXPath(Node node){
        if(!node.hasAttributes())
            return "";
        String s="";
        for(int i=0;i<node.getAttributes().getLength();i++){
            Node temp=node.getAttributes().item(i);
            String key=temp.getNodeName();
            String value=temp.getTextContent();
            s=s+"@"+key+"='"+value+"'";
            if(i!=node.getAttributes().getLength()-1)
                s=s+" and ";
        }
        s="["+s+"]";
        return s;
    }

    public static String getXPath(Node node) {
        Node parent = node.getParentNode();
        Node grandParent = parent.getParentNode();
        String s="";
        if(node.hasAttributes())
            s=getAttributeXPath(node);
        if (grandParent == null) {
            return Constants.FORWARD_SLASH + Constants.FORWARD_SLASH + Constants.ASTERISK  + Constants.OPEN_BRACKET + Constants.LOCAL_NAME +
                    Constants.SINGLE_QUOTE+ node.getLocalName() + Constants.SINGLE_QUOTE + Constants.CLOSED_BRACKET;
        }
        return getXPath(parent) + Constants.FORWARD_SLASH + Constants.ASTERISK + Constants.OPEN_BRACKET + Constants.LOCAL_NAME +
                Constants.SINGLE_QUOTE+ node.getLocalName() + Constants.SINGLE_QUOTE + Constants.CLOSED_BRACKET+s;
    }

    public static Boolean IsLeaf(Node node) {
        if (node.getChildNodes().getLength() == 1 && !node.getNodeName().equals("xsl:if")) {
            return true;
        }
        return false;
    }

    public static String XMLToString(NodeList nodeList) throws IOException {
        String result="";
        try
        {
            StringWriter sw = new StringWriter();
            Transformer serializer = TransformerFactory.newInstance().newTransformer();
            serializer.transform(new DOMSource(nodeList.item(0)), new StreamResult(sw));
            result = sw.toString();
            return RemoveXSLAmbigousChars(result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    public static String RemoveXSLAmbigousChars(String mapping) {
        mapping = mapping.replaceAll("&lt;" , Constants.START_TAG_OPEN);
        mapping = mapping.replaceAll("&gt;" , Constants.END_TAG_CLOSE);
        mapping = mapping.replaceAll("&#13;" , Constants.NEW_LINE);
        return  mapping;
    }

    public static String Execute(String ipFilePath, String opFilePath,boolean direction) {

            try {
                NodeList opNodeList = ParseXMLFile(opFilePath);
                opNodeList=AddConditions(opNodeList,direction);
                NodeList ipNodeList = ParseXMLFile(ipFilePath);
                // nodeList is not iterable, so we are using for loop
                for (int itr = 0; itr < opNodeList.getLength(); itr++) {
                    //System.out.println(opNodeList.item(itr).getNodeName()+"  "+opNodeList.item(itr).getParentNode().getNodeName()+" "+IsLeaf(opNodeList.item(itr)));
                    int flag = 0;
                    String res = "";
                    Node opNode = opNodeList.item(itr);
                    if (IsLeaf(opNode)) {
                        String opText = opNode.getTextContent();
                        String xPath = "";
                        for (int itr2 = 0; itr2 < ipNodeList.getLength(); itr2++) {
                            Node ipNode = ipNodeList.item(itr2);

                            if (opText.equals(ipNode.getTextContent())) {

                                if (flag > 0)
                                    res += Constants.NEW_LINE;

                                flag++;
                                res +=
                                        Constants.START_TAG_OPEN + Constants.XSL_VALUE + Constants.SPACE +
                                                Constants.SELECT +
                                                Constants.DOUBLE_QUOTES + getXPath(ipNode) + Constants.DOUBLE_QUOTES +
                                                Constants.FORWARD_SLASH + Constants.END_TAG_CLOSE;
                                xPath = getXPath(ipNode);
                            }
                        }
                        if (flag > 1) {
                            res = Constants.BEGIN_CHOOSE + res + Constants.END_CHOOSE;
                            opNodeList.item(itr).setTextContent(res);

                        } else if (flag == 1) {
                            opNodeList.item(itr).setTextContent(res);
                        }
                        if (opNode.getParentNode().getNodeName().equals("xsl:if")) {
                            ((Element)opNode.getParentNode()).setAttribute("test",xPath);
                        }
                    }
                    flag = 0;
                }

                String mapping = XMLToString(opNodeList);
                mapping = mapping.replaceAll(Constants.XML_VERSION, "");

                return mapping;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "";
        }
    public static void returnTablesMapping(String ipFilePath, String opFilePath) {

        try {

            NodeList opNodeList = ParseXMLFile(opFilePath);
            NodeList ipNodeList = ParseXMLFile(ipFilePath);

            // nodeList is not iterable, so we are using for loop
            for (int itr = 0; itr < opNodeList.getLength(); itr++) {
                int flag = 0;
                String res = "";

                Node opNode = opNodeList.item(itr);
                if (IsLeaf(opNode)) {

                    String opText = opNode.getTextContent();

                    for (int itr2 = 0; itr2 < ipNodeList.getLength(); itr2++) {
                        Node ipNode = ipNodeList.item(itr2);

                        if (opText.equals(ipNode.getTextContent())) {

                            if (flag > 0)
                                res += Constants.NEW_LINE;

                            flag++;
                            res +=getAbsXpath(ipNode);
                        }
                    }
                    System.out.println(getAbsXpath(opNode)+","+res);
                }
                if (flag > 1) {
                    res = Constants.BEGIN_CHOOSE + res + Constants.END_CHOOSE;
                    opNodeList.item(itr).setTextContent(res);

                } else if (flag == 1) {
                    opNodeList.item(itr).setTextContent(res);
                } else {
                    res = Constants.BEGIN_NOT_FOUND + res + Constants.END_NOT_FOUND;
                }

                flag = 0;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getAbsXpath(Node node) {
        Node parent = node.getParentNode();
        Node grandParent = parent.getParentNode();

        if (grandParent == null) {
            return Constants.FORWARD_SLASH + node.getLocalName();
        }
        return getAbsXpath(parent) + Constants.FORWARD_SLASH + node.getLocalName();
    }
}