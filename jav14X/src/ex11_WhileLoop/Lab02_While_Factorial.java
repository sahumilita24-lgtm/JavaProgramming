package ex11_WhileLoop;

import java.util.Scanner;

public class Lab02_While_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Factorial Program

        // The logic building formula we are discussing.
        // Step number one, you have to figure out what is the data type for input and output.
        // Step number two, write a rough logic around this.
        // Step number three, write a proper logic around this.
        // Step number four, optimize.
        // Step number five, which is edge cases.
		
		//5= 5 4 3 2 1
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number to get Factorial: ");
		if(!sc.hasNext()) System.out.println("Please enter Integer only!!!");
		else
		{
			int num = sc.nextInt();
			
			if (num==0)
			{
				System.out.println("Factorial: 1");
			}
			if (num <0 || num > Integer.MAX_VALUE)
			{
				System.out.println("Please enter valid integer only");
			}
			else {
				int fact=1;
				int i = 1;
				while( i<=num)
				{
					 fact = i * fact;
					 i++;
				}
				System.out.println("Factorial: " + fact);
			}
		}
	}
				
			

}
