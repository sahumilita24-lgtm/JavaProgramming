package ex15_StringBuffer_Builder;

public class Lab07_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Madam - is a palindrome
		
		//String input= "Madam";
		String input = "naman";
		String reverse= "";
		for (int i = input.length()-1; i >=0; i--)
		{
			reverse = reverse + input.charAt(i);
		}
		System.out.println(reverse);
		
		if (reverse.equalsIgnoreCase(input)) System.out.println("IS Palindrome: " + input);
		else System.out.println("not a palindrome");

	}

}
