package methodoverriding;

public class CentralBank {
	
	protected void getBankName() {
		System.out.println("Central Bank");
	}
	
	protected void getInterestRate() {
		System.out.println("0");
	}
	
	public void moneyExRate() {
		System.out.println("$1 = 132");
		System.out.println("KDD  1 = 16");
		System.out.println("Yen 10 = 10");
	}

}
