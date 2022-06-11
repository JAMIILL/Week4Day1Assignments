package Week4Day1Assignments;

public class AxisBank extends Bankinfo {
	
	public void deposit ()
	{
		 System.out.println("deposit override");
	}

	public static void main(String[] args) {
	
		AxisBank call = new AxisBank();
		call.deposit();
		call.savings();
		call.fixed();
		
	}

}
