package oopsConcepts.encapsulation;

public class TestEncapsulation {
	
	public static void main(String[] args) {
		
		ICICI_Bank ib = new ICICI_Bank();
		
		ib.setAccountNo(434234535353562424l);
		
		ib.getAccountBalance();
		System.out.println(ib.getAccountOwner());
		
		ib.setEmailAddress("asdad.sdfsfd@dads.com");
		System.out.println(ib.getEmailAddress());
		
		ib.setAccountBalance(20000);
		System.out.println(ib.getAccountBalance());
	}

}
