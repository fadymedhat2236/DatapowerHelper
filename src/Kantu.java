public class Kantu {
    public static void createServiceFolders(){
        String temp="{\n" +
                "  \"Name\": \"CreateServiceFiles\",\n" +
                "  \"CreationDate\": \"2019-12-29\",\n" +
                "  \"Commands\": [\n" +
                "    {\n" +
                "      \"Command\": \"open\",\n" +
                "      \"Target\": \"domainURL/system/FileMaintenance\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"selectFrame\",\n" +
                "      \"Target\": \"id=mainFrame\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=local:\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=Services\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=Actions...@POS=9\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"clickAndWait\",\n" +
                "      \"Target\": \"link=Create Subdirectory\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"id=subdirName\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"type\",\n" +
                "      \"Target\": \"id=subdirName\",\n" +
                "      \"Value\": \"serviceName\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"clickAndWait\",\n" +
                "      \"Target\": \"id=btn_confirm_create\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"open\",\n" +
                "      \"Target\": \"domainURL/system/FileMaintenance\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"selectFrame\",\n" +
                "      \"Target\": \"id=mainFrame\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=local:\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=Services\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id='local__Services_serviceName_diractions']\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"clickAndWait\",\n" +
                "      \"Target\": \"link=Create Subdirectory\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"id=subdirName\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"type\",\n" +
                "      \"Target\": \"id=subdirName\",\n" +
                "      \"Value\": \"CONFIGURATION\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"clickAndWait\",\n" +
                "      \"Target\": \"id=btn_confirm_create\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"open\",\n" +
                "      \"Target\": \"domainURL/system/FileMaintenance\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"selectFrame\",\n" +
                "      \"Target\": \"id=mainFrame\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=local:\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=Services\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id='local__Services_serviceName_diractions']\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"clickAndWait\",\n" +
                "      \"Target\": \"link=Create Subdirectory\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"id=subdirName\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"type\",\n" +
                "      \"Target\": \"id=subdirName\",\n" +
                "      \"Value\": \"TRANSFORMATION\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"clickAndWait\",\n" +
                "      \"Target\": \"id=btn_confirm_create\",\n" +
                "      \"Value\": \"\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        temp=temp.replaceAll("domainURL",Constants.domainURL);
        temp=temp.replaceAll("serviceName",Constants.serviceName);
        String path=Constants.serviceFilesPath+"/temp/kantuCreateFolders.txt";
        DealingWithFiles.writeToFile(temp,path);
    }
    public static void uploadConfigurationFiles(){
        String temp="{\n" +
                "  \"Name\": \"UploadConfigurationFiles\",\n" +
                "  \"CreationDate\": \"2019-12-29\",\n" +
                "  \"Commands\": [\n" +
                "    {\n" +
                "      \"Command\": \"open\",\n" +
                "      \"Target\": \"domainURL/system/FileMaintenance\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"selectFrame\",\n" +
                "      \"Target\": \"id=mainFrame\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=local:\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=Services\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=serviceName\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id='local__Services_serviceName_CONFIGURATION_diractions']\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"clickAndWait\",\n" +
                "      \"Target\": \"link=Upload Files\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id='upload_file_0']\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"XType\",\n" +
                "      \"Target\": \"backendName-ENDPOINTS.xml\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"XType\",\n" +
                "      \"Target\": \"${KEY_ENTER}\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id=\\\"fileUploadFileTable\\\"]/tfoot/tr/td[3]/input\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id='upload_file_1']\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"XType\",\n" +
                "      \"Target\": \"AUDIT_VARS.xml\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"XType\",\n" +
                "      \"Target\": \"${KEY_ENTER}\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id=\\\"fileUploadFileTable\\\"]/tfoot/tr/td[3]/input\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id='upload_file_2']\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"XType\",\n" +
                "      \"Target\": \"CONFIGURATION.xml\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"XType\",\n" +
                "      \"Target\": \"${KEY_ENTER}\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id=\\\"fileUploadFileTable\\\"]/tfoot/tr/td[3]/input\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"clickAndWait\",\n" +
                "      \"Target\": \"id=btn_upload_file\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"clickAndWait\",\n" +
                "      \"Target\": \"id=btn_continue\",\n" +
                "      \"Value\": \"\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        temp=temp.replaceAll("domainURL",Constants.domainURL);
        temp=temp.replaceAll("serviceName",Constants.serviceName);
        temp=temp.replaceAll("backendName",Constants.backendName);
        String path=Constants.serviceFilesPath+"/temp/kantuUploadConfig.txt";
        DealingWithFiles.writeToFile(temp,path);
    }
    public static void uploadTransformationFiles(){
        String temp="{\n" +
                "  \"Name\": \"uploadTransformationFiles\",\n" +
                "  \"CreationDate\": \"2019-12-29\",\n" +
                "  \"Commands\": [\n" +
                "    {\n" +
                "      \"Command\": \"open\",\n" +
                "      \"Target\": \"domainURL/system/FileMaintenance\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"selectFrame\",\n" +
                "      \"Target\": \"id=mainFrame\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=local:\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=Services\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"link=serviceName\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id='local__Services_serviceName_TRANSFORMATION_diractions']\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"clickAndWait\",\n" +
                "      \"Target\": \"link=Upload Files\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id='upload_file_0']\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"XType\",\n" +
                "      \"Target\": \"SABB-backendName-serviceName-Err.xsl\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"XType\",\n" +
                "      \"Target\": \"${KEY_ENTER}\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id=\\\"fileUploadFileTable\\\"]/tfoot/tr/td[3]/input\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id='upload_file_1']\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"XType\",\n" +
                "      \"Target\": \"SABB-backendName-serviceName-Rq.xsl\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"XType\",\n" +
                "      \"Target\": \"${KEY_ENTER}\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id=\\\"fileUploadFileTable\\\"]/tfoot/tr/td[3]/input\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id='upload_file_2']\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"XType\",\n" +
                "      \"Target\": \"SABB-backendName-serviceName-Rs.xsl\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"XType\",\n" +
                "      \"Target\": \"${KEY_ENTER}\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"click\",\n" +
                "      \"Target\": \"xpath=//*[@id=\\\"fileUploadFileTable\\\"]/tfoot/tr/td[3]/input\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"clickAndWait\",\n" +
                "      \"Target\": \"id=btn_upload_file\",\n" +
                "      \"Value\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Command\": \"clickAndWait\",\n" +
                "      \"Target\": \"id=btn_continue\",\n" +
                "      \"Value\": \"\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        temp=temp.replaceAll("domainURL",Constants.domainURL);
        temp=temp.replaceAll("serviceName",Constants.serviceName);
        temp=temp.replaceAll("backendName",Constants.backendName);
        String path=Constants.serviceFilesPath+"/temp/kantuUploadTransform.txt";
        DealingWithFiles.writeToFile(temp,path);
    }
}
