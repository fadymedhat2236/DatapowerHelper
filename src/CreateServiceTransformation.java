public class CreateServiceTransformation {
    public static void createTransformationTemplates(){
        DealingWithFiles.writeToFile(Constants.requestTemplate,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/SABB-"+Constants.backendName+"-"+Constants.serviceName+"-Rq.xsl");
        DealingWithFiles.writeToFile(Constants.responseTemplate,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/SABB-"+Constants.backendName+"-"+Constants.serviceName+"-Rs.xsl");
        DealingWithFiles.writeToFile(Constants.errorTemplate,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/SABB-"+Constants.backendName+"-"+Constants.serviceName+"-Err.xsl");
        DealingWithFiles.writeToFile(Constants.StubTemplate,Constants.serviceFilesPath+Constants.serviceName+"/TRANSFORMATION/Stub_"+Constants.serviceName+".xsl");
    }
}
