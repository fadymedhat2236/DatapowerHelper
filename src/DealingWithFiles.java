import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.UnexpectedException;

public class DealingWithFiles {

    public static void createServiceFolders(){
        String path = Constants.serviceFilesPath+"/"+Constants.serviceName;
        //Creating a File object
        File file = new File(path);
        //Creating the directory
        boolean bool = file.mkdir();

        path = Constants.serviceFilesPath+"/"+Constants.serviceName+"/CONFIGURATION";
        //Creating a File object
        file = new File(path);
        //Creating the directory
        bool = file.mkdir();

        path = Constants.serviceFilesPath+"/"+Constants.serviceName+"/TRANSFORMATION";
        //Creating a File object
        file = new File(path);
        //Creating the directory
        bool = file.mkdir();

        path = Constants.serviceFilesPath+"/"+Constants.serviceName+"/temp";
        //Creating a File object
        file = new File(path);
        //Creating the directory
        bool = file.mkdir();

    }

    public static void writeToFile(String data,String path) {
        File file = new File(path);
        FileWriter fr = null;
        PrintWriter pr=null;
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

    public static String readFromFile(String path) throws IOException {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(path)));
        return data;
    }
}