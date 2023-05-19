package method;

public class Test2 {
	
	public static void main(String[] args) {
		int x = getArea(766, 7676);
		volume(x, 80);
	}
	
	static int getArea(int l, int b) {
		
		int area = l * b;
		return area;
	}
	
	static void volume(int x,  int h) {
		int v = x * h;
		System.out.println("Area = "+x);
		System.out.println("Volume = "+v);
	}

}
