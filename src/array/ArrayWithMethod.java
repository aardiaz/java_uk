package array;

import java.util.Arrays;

public class ArrayWithMethod {
	/*
	 * ============ Array With Method ================
	 * a> array as arguments   :
	 *   
	 *      void sum(int[] a){
	 *         
	 *      }
	 *   
	 * b> array as return type :
	 * 
	 *   int[]  get10IntValues(){
	 *      
	 *          //array = 400,4566,677,676,877,878,87,87
	 *        return array;
	 *      }
	 *     
	 */
	
	
	  public static void main(String[] args) {
		  
		  int data[] = {40,35,67,890,98,76,546,78,10,9,80,76,57,89,65,7,86};
		  findSmallestValue(data);
		  
		  int[] oddnums = getOddNumsFrom1To100();
		  System.out.println(Arrays.toString(oddnums));
	}
	  
  //================= array as argument =======================
	
	  static void  findSmallestValue(int array[]) {
		   
		   int sv = array[0]; // 50
		   
		   for(int x : array) {  // x = 40
			   
			   if(sv > x) {
				   sv = x;
			   }
		   }
		   
		   System.out.println("Smallest value = "+sv);
		   
	   }
	
	//===================== array as return type ===========================
	  
	  static int[] getOddNumsFrom1To100() {
		  
		  int oddnums[] = new int[50];
		  
		  int j = 0;
		  
		   for(int i=1; i<=100; i++) {
			   
			   if(i%2 != 0) {
				   
				   oddnums[j] = i;
				   j++;
			   }
		   }
		   return oddnums;
	  }
	

}
