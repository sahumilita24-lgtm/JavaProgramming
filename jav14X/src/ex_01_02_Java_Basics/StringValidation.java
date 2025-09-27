package ex_01_02_Java_Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class StringValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Milita";
		System.out.println(name);
		ArrayList<String> marks = new ArrayList<String>();
		marks.add("two");
		marks.add("three");
		for(String a: marks )
		{
			System.out.println(a + " :here is the mark");
		}
		int a, b;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number one: ");
		
		a= scanner.nextInt();
		System.out.print("Enter number Two: ");
		b= scanner.nextInt();
		

	}

}
