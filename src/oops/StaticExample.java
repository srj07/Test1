package oops;

public class StaticExample {
	static float pi;
	static {
		pi=3;
		System.out.println(pi);
	}
	public static void main(String[] args) {
		int r=3;
		 float area = pi*r*r;
		 System.out.println(area);
		 StaticEx.display();
	}

}

class StaticEx{
	static int a=5;
	public static void display() {
		System.out.println(a);
	}
}
