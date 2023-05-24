package methodoverriding;

public class NMBBank extends CentralBank {
	
	@Override
	protected void getBankName() {
		 System.out.println("NMB Bank");
	}
	
	@Override
	protected void getInterestRate() {
		System.out.println("12%");
	}

}
