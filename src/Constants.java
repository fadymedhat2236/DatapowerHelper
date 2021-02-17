import java.util.HashMap;

public class Constants {
    public static final String serviceName="BankRefundReconRptSGW";
    public static final String consumer="SADAD";
    public static final String backendName="ESB";
    public static final String domainURL="https://192.168.126.128:9090";
    public static final String WSDLFragmentID="http://www.SABB.com/iWallet/";
    public static final String partner="SADAD";
    public static final String domainName="SADADBank_GW";
    //for the files
    public static final String TFSFilesPath="D:\\Projects\\BSF\\Middleware Services Migration\\Development\\DP\\SourceCode\\";
    public static final String serviceFilesPath=TFSFilesPath+domainName+"\\Services\\";
    public static final String stubsFilesPath=TFSFilesPath+"Stubs\\Services\\";
    public static final String sampleMessagesFilesPath="D:\\Projects\\BSF\\Middleware Services Migration\\Development\\DP\\Testing Evidence\\Sample Messages\\";
    public static final String StubMatchXpath="SADADPaymentNotificationRq";
    public static final String ServiceFSHPort="8014";
    public static final String StubFSHPort="9214";

    //Configuration file
    public static final String AUDIT_FLG="true";
    public static final String DUMP_REQUEST_FLG="true";
    public static final String DUMP_BACKEND_REQUEST_FLG="true";
    public static final String DUMP_BACKEND_RESPONSE_FLG="true";
    public static final String DUMP_RESPONSE_FLG="true";

    //endpoints file
    public static final String EP_ID[]={"ESB-BankRefundReconRptSGW"};
    //public static final String EP_PROTOCOL[]={"HTTP","MQ"};
    //public static final String EP_REQUEST[]={"http://127.0.0.1:"+Constants.StubFSHPort};
    //public static final String EP_RESPONSE[]={null,"B2BiWalletComplaintMng"};
    public static final String EP_PROTOCOL[]={"MQ"};
    public static final String EP_REQUEST[]={"SADADRefundReconciliationReportRq"};
    public static final String EP_RESPONSE[]={"X"};
    public static final String EP_QMGR="DP_QMGR_GP";
    public static final String EP_EXPIRY="25000";
    public static final String EP_TIMEOUT="30000";

    //auditVARS file
    //,{"UsrDef4","IRPLY","ReceiptDt"}
    public static final String auditVars[][] ={{"UsrDef1","REQ","FuncId"},{"UsrDef2","REQ","PrcDt"}
    };
    //for the error mapping
    public static final String BEFixedPath="//*[local-name()='MsgRsHdr']/*";
    public static final String FixedPath="//*[local-name()='Fault']/*[local-name()='detail']/*[local-name()='UploadFault']/*";
    public static final String errorPaths[]={"StatusCode","SPStatusInfo']/*[local-name()='StatusShortDesc']","Code","Description"};


    //transformation files
    public static final String XMLFilesfixedPath="D:\\Projects\\BSF\\Middleware Services Migration\\Development\\DP\\Testing Evidence\\Sample Messages\\";
    public static final String inputRequest="RequestInput.xml";
    public static final String outputRequest="RequestOutput.xml";
    public static final String inputResponse="ResponseInput.xml";
    public static final String outputResponse="ResponseOutput.xml";
    public static final String errorTemplate="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"\n" +
            "    xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" xmlns:ejd=\"http://www.ejada.com\"\n" +
            "    xmlns:em=\"http://www.ejada.com/ERROR_MAPPING/\" xmlns:dp=\"http://www.datapower.com/extensions\"\n" +
            "    xmlns:dpconfig=\"http://www.datapower.com/param/config\" extension-element-prefixes=\"dp\"\n" +
            "    exclude-result-prefixes=\"xs dp dpconfig\" version=\"2.0\">\n" +
            "    <xsl:import href=\"local:/Services/LIBS/SADAD_UTIL.xsl\" dp:ignore-multiple=\"yes\"/>\n" +
            "    <xsl:template match=\"/\">\n" +
            "        <xsl:call-template name=\"generate-SADAD-general-Error\">\n" +
            "            <xsl:with-param name=\"msg\" select=\"*\"></xsl:with-param>\n" +
            "            <xsl:with-param name=\"msgRoot\" select=\"''\"></xsl:with-param>\n" +
            "        </xsl:call-template>\n" +
            "    </xsl:template>\n" +
            "</xsl:stylesheet>";

    public static final String StubMsg="<ns:MessageHeader>\n" +
            "    \t\t<ns:ServiceInitiatorKey>?</ns:ServiceInitiatorKey>\n" +
            "    \t\t<ns:ServiceProviderKey>?</ns:ServiceProviderKey>\n" +
            "    \t\t<ns:ServiceConsumerId>?</ns:ServiceConsumerId>\n" +
            "    \t\t<ns:RqUID>73496a76-e095-11ea-87d0-0242ac130003</ns:RqUID>\n" +
            "    \t\t<ns:Date>2021-11-06T16:10:08</ns:Date>\n" +
            "    \t\t<ns:Lang>en-gb</ns:Lang>\n" +
            "    \t</ns:MessageHeader>";

    public static final String StubTemplate="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"\n" +
            "    xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"\n" +
            "    xmlns:dp=\"http://www.datapower.com/extensions\"\n" +
            "    xmlns:dpconfig=\"http://www.datapower.com/param/config\"\n" +
            "    exclude-result-prefixes=\"xs dp dpconfig\"\n" +
            "    version=\"2.0\">\n" +
            "    <xsl:template match=\"/\">\n" +
            "\n" +Constants.StubMsg+
            "    </xsl:template>    \n" +
            "</xsl:stylesheet>";

    /***************  CreateService  ************/
    public static String BEGIN_CHOOSE = "<!--****begin choose ****-->";
    public static String END_CHOOSE = "<!--****end   choose ****-->";
    public static String BEGIN_NOT_FOUND = "<!--****begin not found ****-->";
    public static String END_NOT_FOUND = "<!--****end   not found ****-->";
    public static String START_TAG_OPEN = "<";
    public static String END_TAG_CLOSE = ">";
    public static String DOUBLE_QUOTES = "\"";
    public static String SPACE = " ";
    public static String NEW_LINE = "\r\n";
    public static String FORWARD_SLASH = "/";
    public static String OPEN_BRACKET = "[";
    public static String CLOSED_BRACKET = "]";
    public static String ASTERISK = "*";
    public static String SINGLE_QUOTE = "'";
    public static String XML_VERSION = "<\\?xml version=\"1.0\" encoding=\"UTF-8\"\\?>";
    public static String XSL_VALUE = "xsl:value-of";
    public static String SELECT = "select=";
    public static String LOCAL_NAME = "local-name()=";


    public static final String beginXSL="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"\n" +
            "    xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"\n" +
            "    xmlns:dp=\"http://www.datapower.com/extensions\"\n" +
            "    xmlns:dpconfig=\"http://www.datapower.com/param/config\"\n" +
            "    extension-element-prefixes=\"dp\" \n" +
            "    exclude-result-prefixes=\"xs dp dpconfig\"\n" +
            "    version=\"2.0\">\n" +
            "\t<xsl:import href=\"local:/Services/LIBS/SADAD_UTIL.xsl\" dp:ignore-multiple=\"yes\"/>\n" +
            "\t<xsl:template match=\"/\">";
    public static final String endXSL="\t</xsl:template>\n" +
            "</xsl:stylesheet>";
    public static HashMap<String,String> getConditionTags(boolean direction){
        HashMap <String,String> conditionTags = new HashMap<String,String>();

        //0 for request 1 for response
        if(direction==false){
            conditionTags.put("Filters"," ");
            conditionTags.put("DueDateRange"," ");
            conditionTags.put("AmtRange"," ");
            conditionTags.put("SupplierName"," ");
            conditionTags.put("InvoiceStatus"," ");
            conditionTags.put("AdditionalInfo"," ");
            conditionTags.put("Paging"," ");
            conditionTags.put("PageSize"," ");
            conditionTags.put("TotalNumRecords"," ");
        }
        else{
            conditionTags.put("BillStatus"," ");
            conditionTags.put("AdditionalInfo"," ");
        }
        return conditionTags;
    }

}
