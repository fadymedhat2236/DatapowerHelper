public class Constants {
    public static final String serviceName="B2BBillMng";
    public static final String backendName="ESB";
    public static final String domainURL="https://192.168.179.128:9090";
    public static final String WSDLFragmentID="http://www.Ejada.com";
    //for the files
    public static final String serviceFilesPath="D:\\Projects\\SABB_TFS\\(Common)\\Development\\SourceCode\\Gateway_DP\\Services\\";
    public static final String StubMatchXpath="B2BBillMngRq";
    public static final String StubFSHPort="2238";

    //Configuration file
    public static final String AUDIT_FLG="true";
    public static final String DUMP_REQUEST_FLG="true";
    public static final String DUMP_BACKEND_REQUEST_FLG="true";
    public static final String DUMP_BACKEND_RESPONSE_FLG="true";
    public static final String DUMP_RESPONSE_FLG="true";

    //endpoints file
    public static final String EP_ID[]={"ESB-B2BBillMng"};
    public static final String EP_PROTOCOL[]={"HTTP","MQ"};
    public static final String EP_REQUEST[]={"http://192.168.179.128:"+Constants.StubFSHPort,"B2BBillMngRq"};
    public static final String EP_RESPONSE[]={"B2BBillMngRs"};
    public static final String EP_QMGR="EAIQMGR";
    public static final String EP_EXPIRY="25000";
    public static final String EP_TIMEOUT="30000";

    //auditVARS file
    public static final String auditVars[][] ={{"UsrDef1","REQ","BillNum"}};
    //for the error mapping

    public static final String BEFixedPath="//*[local-name()='Header']/*[local-name()='ISMHdr']/*[local-name()='ReaspeCde']/*";
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

    public static final String StubMsg="<B2BBillMngCreateRs>\n" +
            "    <Header>\n" +
            "        <Sender>Sender0</Sender>\n" +
            "        <Receiver>Receiver0</Receiver>\n" +
            "        <MessageType>MessageType0</MessageType>\n" +
            "        <MessageDescription>MessageDescription0</MessageDescription>\n" +
            "        <TimeStamp>2006-05-04T18:13:51.0</TimeStamp>\n" +
            "        <SystemID>SystemID</SystemID>\n" +
            "    </Header>\n" +
            "    <Body>\n" +
            "        <DocumentID>50</DocumentID>\n" +
            "        <StatusCode>Status</StatusCode>\n" +
            "        <StatusDetails>StatusDetails0</StatusDetails>\n" +
            "    </Body>\n" +
            "</B2BBillMngCreateRs>";

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
