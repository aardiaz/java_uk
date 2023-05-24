package methodoverriding;

public class Test {
	
	public static void main(String[] args) {
		
		//static or early binding of object
		LaxmiBank  lb = new LaxmiBank();
		
		lb.getBankName();
		lb.getInterestRate();
		
		//up-casting
		CentralBank  b = new LaxmiBank();
	}
	
	//late or dynamic binding of object
	//run time polymorphism
	void printBankInfo(CentralBank  bk) {
		bk.getBankName();
		bk.getInterestRate();
	}
	 

}
