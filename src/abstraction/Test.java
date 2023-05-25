package abstraction;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	
	public static void main(String[] args) {
		
		  CentralBank  b = new PrabhuBank();
		  b.getBankName();
		  b.getInterestRate();
		  
		  UserService  us = new UserServiceImpl();
		  
		  us.addUser();
		  us.deleteUser();
		  us.print();
		  
//		  CommonService  cs = new UserServiceImpl();
//		  cs.print();
		  
	}

}
