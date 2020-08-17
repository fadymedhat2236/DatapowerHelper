import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DealingWithFiles {

    public static void createFolder(String path) {
        //Creating a File object
        File file = new File(path);
        //Creating the directory
        boolean bool = file.mkdir();
    }

    public static void createServiceFolders() {
        String path = Constants.TFSFilesPath+Constants.domainName;
        createFolder(path);

        path = Constants.serviceFilesPath+Constants.serviceName;
        createFolder(path);

        path = Constants.serviceFilesPath+Constants.serviceName+"/CONFIGURATION";
        createFolder(path);

        path = Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION";
        createFolder(path);

        path = Constants.serviceFilesPath+Constants.serviceName+"/temp";
        createFolder(path);

        path = Constants.stubsFilesPath+Constants.serviceName+"_Stub";
        createFolder(path);


        path = Constants.sampleMessagesFilesPath+Constants.serviceName;
        createFolder(path);

    }

    public static void writeToFile(String data,String path) {
        File file = new File(path);
        FileWriter fr = null;
        PrintWriter pr=null;
        if(!file.exists()){
            try {
                fr = new FileWriter(file,true);
                pr = new PrintWriter(file);
                pr.flush();
                fr.write(data);
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                //close resources
                try {
                    fr.close();
                    pr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String readFromFile(String path) throws IOException {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(path)));
        return data;
    }
}