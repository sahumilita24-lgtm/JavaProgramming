package ex16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab05_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter the size of the array(int)");
	     int size = scanner.nextInt();
	     String[] mark = new String[size];
	     
	     for(int i =0 ; i < size; i++)
	     {
	    	 System.out.println("Enter the elements --> "+ i);
	    	 mark[i] = scanner.next();   	 
	     }
	     System.out.println(" --- Print the values");
	     
	     Arrays.sort(mark);
	     for(String m: mark)
	     {
	    	 System.out.println(m);
	     }
	        
	        

	}

}
