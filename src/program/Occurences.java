package program;

public class Occurences {

	public static void main(String[] args) {

		String input = "Hello Welcome to hutryyd";
		char sea = 'y';
		
		long count = input.chars().filter(ch->ch== sea).count();
		System.out.println("The character'"  +sea+  "'appears'"  +count+  "'times");
				
		

	}

}
