package com.xmltostring.main;

/*import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;*/

public class Transaction {
	//Transaction Batch
	
	
	private String MerchantID ;
	
	private String AuthKey ;
	
	private int SequenceID;
	
	//CCTransaction
	
	private String CCTransaction; 
	
	private String TransactionID ;
	
	private String Currency ;
	
	private String Reference;
	
	private String TransactionTime;
	
	private String Domain;
	
	//Customer
	
	private String Customer;
	
	private String CustomerID;
	
	private String CustomerReference ;
	
	private String Firstname;
	private String Lastname;
	private String AddressOne;
	private String City;
	private String State;
	private int Zipcode;
	private String Email;
	private String Country;
	private String DateOfBirth;
	private int Last4SSN;
	private String Phone;
	private String UserName;
	
	//BANK
	private String Bank;
	private String IPAddress;
	private String CardType;
	private String PaymentType;
	private double Amount;
    private String NameOnCC;
    private String CardNumber;
    private int ExpMonth;
    private int ExpYear;
    private int CVV;
    private String UserAgent;
    private String HttpAccept;
    private String Return_Url ;
    private String Url3D;
    private String Status;
	public String getMerchantID() {
		return MerchantID;
	}

	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	
	public String getAuthKey() {
		return AuthKey;
	}
	
	public void setAuthKey(String authKey) {
		AuthKey = authKey;
	}
	public int getSequenceID() {
		return SequenceID;
	}
	
	public void setSequenceID(int sequenceID) {
		SequenceID = sequenceID;
	}
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String transactionID) {
		TransactionID = transactionID;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getReference() {
		return Reference;
	}
	public void setReference(String reference) {
		Reference = reference;
	}
	public String getTransactionTime() {
		return TransactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		TransactionTime = transactionTime;
	}
	public String getDomain() {
		return Domain;
	}
	public void setDomain(String domain) {
		Domain = domain;
	}
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	public String getCustomerReference() {
		return CustomerReference;
	}
	public void setCustomerReference(String customerReference) {
		CustomerReference = customerReference;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getAddressOne() {
		return AddressOne;
	}
	public void setAddressOne(String addressOne) {
		AddressOne = addressOne;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZipcode() {
		return Zipcode;
	}
	public void setZipcode(int zipcode) {
		Zipcode = zipcode;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public int getLast4SSN() {
		return Last4SSN;
	}
	public void setLast4SSN(int last4ssn) {
		Last4SSN = last4ssn;
	}
	
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone =  phone;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}
	public String getCardType() {
		return CardType;
	}
	public void setCardType(String cardType) {
		CardType = cardType;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public String getNameOnCC() {
		return NameOnCC;
	}
	public void setNameOnCC(String nameOnCC) {
		NameOnCC = nameOnCC;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public int getExpMonth() {
		return ExpMonth;
	}
	public void setExpMonth(int expMonth) {
		ExpMonth = expMonth;
	}
	public int getExpYear() {
		return ExpYear;
	}
	public void setExpYear(int expYear) {
		ExpYear = expYear;
	}
	public int getCVV() {
		return CVV;
	}
	public void setCVV(int cVV) {
		CVV = cVV;
	}
	public String getUserAgent() {
		return UserAgent;
	}
	public void setUserAgent(String userAgent) {
		UserAgent = userAgent;
	}
	public String getHttpAccept() {
		return HttpAccept;
	}
	public void setHttpAccept(String httpAccept) {
		HttpAccept = httpAccept;
	}
	public String getReturn_Url() {
		return Return_Url;
	}
	public void setReturn_Url(String return_Url) {
		Return_Url = return_Url;
	}
	public String getUrl3D() {
		return Url3D;
	}
	public void setUrl3D(String url3d) {
		Url3D = url3d;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "CCTransaction [MerchantID=" + MerchantID + ", AuthKey=" + AuthKey + ", SequenceID=" + SequenceID
				+ ", TransactionID=" + TransactionID + ", Currency=" + Currency + ", Reference=" + Reference
				+ ", TransactionTime=" + TransactionTime + ", Domain=" + Domain + ", CustomerID=" + CustomerID
				+ ", CustomerReference=" + CustomerReference + ", Firstname=" + Firstname + ", Lastname=" + Lastname
				+ ", AddressOne=" + AddressOne + ", City=" + City + ", State=" + State + ", Zipcode=" + Zipcode
				+ ", Email=" + Email + ", Country=" + Country + ", DateOfBirth=" + DateOfBirth + ", Last4SSN="
				+ Last4SSN + ", Phone=" + Phone + ", UserName=" + UserName + ", IPAddress=" + IPAddress + ", CardType="
				+ CardType + ", PaymentType=" + PaymentType + ", Amount=" + Amount + ", NameOnCC=" + NameOnCC
				+ ", CardNumber=" + CardNumber + ", ExpMonth=" + ExpMonth + ", ExpYear=" + ExpYear + ", CVV=" + CVV
				+ ", UserAgent=" + UserAgent + ", HttpAccept=" + HttpAccept + ", Return_Url=" + Return_Url + ", Url3D="
				+ Url3D + ", Status=" + Status + "]";
	}
    
    
	
	
	

}
