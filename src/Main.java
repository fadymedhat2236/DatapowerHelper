import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {


    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {

        /*
        //first create service folders
        DealingWithFiles.createServiceFolders();;

        //for the configuration files
        CreateServiceConfiguration.createConfigurationFile();
        CreateServiceConfiguration.createEndPointsFile();
        CreateServiceConfiguration.createauditVarsFile();

        //for the transformtion templates
        CreateServiceTransformation.createTransformationTemplates();

        DPScripts.generateStubConfiguration();
        DPScripts.generateWSPConfiguration();
         */
        System.out.println(GetMapping.Execute("C:\\Users\\fmedhat\\Desktop\\input.xml","C:\\Users\\fmedhat\\Desktop\\output.xml"));

    }

}