package Week3;

public class AxisBank extends BankInformation{
	
	public void depoist() {
		System.out.println("New depoist account created");
	}
	
	public void fixed() {
		System.out.println("New fixed account created");
	}
	public static void main(String[] args) {
		AxisBank ac=new AxisBank();
		ac.saving();
		ac.fixed();
		ac.depoist();

	}

	
	}
		
	


