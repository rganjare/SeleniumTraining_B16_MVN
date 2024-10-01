package oopsConcepts.abstraction;

public abstract class ICICI_Bank {
	
	// abstract class can have Static and Non Static methods
	// abstract Class can have Signature of methods or/and implemetation as well
	// Object creation is not allowed
	
	public ICICI_Bank() { // Constructor
		System.out.println("I am in the super class- ICICI_Bank");
	}
	
	public static void makePayment(long fromAccount, long toAccount) {
		
		System.out.println("Code to make fund transfer " + fromAccount + "to " +toAccount);
		
	}
	
	public void getPayment(long fromAccount, long toAccount) {
		System.out.println("Code to get/receive fund transfer " + fromAccount + "to " +toAccount);
	}
	
	public static void checkYourAccountBalance(long accountNo) {
		// SQL - Select Balance from XYZ table where customer account no = accountNo;
		System.out.println("Your account balance is: 5,00,000.43");
	}
	
	public abstract void checkYourAccountBalance1(long accountNo);
	
	public final void checkYourAccountBalance2(long accountNo) {
		// SQL - Select Balance from XYZ table where customer account no = accountNo;
		System.out.println("Your account balance is: 5,00,000.43");
	}

}
