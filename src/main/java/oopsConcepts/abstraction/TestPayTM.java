package oopsConcepts.abstraction;

public class TestPayTM { // multiple inheritance

	public static void main(String[] args) { 

		PayTM pt = new PayTM();
	
		pt.makePayment(6455232444l, 35325325232444l);
		
		pt.getPayment(6455232444l, 35325325232444l);
		
		pt.checkYourAccountBalance(6455232444l);
		
		pt.checkYourAccountBalance1(0);
		
		pt.checkYourAccountBalance2(0);
		
	//	ICICI_Bank ib = new ICICI_Bank();
		
	}

}
