package ex09_Switch;

import java.util.Scanner;

public class Lab01_Switch_weekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        // you will tell which day it is.

        // Logic Building Formula

        // Step 1 - Number one is using the Scanner class.
        // Step 2 number two will be basically figuring out the expression and the day.
        // Step 3- We will basically add step 3 as a rough logic.
        // Step 4 - 4 is you will write the fix the logic and optimize.
        // Step 5 - figure out the edge cases.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day from 1-7 to get the day: ");
		
		
		if (sc.hasNextInt()) 
			
	  /*nextInt() consumes input right away. By the time you check hasNextInt(), it’s too late.
	    so putting it after has next check*/
			
		{
			int day= sc.nextInt();
			switch (day)
			{
			case 1:
			
				System.out.println("Sunday");
				break;
				
			case 2:
				System.out.println("Monday");
				break;
				
			case 3:
				System.out.println("Tuesday");
				break;
				
			case 4:
				System.out.println("Wednesday");
				break;

			case 5:
				System.out.println("Thurday");
				break;
	
			case 6:
				System.out.println("Friday");
				break;

			case 7:
				System.out.println("Saturday");
				break;
	
			default: System.out.println("Pleas input numbers between 1-7 only:");
			
			
			}
		}
		
		else System.out.println("Hey, Please input int number only");

	}

}
