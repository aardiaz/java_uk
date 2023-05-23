package oops;

public class Rectangle {
	
	int l;
	int b;
	
	void printArea() {
		int area = l * b;
		System.out.println("Area = "+area);
	}
	
	
	public static void main(String[] args) {
		Rectangle  r = new Rectangle();
		r.l = 500;
		r.b = 40;
		r.printArea();
	}

}
