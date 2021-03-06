public class CreateServiceTransformation {
    public static void createTransformationTemplates() {

        DealingWithFiles.writeToFile(Constants.beginXSL+GetMapping.Execute(Constants.XMLFilesfixedPath+Constants.serviceName+"\\"+Constants.inputRequest,Constants.XMLFilesfixedPath+Constants.serviceName+"\\"+Constants.outputRequest,false)+Constants.endXSL,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/"+Constants.consumer+"-"+Constants.backendName+"-"+Constants.serviceName+"-Rq.xsl");
        DealingWithFiles.writeToFile(Constants.beginXSL+GetMapping.Execute(Constants.XMLFilesfixedPath+Constants.serviceName+"\\"+Constants.inputResponse,Constants.XMLFilesfixedPath+Constants.serviceName+"\\"+Constants.outputResponse,true)+Constants.endXSL,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/"+Constants.consumer+"-"+Constants.backendName+"-"+Constants.serviceName+"-Rs.xsl");
        DealingWithFiles.writeToFile(Constants.errorTemplate,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/"+Constants.consumer+"-"+Constants.backendName+"-"+Constants.serviceName+"-Err.xsl");
        DealingWithFiles.writeToFile(Constants.StubTemplate,Constants.stubsFilesPath+Constants.serviceName+"_Stub\\"+Constants.serviceName+"_Stub.xsl");
        /*DealingWithFiles.writeToFile(Constants.beginXSL+" "+Constants.endXSL,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/"+Constants.consumer+"-"+Constants.backendName+"-"+Constants.serviceName+"-Rq.xsl");
        DealingWithFiles.writeToFile(Constants.beginXSL+" "+Constants.endXSL,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/"+Constants.consumer+"-"+Constants.backendName+"-"+Constants.serviceName+"-Rs.xsl");
        DealingWithFiles.writeToFile(Constants.errorTemplate,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/"+Constants.consumer+"-"+Constants.backendName+"-"+Constants.serviceName+"-Err.xsl");
        DealingWithFiles.writeToFile(Constants.StubTemplate,Constants.stubsFilesPath+"/"+Constants.serviceName+"_Stub/"+Constants.serviceName+"_Stub.xsl");*/
    }
}
