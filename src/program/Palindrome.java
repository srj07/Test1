package program;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "MALAYALAM";
		String d = "";
		for(int i = str.length()-1;i>=0;i--) {
          d = d + str.charAt(i);
		}
		System.out.println(d);
		
		if(str.equals(d)) {
			
			System.out.println(d+" it is palindrome number");
		}
		else {
			
			System.out.println(d+" it is not palindrome number");
		}
	}

}
