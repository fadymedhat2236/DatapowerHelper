public class DPScripts {
    public static void generateServiceConfiguration(){
        String temp="<datapower-configuration version=\"3\">\n" +
                "\t<configuration>\n" +
                "\t\t<HTTPSourceProtocolHandler name=\"ServiceName_HTTP_FSH\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<LocalAddress>0.0.0.0</LocalAddress>\n" +
                "\t\t\t<LocalPort>14030</LocalPort>\n" +
                "\t\t\t<HTTPVersion>HTTP/1.1</HTTPVersion>\n" +
                "\t\t\t<AllowedFeatures>\n" +
                "\t\t\t\t<HTTP-1.0>on</HTTP-1.0>\n" +
                "\t\t\t\t<HTTP-1.1>on</HTTP-1.1>\n" +
                "\t\t\t\t<HTTP-2.0>off</HTTP-2.0>\n" +
                "\t\t\t\t<POST>on</POST>\n" +
                "\t\t\t\t<GET>off</GET>\n" +
                "\t\t\t\t<PUT>on</PUT>\n" +
                "\t\t\t\t<HEAD>off</HEAD>\n" +
                "\t\t\t\t<OPTIONS>off</OPTIONS>\n" +
                "\t\t\t\t<TRACE>off</TRACE>\n" +
                "\t\t\t\t<DELETE>off</DELETE>\n" +
                "\t\t\t\t<CONNECT>off</CONNECT>\n" +
                "\t\t\t\t<CustomMethods>off</CustomMethods>\n" +
                "\t\t\t\t<QueryString>on</QueryString>\n" +
                "\t\t\t\t<FragmentIdentifiers>on</FragmentIdentifiers>\n" +
                "\t\t\t\t<DotDot>off</DotDot>\n" +
                "\t\t\t\t<CmdExe>off</CmdExe>\n" +
                "\t\t\t</AllowedFeatures>\n" +
                "\t\t\t<PersistentConnections>on</PersistentConnections>\n" +
                "\t\t\t<MaxPersistentConnectionsReuse>0</MaxPersistentConnectionsReuse>\n" +
                "\t\t\t<AllowCompression>on</AllowCompression>\n" +
                "\t\t\t<AllowWebSocketUpgrade>off</AllowWebSocketUpgrade>\n" +
                "\t\t\t<WebSocketIdleTimeout>0</WebSocketIdleTimeout>\n" +
                "\t\t\t<MaxURLLen>16384</MaxURLLen>\n" +
                "\t\t\t<MaxTotalHdrLen>128000</MaxTotalHdrLen>\n" +
                "\t\t\t<MaxHdrCount>0</MaxHdrCount>\n" +
                "\t\t\t<MaxNameHdrLen>0</MaxNameHdrLen>\n" +
                "\t\t\t<MaxValueHdrLen>0</MaxValueHdrLen>\n" +
                "\t\t\t<MaxQueryStringLen>0</MaxQueryStringLen>\n" +
                "\t\t\t<CredentialCharset>protocol</CredentialCharset>\n" +
                "\t\t\t<HTTP2MaxStreams>100</HTTP2MaxStreams>\n" +
                "\t\t\t<HTTP2MaxFrameSize>16384</HTTP2MaxFrameSize>\n" +
                "\t\t\t<HTTP2StreamHeader>off</HTTP2StreamHeader>\n" +
                "\t\t</HTTPSourceProtocolHandler>\n" +
                "\t\t<Matching name=\"ServiceNameRq_MR\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<MatchRules>\n" +
                "\t\t\t\t<Type>xpath</Type>\n" +
                "\t\t\t\t<HttpTag/>\n" +
                "\t\t\t\t<HttpValue/>\n" +
                "\t\t\t\t<Url/>\n" +
                "\t\t\t\t<ErrorCode/>\n" +
                "\t\t\t\t<XPATHExpression>//*[local-name()='ServiceNameRq']</XPATHExpression>\n" +
                "\t\t\t\t<Method>default</Method>\n" +
                "\t\t\t\t<CustomMethod/>\n" +
                "\t\t\t</MatchRules>\n" +
                "\t\t\t<MatchWithPCRE>off</MatchWithPCRE>\n" +
                "\t\t\t<CombineWithOr>off</CombineWithOr>\n" +
                "\t\t</Matching>\n" +
                "\t\t<StylePolicyAction name=\"ServiceNameRq_Rule_setvar_0\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Type>setvar</Type>\n" +
                "\t\t\t<Input>INPUT</Input>\n" +
                "\t\t\t<ParseSettingsReference>\n" +
                "\t\t\t\t<URL/>\n" +
                "\t\t\t\t<Literal/>\n" +
                "\t\t\t\t<Default/>\n" +
                "\t\t\t</ParseSettingsReference>\n" +
                "\t\t\t<ParseMetricsResultType>none</ParseMetricsResultType>\n" +
                "\t\t\t<InputLanguage>json</InputLanguage>\n" +
                "\t\t\t<TransformLanguage>none</TransformLanguage>\n" +
                "\t\t\t<OutputLanguage>default</OutputLanguage>\n" +
                "\t\t\t<ActionDebug persisted=\"false\">off</ActionDebug>\n" +
                "\t\t\t<TxMode>default</TxMode>\n" +
                "\t\t\t<NamedInOutLocationType>default</NamedInOutLocationType>\n" +
                "\t\t\t<Variable>var://context/service/endpoint-id</Variable>\n" +
                "\t\t\t<Value>Provider-ServiceName</Value>\n" +
                "\t\t\t<SSLClientConfigType>proxy</SSLClientConfigType>\n" +
                "\t\t\t<OutputType>default</OutputType>\n" +
                "\t\t\t<Transactional>off</Transactional>\n" +
                "\t\t\t<SOAPValidation>body</SOAPValidation>\n" +
                "\t\t\t<SQLSourceType>static</SQLSourceType>\n" +
                "\t\t\t<JOSESerializationType>compact</JOSESerializationType>\n" +
                "\t\t\t<JWEEncAlgorithm>A128CBC-HS256</JWEEncAlgorithm>\n" +
                "\t\t\t<JOSEVerifyType>identifiers</JOSEVerifyType>\n" +
                "\t\t\t<JOSEDecryptType>identifiers</JOSEDecryptType>\n" +
                "\t\t\t<JWSVerifyStripSignature>on</JWSVerifyStripSignature>\n" +
                "\t\t\t<Asynchronous>off</Asynchronous>\n" +
                "\t\t\t<ResultsMode>first-available</ResultsMode>\n" +
                "\t\t\t<RetryCount>0</RetryCount>\n" +
                "\t\t\t<RetryInterval>1000</RetryInterval>\n" +
                "\t\t\t<MultipleOutputs>off</MultipleOutputs>\n" +
                "\t\t\t<IteratorType>XPATH</IteratorType>\n" +
                "\t\t\t<Timeout>0</Timeout>\n" +
                "\t\t\t<MethodRewriteType>GET</MethodRewriteType>\n" +
                "\t\t\t<MethodType>POST</MethodType>\n" +
                "\t\t\t<MethodType2>POST</MethodType2>\n" +
                "\t\t</StylePolicyAction>\n" +
                "\t\t<StylePolicyAction name=\"ServiceNameRq_Rule_xform_0\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Type>xform</Type>\n" +
                "\t\t\t<Input>INPUT</Input>\n" +
                "\t\t\t<Transform>local:///Services/ServiceName/TRANSFORMATION/Consumer-Provider-ServiceName-Rq.xsl</Transform>\n" +
                "\t\t\t<ParseSettingsReference>\n" +
                "\t\t\t\t<URL/>\n" +
                "\t\t\t\t<Literal/>\n" +
                "\t\t\t\t<Default/>\n" +
                "\t\t\t</ParseSettingsReference>\n" +
                "\t\t\t<ParseMetricsResultType>none</ParseMetricsResultType>\n" +
                "\t\t\t<InputLanguage>json</InputLanguage>\n" +
                "\t\t\t<TransformLanguage>none</TransformLanguage>\n" +
                "\t\t\t<OutputLanguage>default</OutputLanguage>\n" +
                "\t\t\t<ActionDebug persisted=\"false\">off</ActionDebug>\n" +
                "\t\t\t<TxMode>default</TxMode>\n" +
                "\t\t\t<Output>PIPE</Output>\n" +
                "\t\t\t<NamedInOutLocationType>default</NamedInOutLocationType>\n" +
                "\t\t\t<SSLClientConfigType>proxy</SSLClientConfigType>\n" +
                "\t\t\t<OutputType>default</OutputType>\n" +
                "\t\t\t<Transactional>off</Transactional>\n" +
                "\t\t\t<SOAPValidation>body</SOAPValidation>\n" +
                "\t\t\t<SQLSourceType>static</SQLSourceType>\n" +
                "\t\t\t<JOSESerializationType>compact</JOSESerializationType>\n" +
                "\t\t\t<JWEEncAlgorithm>A128CBC-HS256</JWEEncAlgorithm>\n" +
                "\t\t\t<JOSEVerifyType>identifiers</JOSEVerifyType>\n" +
                "\t\t\t<JOSEDecryptType>identifiers</JOSEDecryptType>\n" +
                "\t\t\t<JWSVerifyStripSignature>on</JWSVerifyStripSignature>\n" +
                "\t\t\t<Asynchronous>off</Asynchronous>\n" +
                "\t\t\t<ResultsMode>first-available</ResultsMode>\n" +
                "\t\t\t<RetryCount>0</RetryCount>\n" +
                "\t\t\t<RetryInterval>1000</RetryInterval>\n" +
                "\t\t\t<MultipleOutputs>off</MultipleOutputs>\n" +
                "\t\t\t<IteratorType>XPATH</IteratorType>\n" +
                "\t\t\t<Timeout>0</Timeout>\n" +
                "\t\t\t<MethodRewriteType>GET</MethodRewriteType>\n" +
                "\t\t\t<MethodType>POST</MethodType>\n" +
                "\t\t\t<MethodType2>POST</MethodType2>\n" +
                "\t\t</StylePolicyAction>\n" +
                "\t\t<StylePolicyAction name=\"ServiceNameRq_Rule_results_output_0\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Type>results</Type>\n" +
                "\t\t\t<Input>PIPE</Input>\n" +
                "\t\t\t<ParseSettingsReference>\n" +
                "\t\t\t\t<URL/>\n" +
                "\t\t\t\t<Literal/>\n" +
                "\t\t\t\t<Default/>\n" +
                "\t\t\t</ParseSettingsReference>\n" +
                "\t\t\t<ParseMetricsResultType>none</ParseMetricsResultType>\n" +
                "\t\t\t<InputLanguage>json</InputLanguage>\n" +
                "\t\t\t<TransformLanguage>none</TransformLanguage>\n" +
                "\t\t\t<OutputLanguage>default</OutputLanguage>\n" +
                "\t\t\t<ActionDebug persisted=\"false\">off</ActionDebug>\n" +
                "\t\t\t<TxMode>default</TxMode>\n" +
                "\t\t\t<NamedInOutLocationType>default</NamedInOutLocationType>\n" +
                "\t\t\t<SSLClientConfigType>proxy</SSLClientConfigType>\n" +
                "\t\t\t<OutputType>default</OutputType>\n" +
                "\t\t\t<Transactional>off</Transactional>\n" +
                "\t\t\t<SOAPValidation>body</SOAPValidation>\n" +
                "\t\t\t<SQLSourceType>static</SQLSourceType>\n" +
                "\t\t\t<JOSESerializationType>compact</JOSESerializationType>\n" +
                "\t\t\t<JWEEncAlgorithm>A128CBC-HS256</JWEEncAlgorithm>\n" +
                "\t\t\t<JOSEVerifyType>identifiers</JOSEVerifyType>\n" +
                "\t\t\t<JOSEDecryptType>identifiers</JOSEDecryptType>\n" +
                "\t\t\t<JWSVerifyStripSignature>on</JWSVerifyStripSignature>\n" +
                "\t\t\t<Asynchronous>off</Asynchronous>\n" +
                "\t\t\t<ResultsMode>first-available</ResultsMode>\n" +
                "\t\t\t<RetryCount>0</RetryCount>\n" +
                "\t\t\t<RetryInterval>1000</RetryInterval>\n" +
                "\t\t\t<MultipleOutputs>off</MultipleOutputs>\n" +
                "\t\t\t<IteratorType>XPATH</IteratorType>\n" +
                "\t\t\t<Timeout>0</Timeout>\n" +
                "\t\t\t<MethodRewriteType>GET</MethodRewriteType>\n" +
                "\t\t\t<MethodType>POST</MethodType>\n" +
                "\t\t\t<MethodType2>POST</MethodType2>\n" +
                "\t\t</StylePolicyAction>\n" +
                "\t\t<StylePolicyRule name=\"ServiceNameRq_Rule\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Direction>request-Rule</Direction>\n" +
                "\t\t\t<InputFormat>none</InputFormat>\n" +
                "\t\t\t<OutputFormat>none</OutputFormat>\n" +
                "\t\t\t<NonXMLProcessing>off</NonXMLProcessing>\n" +
                "\t\t\t<Unprocessed>off</Unprocessed>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">call_INPUT_PROCESSING_REQUEST</Actions>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">ServiceNameRq_Rule_setvar_0</Actions>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">ServiceNameRq_Rule_xform_0</Actions>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">call_OUTPUT_PROCESSING_REQUEST</Actions>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">ServiceNameRq_Rule_results_output_0</Actions>\n" +
                "\t\t</StylePolicyRule>\n" +
                "\t\t<Matching name=\"ServiceNameRs_MR\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<MatchRules>\n" +
                "\t\t\t\t<Type>xpath</Type>\n" +
                "\t\t\t\t<HttpTag/>\n" +
                "\t\t\t\t<HttpValue/>\n" +
                "\t\t\t\t<Url/>\n" +
                "\t\t\t\t<ErrorCode/>\n" +
                "\t\t\t\t<XPATHExpression>//*[local-name()='ServiceNameRs']</XPATHExpression>\n" +
                "\t\t\t\t<Method>default</Method>\n" +
                "\t\t\t\t<CustomMethod/>\n" +
                "\t\t\t</MatchRules>\n" +
                "\t\t\t<MatchWithPCRE>off</MatchWithPCRE>\n" +
                "\t\t\t<CombineWithOr>off</CombineWithOr>\n" +
                "\t\t</Matching>\n" +
                "\t\t<StylePolicyAction name=\"ServiceNameRs_Rule_validate_0\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Type>validate</Type>\n" +
                "\t\t\t<Input>INPUT</Input>\n" +
                "\t\t\t<ParseSettingsReference>\n" +
                "\t\t\t\t<URL/>\n" +
                "\t\t\t\t<Literal/>\n" +
                "\t\t\t\t<Default/>\n" +
                "\t\t\t</ParseSettingsReference>\n" +
                "\t\t\t<ParseMetricsResultType>none</ParseMetricsResultType>\n" +
                "\t\t\t<TransformLanguage>none</TransformLanguage>\n" +
                "\t\t\t<ActionDebug persisted=\"false\">off</ActionDebug>\n" +
                "\t\t\t<Output>NULL</Output>\n" +
                "\t\t\t<NamedInOutLocationType>default</NamedInOutLocationType>\n" +
                "\t\t\t<SchemaURL>local:///SchemaLib/ESB/PSRBatchManage.xsd</SchemaURL>\n" +
                "\t\t\t<SSLClientConfigType>proxy</SSLClientConfigType>\n" +
                "\t\t\t<Transactional>off</Transactional>\n" +
                "\t\t\t<SOAPValidation>body</SOAPValidation>\n" +
                "\t\t\t<SQLSourceType>static</SQLSourceType>\n" +
                "\t\t\t<JWSVerifyStripSignature>on</JWSVerifyStripSignature>\n" +
                "\t\t\t<Asynchronous>off</Asynchronous>\n" +
                "\t\t\t<ResultsMode>first-available</ResultsMode>\n" +
                "\t\t\t<RetryCount>0</RetryCount>\n" +
                "\t\t\t<RetryInterval>1000</RetryInterval>\n" +
                "\t\t\t<MultipleOutputs>off</MultipleOutputs>\n" +
                "\t\t\t<IteratorType>XPATH</IteratorType>\n" +
                "\t\t\t<Timeout>0</Timeout>\n" +
                "\t\t\t<MethodRewriteType>GET</MethodRewriteType>\n" +
                "\t\t\t<MethodType>POST</MethodType>\n" +
                "\t\t\t<MethodType2>POST</MethodType2>\n" +
                "\t\t</StylePolicyAction>\n" +
                "\n" +
                "\t\t<StylePolicyAction name=\"ServiceNameRs_Rule_xform_0\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Type>xform</Type>\n" +
                "\t\t\t<Input>INPUT</Input>\n" +
                "\t\t\t<Transform>local:///Services/ServiceName/TRANSFORMATION/Consumer-Provider-ServiceName-Rs.xsl</Transform>\n" +
                "\t\t\t<ParseSettingsReference>\n" +
                "\t\t\t\t<URL/>\n" +
                "\t\t\t\t<Literal/>\n" +
                "\t\t\t\t<Default/>\n" +
                "\t\t\t</ParseSettingsReference>\n" +
                "\t\t\t<ParseMetricsResultType>none</ParseMetricsResultType>\n" +
                "\t\t\t<InputLanguage>json</InputLanguage>\n" +
                "\t\t\t<TransformLanguage>none</TransformLanguage>\n" +
                "\t\t\t<OutputLanguage>default</OutputLanguage>\n" +
                "\t\t\t<ActionDebug persisted=\"false\">off</ActionDebug>\n" +
                "\t\t\t<TxMode>default</TxMode>\n" +
                "\t\t\t<Output>PIPE</Output>\n" +
                "\t\t\t<NamedInOutLocationType>default</NamedInOutLocationType>\n" +
                "\t\t\t<SSLClientConfigType>proxy</SSLClientConfigType>\n" +
                "\t\t\t<OutputType>default</OutputType>\n" +
                "\t\t\t<Transactional>off</Transactional>\n" +
                "\t\t\t<SOAPValidation>body</SOAPValidation>\n" +
                "\t\t\t<SQLSourceType>static</SQLSourceType>\n" +
                "\t\t\t<JOSESerializationType>compact</JOSESerializationType>\n" +
                "\t\t\t<JWEEncAlgorithm>A128CBC-HS256</JWEEncAlgorithm>\n" +
                "\t\t\t<JOSEVerifyType>identifiers</JOSEVerifyType>\n" +
                "\t\t\t<JOSEDecryptType>identifiers</JOSEDecryptType>\n" +
                "\t\t\t<JWSVerifyStripSignature>on</JWSVerifyStripSignature>\n" +
                "\t\t\t<Asynchronous>off</Asynchronous>\n" +
                "\t\t\t<ResultsMode>first-available</ResultsMode>\n" +
                "\t\t\t<RetryCount>0</RetryCount>\n" +
                "\t\t\t<RetryInterval>1000</RetryInterval>\n" +
                "\t\t\t<MultipleOutputs>off</MultipleOutputs>\n" +
                "\t\t\t<IteratorType>XPATH</IteratorType>\n" +
                "\t\t\t<Timeout>0</Timeout>\n" +
                "\t\t\t<MethodRewriteType>GET</MethodRewriteType>\n" +
                "\t\t\t<MethodType>POST</MethodType>\n" +
                "\t\t\t<MethodType2>POST</MethodType2>\n" +
                "\t\t</StylePolicyAction>\n" +
                "\t\t<StylePolicyAction name=\"ServiceNameRs_Rule_results_output_0\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Type>results</Type>\n" +
                "\t\t\t<Input>PIPE</Input>\n" +
                "\t\t\t<ParseSettingsReference>\n" +
                "\t\t\t\t<URL/>\n" +
                "\t\t\t\t<Literal/>\n" +
                "\t\t\t\t<Default/>\n" +
                "\t\t\t</ParseSettingsReference>\n" +
                "\t\t\t<ParseMetricsResultType>none</ParseMetricsResultType>\n" +
                "\t\t\t<InputLanguage>json</InputLanguage>\n" +
                "\t\t\t<TransformLanguage>none</TransformLanguage>\n" +
                "\t\t\t<OutputLanguage>default</OutputLanguage>\n" +
                "\t\t\t<ActionDebug persisted=\"false\">off</ActionDebug>\n" +
                "\t\t\t<TxMode>default</TxMode>\n" +
                "\t\t\t<NamedInOutLocationType>default</NamedInOutLocationType>\n" +
                "\t\t\t<SSLClientConfigType>proxy</SSLClientConfigType>\n" +
                "\t\t\t<OutputType>default</OutputType>\n" +
                "\t\t\t<Transactional>off</Transactional>\n" +
                "\t\t\t<SOAPValidation>body</SOAPValidation>\n" +
                "\t\t\t<SQLSourceType>static</SQLSourceType>\n" +
                "\t\t\t<JOSESerializationType>compact</JOSESerializationType>\n" +
                "\t\t\t<JWEEncAlgorithm>A128CBC-HS256</JWEEncAlgorithm>\n" +
                "\t\t\t<JOSEVerifyType>identifiers</JOSEVerifyType>\n" +
                "\t\t\t<JOSEDecryptType>identifiers</JOSEDecryptType>\n" +
                "\t\t\t<JWSVerifyStripSignature>on</JWSVerifyStripSignature>\n" +
                "\t\t\t<Asynchronous>off</Asynchronous>\n" +
                "\t\t\t<ResultsMode>first-available</ResultsMode>\n" +
                "\t\t\t<RetryCount>0</RetryCount>\n" +
                "\t\t\t<RetryInterval>1000</RetryInterval>\n" +
                "\t\t\t<MultipleOutputs>off</MultipleOutputs>\n" +
                "\t\t\t<IteratorType>XPATH</IteratorType>\n" +
                "\t\t\t<Timeout>0</Timeout>\n" +
                "\t\t\t<MethodRewriteType>GET</MethodRewriteType>\n" +
                "\t\t\t<MethodType>POST</MethodType>\n" +
                "\t\t\t<MethodType2>POST</MethodType2>\n" +
                "\t\t</StylePolicyAction>\n" +
                "\t\t<StylePolicyRule name=\"ServiceNameRs_Rule\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Direction>response-Rule</Direction>\n" +
                "\t\t\t<InputFormat>none</InputFormat>\n" +
                "\t\t\t<OutputFormat>none</OutputFormat>\n" +
                "\t\t\t<NonXMLProcessing>off</NonXMLProcessing>\n" +
                "\t\t\t<Unprocessed>off</Unprocessed>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">call_INPUT_PROCESSING_RESPONSE</Actions>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">ServiceNameRs_Rule_validate_0</Actions>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">ServiceNameRs_Rule_xform_0</Actions>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">call_OUTPUT_PROCESSING_RESPONSE</Actions>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">ServiceNameRs_Rule_results_output_0</Actions>\n" +
                "\t\t</StylePolicyRule>\n" +
                "\t\t<Matching name=\"ServiceNameErr_MR\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<MatchRules>\n" +
                "\t\t\t\t<Type>xpath</Type>\n" +
                "\t\t\t\t<HttpTag/>\n" +
                "\t\t\t\t<HttpValue/>\n" +
                "\t\t\t\t<Url/>\n" +
                "\t\t\t\t<ErrorCode/>\n" +
                "\t\t\t\t<XPATHExpression>*</XPATHExpression>\n" +
                "\t\t\t\t<Method>default</Method>\n" +
                "\t\t\t\t<CustomMethod/>\n" +
                "\t\t\t</MatchRules>\n" +
                "\t\t\t<MatchWithPCRE>off</MatchWithPCRE>\n" +
                "\t\t\t<CombineWithOr>off</CombineWithOr>\n" +
                "\t\t</Matching>\n" +
                "\t\t<StylePolicyAction name=\"ServiceNameErr_Rule_xform_0\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Type>xform</Type>\n" +
                "\t\t\t<Input>INPUT</Input>\n" +
                "\t\t\t<Transform>local:///Services/ServiceName/TRANSFORMATION/Consumer-Provider-ServiceName-Err.xsl</Transform>\n" +
                "\t\t\t<ParseSettingsReference>\n" +
                "\t\t\t\t<URL/>\n" +
                "\t\t\t\t<Literal/>\n" +
                "\t\t\t\t<Default/>\n" +
                "\t\t\t</ParseSettingsReference>\n" +
                "\t\t\t<ParseMetricsResultType>none</ParseMetricsResultType>\n" +
                "\t\t\t<InputLanguage>json</InputLanguage>\n" +
                "\t\t\t<TransformLanguage>none</TransformLanguage>\n" +
                "\t\t\t<OutputLanguage>default</OutputLanguage>\n" +
                "\t\t\t<ActionDebug persisted=\"false\">off</ActionDebug>\n" +
                "\t\t\t<TxMode>default</TxMode>\n" +
                "\t\t\t<Output>PIPE</Output>\n" +
                "\t\t\t<NamedInOutLocationType>default</NamedInOutLocationType>\n" +
                "\t\t\t<SSLClientConfigType>proxy</SSLClientConfigType>\n" +
                "\t\t\t<OutputType>default</OutputType>\n" +
                "\t\t\t<Transactional>off</Transactional>\n" +
                "\t\t\t<SOAPValidation>body</SOAPValidation>\n" +
                "\t\t\t<SQLSourceType>static</SQLSourceType>\n" +
                "\t\t\t<JOSESerializationType>compact</JOSESerializationType>\n" +
                "\t\t\t<JWEEncAlgorithm>A128CBC-HS256</JWEEncAlgorithm>\n" +
                "\t\t\t<JOSEVerifyType>identifiers</JOSEVerifyType>\n" +
                "\t\t\t<JOSEDecryptType>identifiers</JOSEDecryptType>\n" +
                "\t\t\t<JWSVerifyStripSignature>on</JWSVerifyStripSignature>\n" +
                "\t\t\t<Asynchronous>off</Asynchronous>\n" +
                "\t\t\t<ResultsMode>first-available</ResultsMode>\n" +
                "\t\t\t<RetryCount>0</RetryCount>\n" +
                "\t\t\t<RetryInterval>1000</RetryInterval>\n" +
                "\t\t\t<MultipleOutputs>off</MultipleOutputs>\n" +
                "\t\t\t<IteratorType>XPATH</IteratorType>\n" +
                "\t\t\t<Timeout>0</Timeout>\n" +
                "\t\t\t<MethodRewriteType>GET</MethodRewriteType>\n" +
                "\t\t\t<MethodType>POST</MethodType>\n" +
                "\t\t\t<MethodType2>POST</MethodType2>\n" +
                "\t\t</StylePolicyAction>\n" +
                "\t\t<StylePolicyAction name=\"ServiceNameErr_Rule_results_output_0\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Type>results</Type>\n" +
                "\t\t\t<Input>PIPE</Input>\n" +
                "\t\t\t<ParseSettingsReference>\n" +
                "\t\t\t\t<URL/>\n" +
                "\t\t\t\t<Literal/>\n" +
                "\t\t\t\t<Default/>\n" +
                "\t\t\t</ParseSettingsReference>\n" +
                "\t\t\t<ParseMetricsResultType>none</ParseMetricsResultType>\n" +
                "\t\t\t<InputLanguage>json</InputLanguage>\n" +
                "\t\t\t<TransformLanguage>none</TransformLanguage>\n" +
                "\t\t\t<OutputLanguage>default</OutputLanguage>\n" +
                "\t\t\t<ActionDebug persisted=\"false\">off</ActionDebug>\n" +
                "\t\t\t<TxMode>default</TxMode>\n" +
                "\t\t\t<NamedInOutLocationType>default</NamedInOutLocationType>\n" +
                "\t\t\t<SSLClientConfigType>proxy</SSLClientConfigType>\n" +
                "\t\t\t<OutputType>default</OutputType>\n" +
                "\t\t\t<Transactional>off</Transactional>\n" +
                "\t\t\t<SOAPValidation>body</SOAPValidation>\n" +
                "\t\t\t<SQLSourceType>static</SQLSourceType>\n" +
                "\t\t\t<JOSESerializationType>compact</JOSESerializationType>\n" +
                "\t\t\t<JWEEncAlgorithm>A128CBC-HS256</JWEEncAlgorithm>\n" +
                "\t\t\t<JOSEVerifyType>identifiers</JOSEVerifyType>\n" +
                "\t\t\t<JOSEDecryptType>identifiers</JOSEDecryptType>\n" +
                "\t\t\t<JWSVerifyStripSignature>on</JWSVerifyStripSignature>\n" +
                "\t\t\t<Asynchronous>off</Asynchronous>\n" +
                "\t\t\t<ResultsMode>first-available</ResultsMode>\n" +
                "\t\t\t<RetryCount>0</RetryCount>\n" +
                "\t\t\t<RetryInterval>1000</RetryInterval>\n" +
                "\t\t\t<MultipleOutputs>off</MultipleOutputs>\n" +
                "\t\t\t<IteratorType>XPATH</IteratorType>\n" +
                "\t\t\t<Timeout>0</Timeout>\n" +
                "\t\t\t<MethodRewriteType>GET</MethodRewriteType>\n" +
                "\t\t\t<MethodType>POST</MethodType>\n" +
                "\t\t\t<MethodType2>POST</MethodType2>\n" +
                "\t\t</StylePolicyAction>\n" +
                "\t\t<StylePolicyRule name=\"ServiceNameErr_Rule\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Direction>error-Rule</Direction>\n" +
                "\t\t\t<InputFormat>none</InputFormat>\n" +
                "\t\t\t<OutputFormat>none</OutputFormat>\n" +
                "\t\t\t<NonXMLProcessing>off</NonXMLProcessing>\n" +
                "\t\t\t<Unprocessed>off</Unprocessed>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">call_INPUT_PROCESSING_ERROR</Actions>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">ServiceNameErr_Rule_xform_0</Actions>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">call_OUTPUT_PROCESSING_ERROR</Actions>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">ServiceNameErr_Rule_results_output_0</Actions>\n" +
                "\t\t</StylePolicyRule>\n" +
                "\t\t<StylePolicy name=\"ServiceName_Policy\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<DefStylesheetForSoap>store:///filter-reject-all.xsl</DefStylesheetForSoap>\n" +
                "\t\t\t<DefStylesheetForXsl>store:///identity.xsl</DefStylesheetForXsl>\n" +
                "\t\t\t<DefXQueryForJSON>store:///reject-all-json.xq</DefXQueryForJSON>\n" +
                "\t\t\t<PolicyMaps>\n" +
                "\t\t\t\t<Match class=\"Matching\">ServiceNameRq_MR</Match>\n" +
                "\t\t\t\t<Rule class=\"StylePolicyRule\">ServiceNameRq_Rule</Rule>\n" +
                "\t\t\t</PolicyMaps>\n" +
                "\t\t\t<PolicyMaps>\n" +
                "\t\t\t\t<Match class=\"Matching\">ServiceNameRs_MR</Match>\n" +
                "\t\t\t\t<Rule class=\"StylePolicyRule\">ServiceNameRs_Rule</Rule>\n" +
                "\t\t\t</PolicyMaps>\n" +
                "\t\t\t<PolicyMaps>\n" +
                "\t\t\t\t<Match class=\"Matching\">ServiceNameErr_MR</Match>\n" +
                "\t\t\t\t<Rule class=\"StylePolicyRule\">ServiceNameErr_Rule</Rule>\n" +
                "\t\t\t</PolicyMaps>\n" +
                "\t\t</StylePolicy>\n" +
                "\t\t<PolicyAttachments name=\"ServiceName\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<EnforcementMode>enforce</EnforcementMode>\n" +
                "\t\t\t<PolicyReferences>on</PolicyReferences>\n" +
                "\t\t\t<SLAEnforcementMode>allow-if-no-sla</SLAEnforcementMode>\n" +
                "\t\t</PolicyAttachments>\n" +
                "\t\t<MultiProtocolGateway name=\"ServiceName\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Priority>normal</Priority>\n" +
                "\t\t\t<FrontProtocol class=\"HTTPSourceProtocolHandler\">ServiceName_HTTP_FSH</FrontProtocol>\n" +
                "\t\t\t<XMLManager class=\"XMLManager\">default</XMLManager>\n" +
                "\t\t\t<SSLClientConfigType>proxy</SSLClientConfigType>\n" +
                "\t\t\t<DefaultParamNamespace>http://www.datapower.com/param/config</DefaultParamNamespace>\n" +
                "\t\t\t<QueryParamNamespace>http://www.datapower.com/param/query</QueryParamNamespace>\n" +
                "\t\t\t<PropagateURI>on</PropagateURI>\n" +
                "\t\t\t<MonitorProcessingPolicy>terminate-at-first-throttle</MonitorProcessingPolicy>\n" +
                "\t\t\t<RequestAttachments>strip</RequestAttachments>\n" +
                "\t\t\t<ResponseAttachments>strip</ResponseAttachments>\n" +
                "\t\t\t<RequestAttachmentsFlowControl>off</RequestAttachmentsFlowControl>\n" +
                "\t\t\t<ResponseAttachmentsFlowControl>off</ResponseAttachmentsFlowControl>\n" +
                "\t\t\t<RootPartNotFirstAction>process-in-order</RootPartNotFirstAction>\n" +
                "\t\t\t<FrontAttachmentFormat>dynamic</FrontAttachmentFormat>\n" +
                "\t\t\t<BackAttachmentFormat>dynamic</BackAttachmentFormat>\n" +
                "\t\t\t<MIMEFrontHeaders>on</MIMEFrontHeaders>\n" +
                "\t\t\t<MIMEBackHeaders>on</MIMEBackHeaders>\n" +
                "\t\t\t<StreamOutputToBack>buffer-until-verification</StreamOutputToBack>\n" +
                "\t\t\t<StreamOutputToFront>buffer-until-verification</StreamOutputToFront>\n" +
                "\t\t\t<MaxMessageSize>0</MaxMessageSize>\n" +
                "\t\t\t<GatewayParserLimits>off</GatewayParserLimits>\n" +
                "\t\t\t<ParserLimitsElementDepth>512</ParserLimitsElementDepth>\n" +
                "\t\t\t<ParserLimitsAttributeCount>128</ParserLimitsAttributeCount>\n" +
                "\t\t\t<ParserLimitsMaxNodeSize>33554432</ParserLimitsMaxNodeSize>\n" +
                "\t\t\t<ParserLimitsForbidExternalReferences>on</ParserLimitsForbidExternalReferences>\n" +
                "\t\t\t<ParserLimitsExternalReferences>forbid</ParserLimitsExternalReferences>\n" +
                "\t\t\t<ParserLimitsMaxPrefixes>1024</ParserLimitsMaxPrefixes>\n" +
                "\t\t\t<ParserLimitsMaxNamespaces>1024</ParserLimitsMaxNamespaces>\n" +
                "\t\t\t<ParserLimitsMaxLocalNames>60000</ParserLimitsMaxLocalNames>\n" +
                "\t\t\t<ParserLimitsAttachmentByteCount>2000000000</ParserLimitsAttachmentByteCount>\n" +
                "\t\t\t<ParserLimitsAttachmentPackageByteCount>0</ParserLimitsAttachmentPackageByteCount>\n" +
                "\t\t\t<DebugMode persisted=\"false\">off</DebugMode>\n" +
                "\t\t\t<DebuggerType>internal</DebuggerType>\n" +
                "\t\t\t<DebugHistory>25</DebugHistory>\n" +
                "\t\t\t<FlowControl>off</FlowControl>\n" +
                "\t\t\t<SOAPSchemaURL>store:///schemas/soap-envelope.xsd</SOAPSchemaURL>\n" +
                "\t\t\t<FrontTimeout>120</FrontTimeout>\n" +
                "\t\t\t<BackTimeout>120</BackTimeout>\n" +
                "\t\t\t<FrontPersistentTimeout>180</FrontPersistentTimeout>\n" +
                "\t\t\t<BackPersistentTimeout>180</BackPersistentTimeout>\n" +
                "\t\t\t<IncludeResponseTypeEncoding>off</IncludeResponseTypeEncoding>\n" +
                "\t\t\t<BackHTTPVersion>HTTP/1.1</BackHTTPVersion>\n" +
                "\t\t\t<PersistentConnections>on</PersistentConnections>\n" +
                "\t\t\t<LoopDetection>off</LoopDetection>\n" +
                "\t\t\t<DoHostRewriting>on</DoHostRewriting>\n" +
                "\t\t\t<DoChunkedUpload>off</DoChunkedUpload>\n" +
                "\t\t\t<ProcessHTTPErrors>on</ProcessHTTPErrors>\n" +
                "\t\t\t<HTTPClientIPLabel>X-Client-IP</HTTPClientIPLabel>\n" +
                "\t\t\t<HTTPLogCorIDLabel>X-Global-Transaction-ID</HTTPLogCorIDLabel>\n" +
                "\t\t\t<InOrderMode>\n" +
                "\t\t\t\t<Request>off</Request>\n" +
                "\t\t\t\t<Backend>off</Backend>\n" +
                "\t\t\t\t<Response>off</Response>\n" +
                "\t\t\t</InOrderMode>\n" +
                "\t\t\t<WSAMode>sync2sync</WSAMode>\n" +
                "\t\t\t<WSARequireAAA>on</WSARequireAAA>\n" +
                "\t\t\t<WSAStrip>on</WSAStrip>\n" +
                "\t\t\t<WSADefaultReplyTo>http://schemas.xmlsoap.org/ws/2004/08/addressing/role/anonymous</WSADefaultReplyTo>\n" +
                "\t\t\t<WSADefaultFaultTo>http://schemas.xmlsoap.org/ws/2004/08/addressing/role/anonymous</WSADefaultFaultTo>\n" +
                "\t\t\t<WSAForce>off</WSAForce>\n" +
                "\t\t\t<WSAGenStyle>sync</WSAGenStyle>\n" +
                "\t\t\t<WSAHTTPAsyncResponseCode>204</WSAHTTPAsyncResponseCode>\n" +
                "\t\t\t<WSATimeout>120</WSATimeout>\n" +
                "\t\t\t<WSRMEnabled>off</WSRMEnabled>\n" +
                "\t\t\t<WSRMSequenceExpiration>3600</WSRMSequenceExpiration>\n" +
                "\t\t\t<WSRMDestinationAcceptCreateSequence>on</WSRMDestinationAcceptCreateSequence>\n" +
                "\t\t\t<WSRMDestinationMaximumSequences>400</WSRMDestinationMaximumSequences>\n" +
                "\t\t\t<WSRMDestinationInOrder>off</WSRMDestinationInOrder>\n" +
                "\t\t\t<WSRMDestinationMaximumInOrderQueueLength>10</WSRMDestinationMaximumInOrderQueueLength>\n" +
                "\t\t\t<WSRMDestinationAcceptOffers>off</WSRMDestinationAcceptOffers>\n" +
                "\t\t\t<WSRMFrontForce>off</WSRMFrontForce>\n" +
                "\t\t\t<WSRMBackForce>off</WSRMBackForce>\n" +
                "\t\t\t<WSRMBackCreateSequence>off</WSRMBackCreateSequence>\n" +
                "\t\t\t<WSRMFrontCreateSequence>off</WSRMFrontCreateSequence>\n" +
                "\t\t\t<WSRMSourceMakeOffer>off</WSRMSourceMakeOffer>\n" +
                "\t\t\t<WSRMUsesSequenceSSL>off</WSRMUsesSequenceSSL>\n" +
                "\t\t\t<WSRMSourceMaximumSequences>400</WSRMSourceMaximumSequences>\n" +
                "\t\t\t<WSRMSourceRetransmissionInterval>10</WSRMSourceRetransmissionInterval>\n" +
                "\t\t\t<WSRMSourceExponentialBackoff>on</WSRMSourceExponentialBackoff>\n" +
                "\t\t\t<WSRMSourceMaximumRetransmissions>4</WSRMSourceMaximumRetransmissions>\n" +
                "\t\t\t<WSRMSourceMaximumQueueLength>30</WSRMSourceMaximumQueueLength>\n" +
                "\t\t\t<WSRMSourceRequestAckCount>1</WSRMSourceRequestAckCount>\n" +
                "\t\t\t<WSRMSourceInactivityClose>360</WSRMSourceInactivityClose>\n" +
                "\t\t\t<ForcePolicyExec>off</ForcePolicyExec>\n" +
                "\t\t\t<RewriteErrors>on</RewriteErrors>\n" +
                "\t\t\t<DelayErrors>on</DelayErrors>\n" +
                "\t\t\t<DelayErrorsDuration>1000</DelayErrorsDuration>\n" +
                "\t\t\t<RequestType>soap</RequestType>\n" +
                "\t\t\t<ResponseType>soap</ResponseType>\n" +
                "\t\t\t<FollowRedirects>on</FollowRedirects>\n" +
                "\t\t\t<RewriteLocationHeader>off</RewriteLocationHeader>\n" +
                "\t\t\t<StylePolicy class=\"StylePolicy\">ServiceName_Policy</StylePolicy>\n" +
                "\t\t\t<Type>dynamic-backend</Type>\n" +
                "\t\t\t<AllowCompression>off</AllowCompression>\n" +
                "\t\t\t<AllowCacheControlHeader>off</AllowCacheControlHeader>\n" +
                "\t\t\t<PolicyAttachments class=\"PolicyAttachments\">ServiceName</PolicyAttachments>\n" +
                "\t\t\t<WSMAgentMonitor>off</WSMAgentMonitor>\n" +
                "\t\t\t<WSMAgentMonitorPCM>all-messages</WSMAgentMonitorPCM>\n" +
                "\t\t\t<ProxyHTTPResponse>off</ProxyHTTPResponse>\n" +
                "\t\t\t<TransactionTimeout>0</TransactionTimeout>\n" +
                "\t\t</MultiProtocolGateway>\n" +
                "\t</configuration>\n" +
                "</datapower-configuration>";
        temp=temp.replaceAll("ServiceName",Constants.serviceName);
        temp=temp.replaceAll("Consumer","SABB");
        temp=temp.replaceAll("Provider",Constants.backendName);
        temp=temp.replaceAll("14030","14");
        String path=Constants.serviceFilesPath+Constants.serviceName+"/temp/Serviceconfig.xml";
        DealingWithFiles.writeToFile(temp,path);
    }
    public static void generateStubConfiguration(){
        String temp="<datapower-configuration>\n" +
                "\t<configuration>\n" +
                "\t\t<HTTPSourceProtocolHandler name=\"serviceName_Stub_HTTP_FSH\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<LocalAddress>0.0.0.0</LocalAddress>\n" +
                "\t\t\t<LocalPort>StubFSHPort</LocalPort>\n" +
                "\t\t\t<HTTPVersion>HTTP/1.1</HTTPVersion>\n" +
                "\t\t\t<AllowedFeatures>\n" +
                "\t\t\t\t<HTTP-1.0>on</HTTP-1.0>\n" +
                "\t\t\t\t<HTTP-1.1>on</HTTP-1.1>\n" +
                "\t\t\t\t<HTTP-2.0>off</HTTP-2.0>\n" +
                "\t\t\t\t<POST>on</POST>\n" +
                "\t\t\t\t<GET>off</GET>\n" +
                "\t\t\t\t<PUT>on</PUT>\n" +
                "\t\t\t\t<HEAD>off</HEAD>\n" +
                "\t\t\t\t<OPTIONS>off</OPTIONS>\n" +
                "\t\t\t\t<TRACE>off</TRACE>\n" +
                "\t\t\t\t<DELETE>off</DELETE>\n" +
                "\t\t\t\t<CONNECT>off</CONNECT>\n" +
                "\t\t\t\t<CustomMethods>off</CustomMethods>\n" +
                "\t\t\t\t<QueryString>on</QueryString>\n" +
                "\t\t\t\t<FragmentIdentifiers>on</FragmentIdentifiers>\n" +
                "\t\t\t\t<DotDot>off</DotDot>\n" +
                "\t\t\t\t<CmdExe>off</CmdExe>\n" +
                "\t\t\t</AllowedFeatures>\n" +
                "\t\t\t<PersistentConnections>on</PersistentConnections>\n" +
                "\t\t\t<MaxPersistentConnectionsReuse>0</MaxPersistentConnectionsReuse>\n" +
                "\t\t\t<AllowCompression>off</AllowCompression>\n" +
                "\t\t\t<AllowWebSocketUpgrade>off</AllowWebSocketUpgrade>\n" +
                "\t\t\t<WebSocketIdleTimeout>0</WebSocketIdleTimeout>\n" +
                "\t\t\t<MaxURLLen>16384</MaxURLLen>\n" +
                "\t\t\t<MaxTotalHdrLen>128000</MaxTotalHdrLen>\n" +
                "\t\t\t<MaxHdrCount>0</MaxHdrCount>\n" +
                "\t\t\t<MaxNameHdrLen>0</MaxNameHdrLen>\n" +
                "\t\t\t<MaxValueHdrLen>0</MaxValueHdrLen>\n" +
                "\t\t\t<MaxQueryStringLen>0</MaxQueryStringLen>\n" +
                "\t\t\t<CredentialCharset>protocol</CredentialCharset>\n" +
                "\t\t\t<HTTP2MaxStreams>100</HTTP2MaxStreams>\n" +
                "\t\t\t<HTTP2MaxFrameSize>16384</HTTP2MaxFrameSize>\n" +
                "\t\t\t<HTTP2StreamHeader>off</HTTP2StreamHeader>\n" +
                "\t\t</HTTPSourceProtocolHandler>\n" +
                "\t\t<HTTPUserAgent name=\"default\" intrinsic=\"true\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<UserSummary>Default User Agent</UserSummary>\n" +
                "\t\t\t<MaxRedirects>8</MaxRedirects>\n" +
                "\t\t\t<Timeout>300</Timeout>\n" +
                "\t\t</HTTPUserAgent>\n" +
                "\t\t<XMLManager name=\"default\" intrinsic=\"true\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<UserSummary>Default XML-Manager</UserSummary>\n" +
                "\t\t\t<CacheSize>256</CacheSize>\n" +
                "\t\t\t<SHA1Caching>on</SHA1Caching>\n" +
                "\t\t\t<StaticDocumentCalls>on</StaticDocumentCalls>\n" +
                "\t\t\t<SearchResults>on</SearchResults>\n" +
                "\t\t\t<SupportTxWarn>off</SupportTxWarn>\n" +
                "\t\t\t<Memoization>on</Memoization>\n" +
                "\t\t\t<ParserLimitsBytesScanned>4194304</ParserLimitsBytesScanned>\n" +
                "\t\t\t<ParserLimitsElementDepth>512</ParserLimitsElementDepth>\n" +
                "\t\t\t<ParserLimitsAttributeCount>128</ParserLimitsAttributeCount>\n" +
                "\t\t\t<ParserLimitsMaxNodeSize>33554432</ParserLimitsMaxNodeSize>\n" +
                "\t\t\t<ParserLimitsForbidExternalReferences>on</ParserLimitsForbidExternalReferences>\n" +
                "\t\t\t<ParserLimitsExternalReferences>forbid</ParserLimitsExternalReferences>\n" +
                "\t\t\t<ParserLimitsMaxPrefixes>1024</ParserLimitsMaxPrefixes>\n" +
                "\t\t\t<ParserLimitsMaxNamespaces>1024</ParserLimitsMaxNamespaces>\n" +
                "\t\t\t<ParserLimitsMaxLocalNames>60000</ParserLimitsMaxLocalNames>\n" +
                "\t\t\t<DocCacheMaxDocs>5000</DocCacheMaxDocs>\n" +
                "\t\t\t<DocCacheSize>0</DocCacheSize>\n" +
                "\t\t\t<DocMaxWrites>32768</DocMaxWrites>\n" +
                "\t\t\t<UserAgent class=\"HTTPUserAgent\">default</UserAgent>\n" +
                "\t\t</XMLManager>\n" +
                "\t\t<Matching name=\"serviceName_Stub_MR\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<MatchRules>\n" +
                "\t\t\t\t<Type>xpath</Type>\n" +
                "\t\t\t\t<HttpTag/>\n" +
                "\t\t\t\t<HttpValue/>\n" +
                "\t\t\t\t<Url/>\n" +
                "\t\t\t\t<ErrorCode/>\n" +
                "\t\t\t\t<XPATHExpression>//*[local-name()='matchXpath']</XPATHExpression>\n" +
                "\t\t\t\t<Method>default</Method>\n" +
                "\t\t\t\t<CustomMethod/>\n" +
                "\t\t\t</MatchRules>\n" +
                "\t\t\t<MatchWithPCRE>off</MatchWithPCRE>\n" +
                "\t\t\t<CombineWithOr>off</CombineWithOr>\n" +
                "\t\t</Matching>\n" +
                "\t\t<StylePolicyAction name=\"serviceName_Stub_Policy_rule_0_setvar_0\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Type>setvar</Type>\n" +
                "\t\t\t<Input>INPUT</Input>\n" +
                "\t\t\t<ParseSettingsReference>\n" +
                "\t\t\t\t<URL/>\n" +
                "\t\t\t\t<Literal/>\n" +
                "\t\t\t\t<Default/>\n" +
                "\t\t\t</ParseSettingsReference>\n" +
                "\t\t\t<ParseMetricsResultType>none</ParseMetricsResultType>\n" +
                "\t\t\t<TransformLanguage>none</TransformLanguage>\n" +
                "\t\t\t<ActionDebug persisted=\"false\">off</ActionDebug>\n" +
                "\t\t\t<NamedInOutLocationType>default</NamedInOutLocationType>\n" +
                "\t\t\t<Variable>var://service/mpgw/skip-backside</Variable>\n" +
                "\t\t\t<Value>1</Value>\n" +
                "\t\t\t<SSLClientConfigType>proxy</SSLClientConfigType>\n" +
                "\t\t\t<Transactional>off</Transactional>\n" +
                "\t\t\t<SOAPValidation>body</SOAPValidation>\n" +
                "\t\t\t<SQLSourceType>static</SQLSourceType>\n" +
                "\t\t\t<JWSVerifyStripSignature>on</JWSVerifyStripSignature>\n" +
                "\t\t\t<Asynchronous>off</Asynchronous>\n" +
                "\t\t\t<ResultsMode>first-available</ResultsMode>\n" +
                "\t\t\t<RetryCount>0</RetryCount>\n" +
                "\t\t\t<RetryInterval>1000</RetryInterval>\n" +
                "\t\t\t<MultipleOutputs>off</MultipleOutputs>\n" +
                "\t\t\t<IteratorType>XPATH</IteratorType>\n" +
                "\t\t\t<Timeout>0</Timeout>\n" +
                "\t\t\t<MethodRewriteType>GET</MethodRewriteType>\n" +
                "\t\t\t<MethodType>POST</MethodType>\n" +
                "\t\t\t<MethodType2>POST</MethodType2>\n" +
                "\t\t</StylePolicyAction>\n" +
                "\t\t<StylePolicyAction name=\"serviceName_Stub_Policy_rule_0_xform_0\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Type>xform</Type>\n" +
                "\t\t\t<Input>INPUT</Input>\n" +
                "\t\t\t<Transform>local:///serviceName_stub.xsl</Transform>\n" +
                "\t\t\t<ParseSettingsReference>\n" +
                "\t\t\t\t<URL/>\n" +
                "\t\t\t\t<Literal/>\n" +
                "\t\t\t\t<Default/>\n" +
                "\t\t\t</ParseSettingsReference>\n" +
                "\t\t\t<ParseMetricsResultType>none</ParseMetricsResultType>\n" +
                "\t\t\t<TransformLanguage>none</TransformLanguage>\n" +
                "\t\t\t<ActionDebug persisted=\"false\">off</ActionDebug>\n" +
                "\t\t\t<Output>OUTPUT</Output>\n" +
                "\t\t\t<NamedInOutLocationType>default</NamedInOutLocationType>\n" +
                "\t\t\t<SSLClientConfigType>proxy</SSLClientConfigType>\n" +
                "\t\t\t<OutputType>default</OutputType>\n" +
                "\t\t\t<Transactional>off</Transactional>\n" +
                "\t\t\t<SOAPValidation>body</SOAPValidation>\n" +
                "\t\t\t<SQLSourceType>static</SQLSourceType>\n" +
                "\t\t\t<JWSVerifyStripSignature>on</JWSVerifyStripSignature>\n" +
                "\t\t\t<Asynchronous>off</Asynchronous>\n" +
                "\t\t\t<ResultsMode>first-available</ResultsMode>\n" +
                "\t\t\t<RetryCount>0</RetryCount>\n" +
                "\t\t\t<RetryInterval>1000</RetryInterval>\n" +
                "\t\t\t<MultipleOutputs>off</MultipleOutputs>\n" +
                "\t\t\t<IteratorType>XPATH</IteratorType>\n" +
                "\t\t\t<Timeout>0</Timeout>\n" +
                "\t\t\t<MethodRewriteType>GET</MethodRewriteType>\n" +
                "\t\t\t<MethodType>POST</MethodType>\n" +
                "\t\t\t<MethodType2>POST</MethodType2>\n" +
                "\t\t</StylePolicyAction>\n" +
                "\t\t<StylePolicyRule name=\"serviceName_Stub_Policy_rule_0\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Direction>rule</Direction>\n" +
                "\t\t\t<InputFormat>none</InputFormat>\n" +
                "\t\t\t<OutputFormat>none</OutputFormat>\n" +
                "\t\t\t<NonXMLProcessing>off</NonXMLProcessing>\n" +
                "\t\t\t<Unprocessed>off</Unprocessed>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">serviceName_Stub_Policy_rule_0_setvar_0</Actions>\n" +
                "\t\t\t<Actions class=\"StylePolicyAction\">serviceName_Stub_Policy_rule_0_xform_0</Actions>\n" +
                "\t\t</StylePolicyRule>\n" +
                "\t\t<StylePolicy name=\"serviceName_Stub_Policy\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<DefStylesheetForSoap>store:///filter-reject-all.xsl</DefStylesheetForSoap>\n" +
                "\t\t\t<DefStylesheetForXsl>store:///identity.xsl</DefStylesheetForXsl>\n" +
                "\t\t\t<DefXQueryForJSON>store:///reject-all-json.xq</DefXQueryForJSON>\n" +
                "\t\t\t<PolicyMaps>\n" +
                "\t\t\t\t<Match class=\"Matching\">serviceName_Stub_MR</Match>\n" +
                "\t\t\t\t<Rule class=\"StylePolicyRule\">serviceName_Stub_Policy_rule_0</Rule>\n" +
                "\t\t\t</PolicyMaps>\n" +
                "\t\t</StylePolicy>\n" +
                "\t\t<PolicyAttachments name=\"serviceName_Stub\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<EnforcementMode>enforce</EnforcementMode>\n" +
                "\t\t\t<PolicyReferences>on</PolicyReferences>\n" +
                "\t\t\t<SLAEnforcementMode>allow-if-no-sla</SLAEnforcementMode>\n" +
                "\t\t</PolicyAttachments>\n" +
                "\t\t<MultiProtocolGateway name=\"serviceName_Stub\" xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dp=\"http://www.datapower.com/schemas/management\">\n" +
                "\t\t\t<mAdminState>enabled</mAdminState>\n" +
                "\t\t\t<Priority>normal</Priority>\n" +
                "\t\t\t<FrontProtocol class=\"HTTPSourceProtocolHandler\">serviceName_Stub_HTTP_FSH</FrontProtocol>\n" +
                "\t\t\t<XMLManager class=\"XMLManager\">default</XMLManager>\n" +
                "\t\t\t<SSLClientConfigType>proxy</SSLClientConfigType>\n" +
                "\t\t\t<DefaultParamNamespace>http://www.datapower.com/param/config</DefaultParamNamespace>\n" +
                "\t\t\t<QueryParamNamespace>http://www.datapower.com/param/query</QueryParamNamespace>\n" +
                "\t\t\t<PropagateURI>on</PropagateURI>\n" +
                "\t\t\t<MonitorProcessingPolicy>terminate-at-first-throttle</MonitorProcessingPolicy>\n" +
                "\t\t\t<RequestAttachments>strip</RequestAttachments>\n" +
                "\t\t\t<ResponseAttachments>strip</ResponseAttachments>\n" +
                "\t\t\t<RequestAttachmentsFlowControl>off</RequestAttachmentsFlowControl>\n" +
                "\t\t\t<ResponseAttachmentsFlowControl>off</ResponseAttachmentsFlowControl>\n" +
                "\t\t\t<RootPartNotFirstAction>process-in-order</RootPartNotFirstAction>\n" +
                "\t\t\t<FrontAttachmentFormat>dynamic</FrontAttachmentFormat>\n" +
                "\t\t\t<BackAttachmentFormat>dynamic</BackAttachmentFormat>\n" +
                "\t\t\t<MIMEFrontHeaders>on</MIMEFrontHeaders>\n" +
                "\t\t\t<MIMEBackHeaders>on</MIMEBackHeaders>\n" +
                "\t\t\t<StreamOutputToBack>buffer-until-verification</StreamOutputToBack>\n" +
                "\t\t\t<StreamOutputToFront>buffer-until-verification</StreamOutputToFront>\n" +
                "\t\t\t<MaxMessageSize>0</MaxMessageSize>\n" +
                "\t\t\t<GatewayParserLimits>off</GatewayParserLimits>\n" +
                "\t\t\t<ParserLimitsElementDepth>512</ParserLimitsElementDepth>\n" +
                "\t\t\t<ParserLimitsAttributeCount>128</ParserLimitsAttributeCount>\n" +
                "\t\t\t<ParserLimitsMaxNodeSize>33554432</ParserLimitsMaxNodeSize>\n" +
                "\t\t\t<ParserLimitsForbidExternalReferences>on</ParserLimitsForbidExternalReferences>\n" +
                "\t\t\t<ParserLimitsExternalReferences>forbid</ParserLimitsExternalReferences>\n" +
                "\t\t\t<ParserLimitsMaxPrefixes>1024</ParserLimitsMaxPrefixes>\n" +
                "\t\t\t<ParserLimitsMaxNamespaces>1024</ParserLimitsMaxNamespaces>\n" +
                "\t\t\t<ParserLimitsMaxLocalNames>60000</ParserLimitsMaxLocalNames>\n" +
                "\t\t\t<ParserLimitsAttachmentByteCount>2000000000</ParserLimitsAttachmentByteCount>\n" +
                "\t\t\t<ParserLimitsAttachmentPackageByteCount>0</ParserLimitsAttachmentPackageByteCount>\n" +
                "\t\t\t<DebugMode persisted=\"false\">off</DebugMode>\n" +
                "\t\t\t<DebuggerType>internal</DebuggerType>\n" +
                "\t\t\t<DebugHistory>25</DebugHistory>\n" +
                "\t\t\t<FlowControl>off</FlowControl>\n" +
                "\t\t\t<SOAPSchemaURL>store:///schemas/soap-envelope.xsd</SOAPSchemaURL>\n" +
                "\t\t\t<FrontTimeout>120</FrontTimeout>\n" +
                "\t\t\t<BackTimeout>120</BackTimeout>\n" +
                "\t\t\t<FrontPersistentTimeout>180</FrontPersistentTimeout>\n" +
                "\t\t\t<BackPersistentTimeout>180</BackPersistentTimeout>\n" +
                "\t\t\t<IncludeResponseTypeEncoding>off</IncludeResponseTypeEncoding>\n" +
                "\t\t\t<BackHTTPVersion>HTTP/1.1</BackHTTPVersion>\n" +
                "\t\t\t<PersistentConnections>on</PersistentConnections>\n" +
                "\t\t\t<LoopDetection>off</LoopDetection>\n" +
                "\t\t\t<DoHostRewriting>on</DoHostRewriting>\n" +
                "\t\t\t<DoChunkedUpload>off</DoChunkedUpload>\n" +
                "\t\t\t<ProcessHTTPErrors>on</ProcessHTTPErrors>\n" +
                "\t\t\t<HTTPClientIPLabel>X-Client-IP</HTTPClientIPLabel>\n" +
                "\t\t\t<HTTPLogCorIDLabel>X-Global-Transaction-ID</HTTPLogCorIDLabel>\n" +
                "\t\t\t<InOrderMode>\n" +
                "\t\t\t\t<Request>off</Request>\n" +
                "\t\t\t\t<Backend>off</Backend>\n" +
                "\t\t\t\t<Response>off</Response>\n" +
                "\t\t\t</InOrderMode>\n" +
                "\t\t\t<WSAMode>sync2sync</WSAMode>\n" +
                "\t\t\t<WSARequireAAA>on</WSARequireAAA>\n" +
                "\t\t\t<WSAStrip>on</WSAStrip>\n" +
                "\t\t\t<WSADefaultReplyTo>http://schemas.xmlsoap.org/ws/2004/08/addressing/role/anonymous</WSADefaultReplyTo>\n" +
                "\t\t\t<WSADefaultFaultTo>http://schemas.xmlsoap.org/ws/2004/08/addressing/role/anonymous</WSADefaultFaultTo>\n" +
                "\t\t\t<WSAForce>off</WSAForce>\n" +
                "\t\t\t<WSAGenStyle>sync</WSAGenStyle>\n" +
                "\t\t\t<WSAHTTPAsyncResponseCode>204</WSAHTTPAsyncResponseCode>\n" +
                "\t\t\t<WSATimeout>120</WSATimeout>\n" +
                "\t\t\t<WSRMEnabled>off</WSRMEnabled>\n" +
                "\t\t\t<WSRMSequenceExpiration>3600</WSRMSequenceExpiration>\n" +
                "\t\t\t<WSRMDestinationAcceptCreateSequence>on</WSRMDestinationAcceptCreateSequence>\n" +
                "\t\t\t<WSRMDestinationMaximumSequences>400</WSRMDestinationMaximumSequences>\n" +
                "\t\t\t<WSRMDestinationInOrder>off</WSRMDestinationInOrder>\n" +
                "\t\t\t<WSRMDestinationMaximumInOrderQueueLength>10</WSRMDestinationMaximumInOrderQueueLength>\n" +
                "\t\t\t<WSRMDestinationAcceptOffers>off</WSRMDestinationAcceptOffers>\n" +
                "\t\t\t<WSRMFrontForce>off</WSRMFrontForce>\n" +
                "\t\t\t<WSRMBackForce>off</WSRMBackForce>\n" +
                "\t\t\t<WSRMBackCreateSequence>off</WSRMBackCreateSequence>\n" +
                "\t\t\t<WSRMFrontCreateSequence>off</WSRMFrontCreateSequence>\n" +
                "\t\t\t<WSRMSourceMakeOffer>off</WSRMSourceMakeOffer>\n" +
                "\t\t\t<WSRMUsesSequenceSSL>off</WSRMUsesSequenceSSL>\n" +
                "\t\t\t<WSRMSourceMaximumSequences>400</WSRMSourceMaximumSequences>\n" +
                "\t\t\t<WSRMSourceRetransmissionInterval>10</WSRMSourceRetransmissionInterval>\n" +
                "\t\t\t<WSRMSourceExponentialBackoff>on</WSRMSourceExponentialBackoff>\n" +
                "\t\t\t<WSRMSourceMaximumRetransmissions>4</WSRMSourceMaximumRetransmissions>\n" +
                "\t\t\t<WSRMSourceMaximumQueueLength>30</WSRMSourceMaximumQueueLength>\n" +
                "\t\t\t<WSRMSourceRequestAckCount>1</WSRMSourceRequestAckCount>\n" +
                "\t\t\t<WSRMSourceInactivityClose>360</WSRMSourceInactivityClose>\n" +
                "\t\t\t<ForcePolicyExec>off</ForcePolicyExec>\n" +
                "\t\t\t<RewriteErrors>on</RewriteErrors>\n" +
                "\t\t\t<DelayErrors>on</DelayErrors>\n" +
                "\t\t\t<DelayErrorsDuration>1000</DelayErrorsDuration>\n" +
                "\t\t\t<RequestType>xml</RequestType>\n" +
                "\t\t\t<ResponseType>xml</ResponseType>\n" +
                "\t\t\t<FollowRedirects>on</FollowRedirects>\n" +
                "\t\t\t<RewriteLocationHeader>off</RewriteLocationHeader>\n" +
                "\t\t\t<StylePolicy class=\"StylePolicy\">serviceName_Stub_Policy</StylePolicy>\n" +
                "\t\t\t<Type>dynamic-backend</Type>\n" +
                "\t\t\t<AllowCompression>off</AllowCompression>\n" +
                "\t\t\t<AllowCacheControlHeader>off</AllowCacheControlHeader>\n" +
                "\t\t\t<PolicyAttachments class=\"PolicyAttachments\">serviceName_Stub</PolicyAttachments>\n" +
                "\t\t\t<WSMAgentMonitor>off</WSMAgentMonitor>\n" +
                "\t\t\t<WSMAgentMonitorPCM>all-messages</WSMAgentMonitorPCM>\n" +
                "\t\t\t<ProxyHTTPResponse>off</ProxyHTTPResponse>\n" +
                "\t\t\t<TransactionTimeout>0</TransactionTimeout>\n" +
                "\t\t</MultiProtocolGateway>\n" +
                "\t</configuration>\n" +
                "</datapower-configuration>";
        temp=temp.replaceAll("serviceName",Constants.serviceName);
        temp=temp.replaceAll("StubFSHPort",Constants.StubFSHPort);
        temp=temp.replaceAll("matchXpath",Constants.StubMatchXpath);
        String path=Constants.serviceFilesPath+Constants.serviceName+"/temp/Stubconfig.xml";
        DealingWithFiles.writeToFile(temp,path);
    }
}