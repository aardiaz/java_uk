package oops;

public class Test {
	
	public static void main(String[] args) {
		
		Book b = new Book();
		
		b.id = 555;
		b.name ="Nepali";
		b.author = "MD.Bhatta";
		b.price = 9000;
		
		b.printBook();
		
		Book b1 = new Book();
		
		b1.id = 34534;
		b1.name ="Math";
		b1.author = "C.Joshi";
		b1.price = 2000;
		
		b1.printBook();
		
	}

}
