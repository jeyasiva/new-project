package prractise;

import java.util.Scanner;

public class Polindrome {
	public static void main(String[] args) {
		
		
		//integer polindrome 
		/*
		 * Scanner a = new Scanner(System.in); System.out.println("Enter the intger: ");
		 * int input = a.nextInt(); int output= 0;
		 * 
		 * for (int i = input; i>0; i=i/10) { int rem=i%10; output = (output*10)+rem; }
		 * 
		 * if (input==output) { System.out.println("polindrome");
		 * 
		 * } else { System.out.println("Not polindrome"); }
		 */
		//String polindrome 
		
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input1= b.nextLine();
		
		String rev= "";
		
		for(int i=input1.length()-1; i>=0; i-- ) {
			rev = rev+input1.charAt(i);
			continue;
		}
		System.out.println(rev);
		
		
		if (rev.equals(input1)) {
			System.out.println("polindrom-string");
		} else {
			System.out.println("not polindrome string ");
		
		
		
	}

}}
