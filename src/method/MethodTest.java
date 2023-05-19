package method;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
		//add();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any number ");
//		int n = sc.nextInt();
//		
//		printTable(n);
		
		  int x = getSumOf1To100();
		  System.out.println("Sum of 1 to  100 = "+x);
		  
		  int sv = findSmallest(7689, 98765);
		  System.out.println("Smallest value = "+sv);
		
	}
	
	//1. no return type with no arguments
   static void add() {
		 
		 int a = 789;
		 int b =545334;
		 
		 int c = a + b;
		 System.out.println("Sum = "+c);
	 }
	
  //2. no return type with arguments
  static void printTable(int n) {
	   
	   for(int i=1; i<=10; i++) {
		   
		   System.out.println(n+" x "+i+" = "+(n*i));
	   }
   }
  
  //3. return type with no arguments
  
     static int  getSumOf1To100() {
    	 
    	 int s = 0;
    	 for(int i=1; i<=100; i++) {
    		 s = s + i;
    	 }
    	 
    	 return s;
     }
     
     //4. return type with arguments
     
    static int findSmallest(int x, int y ) {
    	 
    	   if(x < y) {
    		   return x;
    	   }
    	   
    	   return y;
     }

}
