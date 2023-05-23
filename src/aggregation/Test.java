package aggregation;

public class Test {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.setColor("Red");
		c.setCompany("Tesla");
		c.setModel("MX800");
		c.setPrice(25000000);
		
		Employee  emp = new Employee();
		emp.setId(99008);
		emp.setName("Hari Lama");
		emp.setSalary(600000);
		emp.setCar(c);
		
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("====== car info =====");
        System.out.println("Color = "+emp.getCar().getColor());
        System.out.println("Company = "+emp.getCar().getCompany());
        System.out.println("Price = "+emp.getCar().getPrice());
		
		
	}

}
