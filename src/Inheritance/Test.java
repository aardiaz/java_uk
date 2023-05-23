package Inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Programmer  p = new Programmer();
		
		p.id = 3434;
		p.name = "Hari";
		p.salary = 400000;
		p.bonus = 50000;
		p.progLang = "java";
		p.project = "CMS";
		p.company = "Meta";
		
		p.print();
	}

}
