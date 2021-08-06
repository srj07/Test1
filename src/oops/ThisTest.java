package oops;

public class ThisTest {
	
	
	void display() {
		
		this.test();
		System.out.println("display method");


	}
	void test() {
		System.out.println("test");
                                                    
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisTest tt = new ThisTest();
		tt.display();
		
	}

}
