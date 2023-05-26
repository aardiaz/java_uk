package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		//List<String>  list = new ArrayList<>();
		List<String>  list = new LinkedList<>();
		
		list.add("Nepal");
		list.add("China");
		list.add("India");
		list.add("UK");
		list.add("France");
		list.add("Canada");
		
		//list.remove(3);
		list.remove("India");
		//list.clear();
		System.out.println(list.contains("France"));
		
		for(String s : list) {
			System.out.println(s);
		}
		
		
	}

}
