<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Product</name>
   <tag></tag>
   <elementGuidId>2b1edba4-5f26-44c9-89a8-dafda8795bc9</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;name\&quot;: \&quot;${product_name}\&quot;,\n  \&quot;price\&quot;: ${product_price},\n  \&quot;categories\&quot;: [\n    3,\n    6\n  ]\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/plain</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://be-qa.alta.id/api/products</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'Vakum Cleaner'</defaultValue>
      <description></description>
      <id>8eb6b64d-52d6-4dff-97ee-65c388c2a0df</id>
      <masked>false</masked>
      <name>product_name</name>
   </variables>
   <variables>
      <defaultValue>500000</defaultValue>
      <description></description>
      <id>2e24bd90-24ff-40e5-aacb-8e345c1d65ce</id>
      <masked>false</masked>
      <name>product_price</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
WS.verifyElementPropertyValue(response, 'data.Name', &quot;Vakum Cleaner&quot;)
WS.verifyElementPropertyValue(response, 'data.Price', 500000)
WS.verifyElementPropertyValue(response, 'data.Categories[0].ID', 3)
WS.verifyElementPropertyValue(response, 'data.Categories[1].ID', 6)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
