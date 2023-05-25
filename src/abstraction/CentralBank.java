package abstraction;

public abstract class CentralBank {
	
	protected abstract void getBankName();
	protected abstract void getInterestRate();
	
	public void moneyExRate() {
		System.out.println("$1 = 132");
		System.out.println("KDD  1 = 16");
		System.out.println("Yen 10 = 10");
	}

}
