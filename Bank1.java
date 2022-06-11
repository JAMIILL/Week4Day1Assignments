package Week4Day1Assignments;

public class Bank1  extends SBI {

	@Override
	public void bankBalance() {
		System.out.println("bankBalance");
		
	}

	@Override
	public void maximumLoanAmount() {
		System.out.println("maximumLoanAmount");
		
	}
	public static void main(String[] args) {
	
//		Bank1 call = new Bank1();
//		call.ITLoan(); 
//		call.bankBalance();
//		call.maximumLoanAmount();			

		SBI call1 = new Bank1();
		call1.ITLoan(); 
		call1.bankBalance();
		call1.maximumLoanAmount();
		
		
		Bank obj = new Bank();
		obj.cibilScore();
		obj.minimumBalance();
		obj.creditScore();
	
		
	
		
		
		
		
	}
}
 