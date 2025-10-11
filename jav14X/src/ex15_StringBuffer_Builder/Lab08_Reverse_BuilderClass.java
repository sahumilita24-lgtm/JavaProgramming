package ex15_StringBuffer_Builder;

import java.util.Scanner;

public class Lab08_Reverse_BuilderClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a program to reverse a string without using inbuilt functions.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string, i will reverse it");
        String user_input = scanner.next();
        
        StringBuilder builder = new StringBuilder();
        for(int i = user_input.length()-1; i>=0; i--)
        {
        	builder = builder.append(user_input.charAt(i)) ;
        }
        System.out.println(builder);

	}

}
