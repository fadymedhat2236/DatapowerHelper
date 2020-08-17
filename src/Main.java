import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {

        try {
            /*******************first create service folders*******************/
            DealingWithFiles.createServiceFolders();

            /*******************for the configuration files*******************/
            CreateServiceConfiguration.createConfigurationFile();
            CreateServiceConfiguration.createEndPointsFile();
            CreateServiceConfiguration.createauditVarsFile();

            /*******************for the transformtion templates*******************/
            //CreateServiceTransformation.createTransformationTemplates();

            DPScripts.generateStubConfiguration();
            DPScripts.generateMPGWConfiguration();
            //DPScripts.generateWSPConfiguration();

            //GetMapping.returnTablesMapping("D:\\Test\\RequestInput.xml","D:\\Test\\RequestOutput.xml");
            //System.out.println(GetMapping.Execute("D:\\Test\\RequestInput.xml","D:\\Test\\RequestOutput.xml",false));

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}