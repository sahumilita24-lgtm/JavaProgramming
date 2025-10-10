package ex11_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Lab03_While_GuessGameRandom_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Edge cases- 1 invalid entered 2. not within 0-100 3. if less value entered 4. if high value
		
		Random random = new Random();
		int randomnum= random.nextInt(100);
		int attempts=0;
		//System.out.println(randomnum);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please guess number between 0-100");
		while(true) {
		if(!sc.hasNextInt()) 
			{
				System.out.println("Invalid input! Please enter a number.");	
				sc.next(); continue; }
		
		
		int guess = sc.nextInt();
		attempts ++;
			if (guess > 100 || guess < 0) 
			{
				System.out.println("Please enter a number between 1 and 100.");
		     continue;
		     }
		
	
			if (guess < randomnum)
				{System.out.println("Too Low, Try again"); 		
				}
				
			else if (guess > randomnum) 
				{System.out.println("Too high Try again"); 
				}
			if (guess == randomnum) {
				System.out.println("Right value entered ," + randomnum +"attempts: " + attempts );
				break;
			}
		}
	



	}
}
