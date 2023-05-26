package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String[] args) {
		
		//Set<String>  set = new HashSet<>();
		//Set<String>  set = new TreeSet<>();
		Set<String>  set = new LinkedHashSet<>();
		
		set.add("java");
		set.add("php");
		set.add("android");
		set.add("java");
		set.add("sql");
		set.add("python");
		
		for(String s : set) {
			System.out.println(s);
		}
		
		
		
	}

}
