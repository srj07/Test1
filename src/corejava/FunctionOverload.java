package corejava;

public class FunctionOverload {
	
	public void getData() {
		System.out.println("a");
	}
	public void getData(String data) {
		System.out.println(data);
	}
	public void getData(int a) {
		System.out.println(a);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverload fo = new FunctionOverload();
		fo.getData();
		fo.getData("5");
		fo.getData("Test");
	}

}
