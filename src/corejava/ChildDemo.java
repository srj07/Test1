package corejava;

public class ChildDemo extends ParentDemo{
	
	 public void message()
	    {
		  super.message();
	        System.out.println("This is Test class");
}
	 public ChildDemo(){
	 
	        System.out.println("This is Constructor");

	 }
public static void main(String[] args) {
	
	ChildDemo pd = new ChildDemo();
	 pd.message();
	
}}