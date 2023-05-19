package datatype;

import java.util.ArrayList;
import java.util.List;

public class WrapperTest {
	/*
	 * =============== Wrapper Class =============
	 *     primitive type       Wrapper type
	 *    ----------------      --------------
	 *       byte					Byte
	 *       short					Short
	 *       int					Integer
	 *       long 					Long
	 *       float					Float
	 *       double					Double
	 *       char					Character
	 *       boolean                Boolean
	 */
	
	public static void main(String[] args) {
		//'a' is primitive variable only
		int a = 800;
		//'b' is wrapper type varible. 
		Integer b = a; //auto boxing
		  
		
		float m = 3434.565f;
		Float k = m;
		
		Double j = 34343434.45454545;
		double v = j; //auto un-boxing
		    
		
		System.out.println(Integer.toBinaryString(8000));
		System.out.println(Integer.toOctalString(8000));
		System.out.println(Integer.toHexString(8000));
	}

}
