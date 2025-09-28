package ex08_if_condition;

public class Lab_Practice_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 5, b = 10;
		if(a > 0) if(b > 5)  System.out.print("X");  //this line runs
		else System.out.print("Y"); */
		 
		/*int a = 5, b = 2; 
		if(a > 10) 
			if(b > 1) System.out.print("A");
			else System.out.print("B"); 
		else System.out.print("C"); //this line runs */
		
		/*int x = 8; 
		if(x > 5) if(x < 10) System.out.print("A"); //runs this
		else System.out.print("B");  
		else System.out.print("C"); */
		
		/*int n = 6; 
		if(n % 2 == 0) if(n % 3 == 0) System.out.print("Divisible by 6"); //this line run
		else System.out.print("Even but not by 3"); 
		else System.out.print("Odd"); */
		
		/*int x = 2; 
		if(x == 2) if(x > 0) if(x < 5) System.out.print("Nested"); */
		
		/*classic example - use this
		int a = 3;
		if(a > 0) if(a > 2) if(a > 4) System.out.print("A"); 
		else System.out.print("B"); //this line runs 
		else System.out.print("C"); 
		else System.out.print("D"); */
		
		/*int x = 4; 
		if(x > 0) if(x < 0) System.out.print("Impossible");
		else System.out.print("Possible"); //this line runs */
		
		
		/*int x = 1;
		if(x > 0)
			if(x > 2) System.out.print("A");
			else if(x > -1) System.out.print("B");  //this line runs
			else System.out.print("C"); 
		else System.out.print("D"); */

		
		int cnt=0;
		 while(true) 
		 { 
			 if(cnt > 4) 
			 break;
		 if(cnt==0) 
		 { 
			 cnt++; 
			 continue; 
		 } 
		 System.out.print(cnt + ","); cnt++; } //1, 2,3,4, 
	}
	


}
