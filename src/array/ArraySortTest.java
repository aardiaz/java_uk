package array;

import java.util.Arrays;

public class ArraySortTest {
	
	public static void main(String[] args) {
		
		int[] values  =  {9,8,76,5,43,45,67,8,97,6,54,5,67};
		
		Arrays.sort(values);
		
		System.out.println(Arrays.toString(values));
		
		System.out.println("====== reverse order =======");
		
		for(int i= values.length - 1; i>=0; i--) {
			System.out.print(values[i]+"  ");
		}
		
	}

}
