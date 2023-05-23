package encapsulation;

public class Test {

	public static void main(String[] args) {

		Customer c = new Customer();

		c.setId(8988);
		c.setName("Shiba Lama");
		c.setAge(30);
		c.setPhone("9834344343");
		
		System.out.println(c);

//		System.out.println("Id =" + c.getId());
//		System.out.println("Name = " + c.getName());
//		System.out.println("Age = " + c.getAge());
//		System.out.println("Phone = " + c.getPhone());
	}

}
