import org.w3c.dom.Document;
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

public class GetMapping {
    public static NodeList ParseXMLFile(String filePath) {
        try
        {
            File File = new File(filePath);
            DocumentBuilderFactory Dbf = DocumentBuilderFactory.newInstance();
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

    public static String getXPath(Node node) {
        Node parent = node.getParentNode();
        Node grandParent = parent.getParentNode();

        if (grandParent == null) {
            return Constants.FORWARD_SLASH + Constants.FORWARD_SLASH + Constants.ASTERISK  + Constants.OPEN_BRACKET + Constants.LOCAL_NAME +
                    Constants.SINGLE_QUOTE+ node.getLocalName() + Constants.SINGLE_QUOTE + Constants.CLOSED_BRACKET;
        }
        return getXPath(parent) + Constants.FORWARD_SLASH + Constants.ASTERISK + Constants.OPEN_BRACKET + Constants.LOCAL_NAME +
                Constants.SINGLE_QUOTE+ node.getLocalName() + Constants.SINGLE_QUOTE + Constants.CLOSED_BRACKET;
    }

    public static Boolean IsLeaf(Node node) {
        if (node.getChildNodes().getLength() == 1) {
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

    public static String Execute(String ipFilePath, String opFilePath) {

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
                                res +=
                                        Constants.START_TAG_OPEN + Constants.XSL_VALUE + Constants.SPACE +
                                                Constants.SELECT +
                                                Constants.DOUBLE_QUOTES + getXPath(ipNode) + Constants.DOUBLE_QUOTES +
                                                Constants.FORWARD_SLASH + Constants.END_TAG_CLOSE;
                            }
                        }
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

                String mapping = XMLToString(opNodeList);
                mapping = mapping.replaceAll(Constants.XML_VERSION, "");

                return mapping;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "";
        }
}