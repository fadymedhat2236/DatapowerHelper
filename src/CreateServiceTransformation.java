public class CreateServiceTransformation {
    public static void createTransformationTemplates() {
        /*
        DealingWithFiles.writeToFile(Constants.beginXSL+GetMapping.Execute(Constants.XMLFilesfixedPath+Constants.inputRequest,Constants.XMLFilesfixedPath+Constants.outputRequest)+Constants.endXSL,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/SABB-"+Constants.backendName+"-"+Constants.serviceName+"-Rq.xsl");
        DealingWithFiles.writeToFile(Constants.beginXSL+GetMapping.Execute(Constants.XMLFilesfixedPath+Constants.inputResponse,Constants.XMLFilesfixedPath+Constants.outputResponse)+Constants.endXSL,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/SABB-"+Constants.backendName+"-"+Constants.serviceName+"-Rs.xsl");
        DealingWithFiles.writeToFile(Constants.errorTemplate,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/SABB-"+Constants.backendName+"-"+Constants.serviceName+"-Err.xsl");
        DealingWithFiles.writeToFile(Constants.StubTemplate,Constants.serviceFilesPath+Constants.serviceName+"_Stub.xsl");
        */
        DealingWithFiles.writeToFile(Constants.beginXSL+" "+Constants.endXSL,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/SABB-"+Constants.backendName+"-"+Constants.serviceName+"-Rq.xsl");
        DealingWithFiles.writeToFile(Constants.beginXSL+" "+Constants.endXSL,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/SABB-"+Constants.backendName+"-"+Constants.serviceName+"-Rs.xsl");
        DealingWithFiles.writeToFile(Constants.errorTemplate,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/SABB-"+Constants.backendName+"-"+Constants.serviceName+"-Err.xsl");
        DealingWithFiles.writeToFile(Constants.StubTemplate,Constants.stubsFilesPath+"/"+Constants.serviceName+"_Stub/"+Constants.serviceName+"_Stub.xsl");
    }
}
