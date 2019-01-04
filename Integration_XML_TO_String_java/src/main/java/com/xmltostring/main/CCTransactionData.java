package com.xmltostring.main;

import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class CCTransactionData {
	public Transaction creditCardTransactionResponse() {
		Transaction transaction = new Transaction();
		transaction.setMerchantID("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxx");
		transaction.setAuthKey("1234567");
		transaction.setSequenceID(1);
		transaction.setTransactionID("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxx");
		transaction.setCurrency("USD");
		transaction.setReference("xxxxxxxx");
		transaction.setTransactionTime("12/31/2010 1:15:09 PM>12/31/2010 1:15:09 PM");
		transaction.setDomain("http://www.gopi.com");
		transaction.setCustomerID("AND000011223344");
		transaction.setCustomerReference("123w");
		transaction.setFirstname("yatam");
		transaction.setLastname("gopi");
		transaction.setAddressOne("Road 987 Street 3");
		transaction.setCity("Hyderabad");
		transaction.setState("telangana");
		transaction.setZipcode(500073);
		transaction.setEmail("yatamgopi@gmail.com");
		transaction.setCountry("india");
		transaction.setDateOfBirth("27/11/1996");
		transaction.setLast4SSN(1234);
		transaction.setPhone("9490027026");
		transaction.setUserName("gopiyatam");
		transaction.setIPAddress("192.168.1.1");
		transaction.setCardType("MasterCard");
		transaction.setPaymentType("creditcard");
		transaction.setAmount(25.00);
		transaction.setNameOnCC("gopiyatam");
		transaction.setCardNumber("0123456789101112");
		transaction.setExpMonth(02);
		transaction.setExpYear(2022);
		transaction.setCVV(234);
		transaction.setUserAgent("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; .NET CLR 1.1.4322; .NET\r\n"
				+ "CLR 2.0.50727; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729; .NET4.0C; .NET4.0E)");
		transaction.setHttpAccept("*/*");
		transaction.setReturn_Url("https://returnurl.com");
		transaction.setUrl3D(" ");
		transaction.setStatus("initial");

		return transaction;

	}

	public String javaObjectTOXML() {
		CCTransactionData impl = new CCTransactionData();
		Transaction trans = impl.creditCardTransactionResponse();
		StringBuilder builder=new StringBuilder();
		  builder.append("<TransactionBatch MerchantID='" + trans.getMerchantID() + "' " + " AuthKey='" + trans.getAuthKey() + "'>\n");
		  builder.append("<Transaction SequenceID='" + trans.getSequenceID() + " '>\n");
		  builder.append("<CCTransaction>\n");
		  builder.append("<TransactionID>" + trans.getTransactionID() + "</TransactionID>\n" );
		  builder.append("<Currency>" + trans.getCurrency() + "</Currency>\n");
		  builder.append("<Reference>" + trans.getReference() + "</Reference>\n");
		  builder.append("<TransactionTime>" + trans.getTransactionTime() + "</TransactionTime>\n");
		  builder.append("<Notes></Notes>");
		  builder.append("<Customer>\n");
		  builder.append("<CustomerID >" +trans.getCustomerID() + "</CustomerID>\n");
		  builder.append("<CustomerReference>"  +  trans.getCustomerReference() + "</CustomerReference>\n");
		  builder.append("<FirstName>" +  trans.getFirstname() + "</FirstName>\n");
		  builder.append("<Initial>JS</Initial>\n");
		  builder.append("<LastName>" + trans.getLastname() + "</LastName>\n");
		  builder.append("<AddressOne>" +trans.getAddressOne() + "</AddressOne>\n");
		  builder.append("<City>" + trans.getCity() + "</City>\n");
		  builder.append("<State>" + trans.getState() + "</State>\n");
		  builder.append("<ZipCode>" + trans.getZipcode() + "</ZipCode>\n");
		  builder.append("<Email>" + trans.getEmail() +"</Email>\n");
		  builder.append("<Country>" + trans.getCountry() + "</Country>\n");
		  builder.append("<DateOfBirth>" + trans.getDateOfBirth() + "</DateOfBirth>\n");
		  builder.append("<Last4SSN>" + trans.getLast4SSN() + "</Last4SSN>/n");
		  builder.append("<Phone>" + trans.getPhone() + "</Phone>\n");
		  builder.append("<UserName>" + trans.getUserName() +"</UserName>\n");
		  builder.append("</Customer>\n");
		  builder.append("<Bank>");
		  builder.append("<Name>Anybank</Name>\n");
		  builder.append("<City>Anytown</City>\n");
		  builder.append("<State>TA</State>\n");
		  builder.append("<Phone>1231231231</Phone>\n");
		  builder.append("</Bank>");
		  builder.append("<IPAddress>" + trans.getIPAddress() + "</IPAddress>");
		  builder.append("<CardType>" + trans.getCardType() + "</CardType>");
		  builder.append("<PaymentType>" + trans.getPaymentType() + "</PaymentType>");
		  builder.append("<Amount>" + trans.getAmount() + "</Amount>");
		  builder.append("<NameOnCC>" + trans.getNameOnCC() +"</NameOnCC>");
		  builder.append("<CardNumber>" + trans.getCardNumber() + "</CardNumber>");
		  builder.append("<ExpMonth>" + trans.getExpMonth() + "</ExpMonth>");
		  builder.append("<ExpYear>" + trans.getExpYear() + "</ExpYear>");
		  builder.append("<CVV>" + trans.getCVV() + "</CVV>");
		  builder.append("<UserAgent>" + trans.getUserAgent() +"</UserAgent>");
		  builder.append("<HttpAccept>" + trans.getHttpAccept() + "</HttpAccept>");
		  builder.append("<GMTO></GMTO>");
		  builder.append("<URL3D>http://test-acs.fort7pay.com/test/</URL3D>");
		  builder.append("<Status>" + trans.getStatus() +"</Status>");
		  builder.append("<StatusDescription>Transaction successfully completed</StatusDescription>");
		  builder.append("<Descriptor>x</Descriptor>");
		  builder.append("</CCTransaction>");
		  builder.append("</Transaction>");
		  builder.append("</TransactionBatch>");
		  
	 
		return builder.toString();
	}

	public void sendPOST() throws IOException {
		CCTransactionData impl = new CCTransactionData();
		String POST_PARAMS = impl.javaObjectTOXML();
		
		String POST_URL = "http://localhost:2019/ccTransactionData";
		String responseString=null;
		 
		DefaultHttpClient httpClient = new DefaultHttpClient();
		 try
		    {
			 
			      // HttpHost proxy = new HttpHost("173.194.39.209",8080);
			
		        
		        //Define a postRequest request
		        HttpPost postRequest = new HttpPost(POST_URL);
		        
		      
		         
		        //Set the API media type in http content-type header
		        postRequest.addHeader("content-type", "application/xml");
		         
		        //Set the request post body
		        StringEntity userEntity = new StringEntity(POST_PARAMS);
		        postRequest.setEntity(userEntity);
		          
		        //Send the request; It will immediately return the response in HttpResponse object if any
		        HttpResponse response = httpClient.execute(postRequest);
		         
		        //verify the valid error code first
		        int statusCode = response.getStatusLine().getStatusCode();
		       System.out.println("StatusCode :"+statusCode);
		        if (statusCode == 200) { // success
		        	HttpEntity entity = response.getEntity();
			         responseString = EntityUtils.toString(entity, "UTF-8");
			         
		            System.out.println(responseString);

					}else {
						throw new RuntimeException("Failed with HTTP error code : " + statusCode);
					}
		        
                            
				Document doc = convertStringToXMLDocument(responseString);
					doc.getDocumentElement().normalize();

					NodeList nodeList = doc.getElementsByTagName("Status");

					for (int i = 0; i < nodeList.getLength(); i++) { // Get element
						Element element = (Element) nodeList.item(i);
						System.out.println("Status=" + element.getTextContent());
					}
		    }finally
				    {
				        //Important: Close the connect
				        httpClient.getConnectionManager().shutdown();
				    }
	}

	private static Document convertStringToXMLDocument(String xmlString) {
		// Parser that produces DOM object trees from XML content
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		// API to obtain DOM Document instance
		DocumentBuilder builder = null;
		try {
			// Create DocumentBuilder with default configuration
			builder = factory.newDocumentBuilder();

			// Parse the content to Document object
			Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
