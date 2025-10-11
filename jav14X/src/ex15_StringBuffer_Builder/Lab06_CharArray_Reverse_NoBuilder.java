package ex15_StringBuffer_Builder;

import java.util.Scanner;

public class Lab06_CharArray_Reverse_NoBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to reverse a string without using inbuilt functions.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the input string, i will reverse it: ");
		String userInput = sc.nextLine();
		
		/*//used for loop only reverse with String
		 * for (int i= userInput.length()-1; i>=0; i --) {
		 * System.out.print(userInput.charAt(i)); }
		 */
		
		//using char array
		char[] inputchars = userInput.toCharArray();
		String reverse= "";
		for (int i= inputchars.length-1; i>= 0; i--)
		{
			reverse = reverse + inputchars[i];
		}
		System.out.println(reverse);
	}

}
