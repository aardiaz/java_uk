package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		//subject,marks
		//Map<String, Integer>  map = new HashMap<>();
		//Map<String, Integer>  map = new TreeMap<>();
		Map<String, Integer>  map = new LinkedHashMap<>();
		
		map.put("Nepali", 80);
		map.put("Math", 99);
		map.put("Social", 89);
		map.put("Eph", 78);
		map.put("Computer", 90);
		
		
		for(String key : map.keySet() ) {
			System.out.println(key+" = "+map.get(key));
		}
		
		
		
	}

}
