package oopsConcepts.encapsulation;

public class ICICI_Bank { // RBI // Encapsulation
	
	private long accountNo; 
	private double accountBalance;
	private String accountOwner;
	private double contactNo;
	private String address;
	private String emailAddress;
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public double getAccountBalance() {
		
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = 200000 + accountBalance;
		//accountBalance = 200000; // existing account balance
		//SQl - Update your existing account balance + accountBalance
	}
	public String getAccountOwner() {
		// accountOwner = Select getAccountOwner from xyz table where account number = accountNo;
		accountOwner = "accountOwner name";
		return accountOwner;
	}
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	public double getContactNo() {
		return contactNo;
	}
	public void setContactNo(double contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailAddress() {
	//	emailAddress =  Select emailAddress from xyz table where account number = accountNo;
		//emailAddress = "accountOwner name";
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		
		//SQl - Update your new email address
	}

}
