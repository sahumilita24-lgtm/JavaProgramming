package ex08_if_condition;

import java.util.Scanner;

public class Lab03_if_else_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Allowed to vote or not - age
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        // How to take the user Input
        // 1. CLI Options
        //
//        int age = Integer.parseInt(args[0]);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Age");
		int userAge=  sc.nextInt();
		if (userAge >= 18)
		{
			System.out.println("you are allowed to vote");
		}
		else System.out.println("Not allowed for vote");

	}

}
