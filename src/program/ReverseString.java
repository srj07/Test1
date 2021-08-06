package program;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Please provide numbers");
		int num = scn.nextInt();
		StringBuffer sbf= new StringBuffer(String.valueOf(num));
		StringBuffer rev=  sbf.reverse();
		System.out.println("reversed number is "+ rev);
		}
	
	}


