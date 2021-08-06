package oops;

public class StaticTest {
	
	
	static int a= test();
	 static int b;
	
	static {
		System.out.println("static test");
		
		b = a+5;
	}
	
   static int  test() {
	   
		System.out.println("test method");
		return a;
	}
   
   

	public static void main(String[] args) {

		System.out.println("sum=" +b);
		TestMethods tm =new TestMethods();
		tm.display();	
		TestMethods.display();
	}

}
