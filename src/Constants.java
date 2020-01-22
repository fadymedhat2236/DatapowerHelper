public class Constants {
    public static final String serviceName="B2BPROMng";
    public static final String backendName="ESB";
    public static final String domainURL="https://192.168.179.128:9090";
    public static final String WSDLFragmentID="http://www.Ejada.com";
    //for the files
    public static final String serviceFilesPath="D:\\Projects\\SABB_TFS\\(Common)\\Development\\SourceCode\\Gateway_DP\\Services\\";
    public static final String StubMatchXpath="EPmtSPMngRq";
    public static final String StubFSHPort="2241";

    //Configuration file
    public static final String AUDIT_FLG="true";
    public static final String DUMP_REQUEST_FLG="true";
    public static final String DUMP_BACKEND_REQUEST_FLG="true";
    public static final String DUMP_BACKEND_RESPONSE_FLG="true";
    public static final String DUMP_RESPONSE_FLG="true";

    //endpoints file
    public static final String EP_ID[]={"ESB-B2BPROMng","ESB-B2BPROMng"};
    public static final String EP_PROTOCOL[]={"HTTP","MQ"};
    public static final String EP_REQUEST[]={"http://192.168.179.128:"+Constants.StubFSHPort,"B2BPROMngRq"};
    public static final String EP_RESPONSE[]={null,"B2BPROMngRs"};
    public static final String EP_QMGR="EAIQMGR";
    public static final String EP_EXPIRY="25000";
    public static final String EP_TIMEOUT="30000";

    //auditVARS file
    public static final String auditVars[][] ={{"UsrDef1","REQ","AcctNum"},{"UsrDef2","REQ","FromDt"},{"UsrDef3","REQ","ToDt"},{"UsrDef4","IRPLY","ReceiptDt"}};
    //for the error mapping

    public static final String BEFixedPath="//*[local-name()='Header']/*[local-name()='ISMHdr']/*[local-name()='RespeCde']/*";
    public static final String FixedPath="//*[local-name()='Body']/*";
    public static final String errorPaths[]={"RtrnCde","ReasCde","DiagText","StatusCode","StatusDetails"};


    //transformation files
    public static final String requestTemplate="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"\n" +
            "    xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"\n" +
            "    xmlns:dp=\"http://www.datapower.com/extensions\"\n" +
            "    xmlns:dpconfig=\"http://www.datapower.com/param/config\"\n" +
            "    xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"\n" +
            "\n" +
            "    extension-element-prefixes=\"dp\" \n" +
            "    exclude-result-prefixes=\"xs dp dpconfig\"\n" +
            "    version=\"2.0\">\n" +
            "    <xsl:import href=\"local:/Framework/LIBS/UTIL.xsl\" dp:ignore-multiple=\"yes\"/>\n" +
            "    <xsl:template match=\"/\">\n" +
            "\n" +
            "        <xsl:call-template name=\"save-SABB-header\">\n" +
            "            <xsl:with-param name=\"msg\" select=\"*\"/>\n" +
            "        </xsl:call-template>\n" +
            "        \n" +
            "    </xsl:template>\n" +
            "</xsl:stylesheet>";
    public static final String responseTemplate="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"\n" +
            "    xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"\n" +
            "    xmlns:dp=\"http://www.datapower.com/extensions\"\n" +
            "    xmlns:dpconfig=\"http://www.datapower.com/param/config\"\n" +
            "    xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"\n" +
            "    xmlns:tem=\"http://tempuri.org/\"\n" +
            "    xmlns:wat=\"http://schemas.datacontract.org/2004/07/WatheqWS\"\n" +
            "    xmlns:e=\"http://schemas.datacontract.org/2004/07/E_Deposit\" xmlns:ned=\"nEdeposite\"\n" +
            "    extension-element-prefixes=\"dp\" \n" +
            "    exclude-result-prefixes=\"xs dp dpconfig soapenv\" version=\"2.0\">\n" +
            "    <xsl:import href=\"local:/Framework/LIBS/UTIL.xsl\" dp:ignore-multiple=\"yes\"/>\n" +
            "    <xsl:template match=\"/\">\n" +
            "        <xsl:variable name=\"functionID\">\n" +
            "            <xsl:copy-of select=\"dp:variable('var://context/Outbound/OpHdr')\"/>\n" +
            "        </xsl:variable>\n" +
            "        <xsl:variable name=\"functionID\" select=\"$functionID/OpHdr/OpDefin/OpId\"/>\n" +
            "\t\t\n" +
            "    </xsl:template>\n" +
            "</xsl:stylesheet>\n";
    public static final String errorTemplate="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"\n" +
            "    xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" xmlns:ejd=\"http://www.ejada.com\"\n" +
            "    xmlns:em=\"http://www.ejada.com/ERROR_MAPPING/\"\n" +
            "\txmlns:dp=\"http://www.datapower.com/extensions\"\n" +
            "    xmlns:dpconfig=\"http://www.datapower.com/param/config\"\n" +
            "    extension-element-prefixes=\"dp\" \n" +
            "\texclude-result-prefixes=\"xs dp dpconfig\" version=\"2.0\">\n" +
            "    <xsl:import href=\"local:/Framework/LIBS/ERROR_MAPPING.xsl\" dp:ignore-multiple=\"yes\"/>\n" +
            "    <xsl:import href=\"local:/Framework/LIBS/UTIL.xsl\" dp:ignore-multiple=\"yes\"/>\n" +
            "    <xsl:variable name=\"errorMapped\">\n" +
            "        <xsl:choose>\n" +
            "\t\t\n" +
            "            <xsl:when test=\"dp:variable('var://service/error-subcode') != '0x00000000'\">\n" +
            "                <xsl:call-template name=\"ejd:find-error-mapping\">\n" +
            "                    <xsl:with-param name=\"code\" select=\"dp:variable('var://service/error-subcode')\"/>\n" +
            "                    <xsl:with-param name=\"backend-name\" select=\"'SABBGW'\"/>\n" +
            "                </xsl:call-template>\n" +
            "            </xsl:when>\n" +
            "            <xsl:otherwise>\n" +
            "                <xsl:call-template name=\"ejd:find-error-mapping\">\n" +
            "                    <xsl:with-param name=\"code\" select=\"dp:variable('var://service/error-code')\"/>\n" +
            "                    <xsl:with-param name=\"backend-name\" select=\"'SABBGW'\"/>\n" +
            "                </xsl:call-template>\n" +
            "            </xsl:otherwise>\n" +
            "        </xsl:choose>\n" +
            "    </xsl:variable>\n" +
            "\n" +
            "\n" +
            "    <xsl:template match=\"/\">\n" +
            "        <B2BCRDtlsInqRs>\n" +
            "            <xsl:call-template name=\"retrieve-SABB-header\">\n" +
            "                <xsl:with-param name=\"RtrnCde\" select=\"$errorMapped/em:MAPPING/em:RETURNCODE\"/>\n" +
            "                <xsl:with-param name=\"ReasCde\" select=\"$errorMapped/em:MAPPING/em:REASONCODE\"/>\n" +
            "                <xsl:with-param name=\"DiagText\" select=\"$errorMapped/em:MAPPING/em:DIAGTEXT\"/>\n" +
            "            </xsl:call-template>\n" +
            "            <Body/>\n" +
            "        </B2BCRDtlsInqRs>\n" +
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
}
