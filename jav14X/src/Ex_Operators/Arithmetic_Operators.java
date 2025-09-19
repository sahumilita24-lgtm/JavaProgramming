package Ex_Operators;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int age = 90;
	        // Assignment operator
	        // int -> data type
	        // age -> identifier
	        // = -> Assignment operator
	        // 90 -> Literal

	        // RHV to the LH
		 
		    // Arithmetic Operators
	        //        + (Addition)
	        //       - (Subtraction)
	        //       * (Multiplication)
	        //       / (Division)
	        //       % (Modulus) | Modulus - Remainder
		 
		 int a = 32, b = 5;
		 float c = 3.0f;
		    System.out.println(a+b);
	        System.out.println(a-b);
	        System.out.println(a*b);
	        System.out.println(a/b); //Results Quotient
	        System.out.println(a%b); //Results Remainder

	        System.out.println(a/c);
	        System.out.println("a+b");
	        System.out.println(a+b);
	        
	        
	        Arithmetic_Operators.modulues();
	        
	        

	}
	
	public static void modulues()
	{
		int a = 20;
        int b = 10;
        System.out.println(a%b); // % modulus

        //        10 | 20 |  2 - quotient
//                  |   20 |
//                  -------
//                      0 - Remainder
//                  ----
	}

}
