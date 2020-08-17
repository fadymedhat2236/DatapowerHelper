import java.util.HashMap;

public class Constants {
    public static final String serviceName="BillQuerySGW";
    public static final String consumer="ESB";
    public static final String backendName="SADAD";
    public static final String domainURL="https://192.168.126.128:9090";
    public static final String WSDLFragmentID="http://www.SABB.com/iWallet/";
    public static final String partner="SADAD";
    public static final String domainName="SGW";
    //for the files
    public static final String TFSFilesPath="D:\\Projects\\BSF\\Middleware Services Migration\\Development\\DP\\SourceCode\\";
    public static final String serviceFilesPath=TFSFilesPath+domainName+"\\";
    public static final String stubsFilesPath=TFSFilesPath+"Stubs\\";
    public static final String sampleMessagesFilesPath="D:\\Projects\\BSF\\Middleware Services Migration\\Development\\DP\\Testing Evidence\\Sample Messages\\";
    public static final String StubMatchXpath="REQUEST";
    public static final String ServiceFSHPort="8011";
    public static final String StubFSHPort="9200";

    //Configuration file
    public static final String AUDIT_FLG="true";
    public static final String DUMP_REQUEST_FLG="true";
    public static final String DUMP_BACKEND_REQUEST_FLG="true";
    public static final String DUMP_BACKEND_RESPONSE_FLG="true";
    public static final String DUMP_RESPONSE_FLG="true";

    //endpoints file
    public static final String EP_ID[]={"SADAD-BillQuerySGW"};
    public static final String EP_PROTOCOL[]={"HTTP"};
    public static final String EP_REQUEST[]={"http://127.0.0.1:"+Constants.StubFSHPort};
    public static final String EP_RESPONSE[]={null,"B2BiWalletComplaintMng"};
    public static final String EP_QMGR="DPQMGR_GP";
    public static final String EP_EXPIRY="25000";
    public static final String EP_TIMEOUT="30000";

    //auditVARS file
    //,{"UsrDef4","IRPLY","ReceiptDt"}
    public static final String auditVars[][] ={{"UsrDef1","REQ","BillKey"},{"UsrDef2","REQ","AccountKey"},{"UsrDef3","REQ","POINum"},
            {"UsrDef4","REQ","POIType"},{"UsrDef5","REQ","BillerId"}};
    //for the error mapping/DDCAPGWRs/MsgRsHdr/Status/StatusCode
    public static final String BEFixedPath="//*[local-name()='Fault']/*[local-name()='detail']/*[local-name()='PresentmentFault']/*";
    public static final String FixedPath="//*[local-name()='MsgRsHdr']/*[local-name()='Status']/*";
    public static final String errorPaths[]={"Code","Description","StatusCode","StatusDesc"};


    //transformation files
    public static final String XMLFilesfixedPath="D:\\Projects\\BSF\\Middleware Services Migration\\Development\\DP\\Testing Evidence\\Sample Messages\\";
    public static final String inputRequest="inputRequest.xml";
    public static final String outputRequest="outputRequest.xml";
    public static final String inputResponse="inputResponse.xml";
    public static final String outputResponse="outputResponse.xml";
    public static final String errorTemplate="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"\n" +
            "    xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" xmlns:ejd=\"http://www.ejada.com\"\n" +
            "    xmlns:em=\"http://www.ejada.com/ERROR_MAPPING/\"\n" +
            "\txmlns:dp=\"http://www.datapower.com/extensions\"\n" +
            "    xmlns:dpconfig=\"http://www.datapower.com/param/config\"\n" +
            "    extension-element-prefixes=\"dp\" \n" +
            "\texclude-result-prefixes=\"xs dp dpconfig\" version=\"2.0\">\n" +
            "    <xsl:import href=\"local:/Services/LIBS/UTIL.xsl\" dp:ignore-multiple=\"yes\"/>\n" +
            "    \n" +
            "    <xsl:template match=\"/\">\n" +
            "        <xsl:call-template name=\"generate-ESB-general-error\">\n" +
            "            <xsl:with-param name=\"msgRoot\" select=\"''\"></xsl:with-param>\n" +
            "        </xsl:call-template>\n" +
            "    </xsl:template>\n" +
            "</xsl:stylesheet>\n";

    public static final String StubMsg="<EPmtReportDownloadRs>\n" +
            "\t<Header>\n" +
            "\t\t<OpHdr>\n" +
            "\t\t\t<OpHdrVersNum/>\n" +
            "\t\t\t<OpDefin>\n" +
            "\t\t\t\t<SvceId>B2B</SvceId>\n" +
            "\t\t\t\t<OpId>RPRTDNLD</OpId>\n" +
            "\t\t\t\t<SvceVersNum/>\n" +
            "\t\t\t</OpDefin>\n" +
            "\t\t</OpHdr>\n" +
            "\t\t<ISMHdr>\n" +
            "\t\t\t<ISMHdrVersNum/>\n" +
            "\t\t\t<AppName>B2B</AppName>\n" +
            "\t\t\t<UserId/>\n" +
            "\t\t\t<EmplyUserId>SABB000001</EmplyUserId>\n" +
            "\t\t\t<ClntId>B2B</ClntId>\n" +
            "\t\t\t<ClntHostId>MUSANED001</ClntHostId>\n" +
            "\t\t\t<GloblLogId>644974</GloblLogId>\n" +
            "\t\t\t<MsgInstcId/>\n" +
            "\t\t\t<UserDviceId/>\n" +
            "\t\t\t<InbndChanlId/>\n" +
            "\t\t\t<SessnId/>\n" +
            "\t\t\t<MsgCreatTmsp>2020-01-07T13:41:59</MsgCreatTmsp>\n" +
            "\t\t\t<RespeCde>\n" +
            "\t\t\t\t<RtrnCde>00</RtrnCde>\n" +
            "\t\t\t\t<ReasCde>00000</ReasCde>\n" +
            "\t\t\t\t<DiagText>Success</DiagText>\n" +
            "\t\t\t</RespeCde>\n" +
            "\t\t</ISMHdr>\n" +
            "\t</Header>\n" +
            "\t<Body>\n" +
            "\t\t<ReportData>\n" +
            "\t\t\t<![CDATA[MUSANED001,20190901|1,36153,20200107,5809.15,5734.91|1,36155,20200107,7652.40,.00|1,36156,20200107,1785.00,1761.46|1,36157,20200107,1942.00,1916.49|1,36158,20200107,9256.80,.00|1,36159,20200107,5157.60,5098.04|]]>\n" +
            "\t\t</ReportData>\n" +
            "\t</Body>\n" +
            "</EPmtReportDownloadRs>";

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
            "\t<xsl:import href=\"local:/Services/LIBS/UTIL.xsl\" dp:ignore-multiple=\"yes\"/>\n" +
            "\t<xsl:template match=\"/\">";
    public static final String endXSL="\t</xsl:template>\n" +
            "</xsl:stylesheet>";
    public static HashMap<String,String> getConditionTags(boolean direction){
        HashMap <String,String> conditionTags = new HashMap<String,String>();

        //0 for request 1 for response
        if(direction==false){
            conditionTags.put("AccessChannel"," ");
            conditionTags.put("ProxyCustId"," ");
        }
        else{

        }
        return conditionTags;
    }

}
