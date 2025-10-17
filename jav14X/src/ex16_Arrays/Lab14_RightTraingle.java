package ex16_Arrays;

import java.util.Scanner;

public class Lab14_RightTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
		*
		* *
		* * *
	*/
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter the n for the pattern, e.g n = 3");
	     int n = scanner.nextInt();
		for(int i= 0; i < n; i++)
		{
			for (int j = 0 ; j <= i; j ++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
