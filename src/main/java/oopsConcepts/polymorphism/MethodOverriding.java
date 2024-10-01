package oopsConcepts.polymorphism;

public class MethodOverriding {
	
	// Dynamic Binding Or run time polymorphism
	// Inheritance relation (Parent child class)
	// Overriden method should have same data type as that of parent class
	// Child class method should have their implementation and override with parent class methods
	// Object of the child class should be assign to the reference variable of parent class
	
	public static void main(String[] args) {
		
		RBI_Bank rb_sbi = new SBI_Bank();
		
		System.out.println(rb_sbi.homeLoanRateOfInterest());
		System.out.println(rb_sbi.personalLoanRateOfInterest());
		System.out.println("##################################");
		
		RBI_Bank rb_icici = new ICICI_Bank();
		
		System.out.println(rb_icici.homeLoanRateOfInterest());
		System.out.println(rb_icici.personalLoanRateOfInterest());
		System.out.println("##################################");
		
		RBI_Bank rb_HD = new HDFC_Bank();
		
		System.out.println(rb_HD.homeLoanRateOfInterest());
		System.out.println(rb_HD.personalLoanRateOfInterest());
	}

}
