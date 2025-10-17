package ex16_Arrays;

public class Lab15_LeftTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		       *
		     * *
		   * * *	
		 */

		int n = 3;
		for(int i =0 ; i < n; i++)
		{
			for (int j =1; j < n-i; j++)
			{
			   System.out.print(" ");	
			}
			
			for (int k= 0; k <= i; k ++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
