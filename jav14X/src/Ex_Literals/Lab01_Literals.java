package Ex_Literals;

public class Lab01_Literals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab01_Literals.literal_int_float_boolean();
		Lab01_Literals.literal_binary();
		Lab01_Literals.literal_char();
		Lab01_Literals.literal_non_primitive();
		
	}
	
	public static void literal_int_float_boolean()
	{
		System.out.println("*****literal_int_float_boolean******");
		float pi =3.14f;
		//Literal -float
		
		int mark =90;
		//Literal -int
		
		boolean is_married = true;
        boolean is_married_amit = false;
        //boolean is_married_amita = 123; Type mismatch: cannot convert from int to boolean
        //Literals - boolean
		
		final int girlage =12;
		/*girlage =34;  error -he final local variable girlage cannot be assigned.
		  It must be blank and not using a compound assignment
		 */
		System.out.printf("Pi value: %f, %nmark value: %d,%nis married value: %b",pi , mark, is_married );
		System.out.println("");

	}
	
	public static void literal_binary()
	{
		System.out.println("*****literal_binary*********");
		 // Binary Literal
        int binary_num = 0b1010; // Binary System


        // Octal base? -> 8
        int octal = 0101;

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745
        System.out.printf("binary num: %d, octal: %d, hex: %d",binary_num,octal, hex);
        System.out.println("");
	}

	public static void literal_char()
	{
		
		System.out.println("******literal_char*******");
		 char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
	        //        char c = "A"; // "" == String = Bunch of Char


	        char c2 = 'B';
	        char c3 = '@';
	        char c4 = '_';
	        char c5 = '9';
	        char c6 = '1';
	        char c7 = '(';
	        char c8 = ' '; // blank space

	        // Escape Sequence
	        char new_line = '\n';
	        char tab_line = '\t';
	        char back_space = '\b';
	        char carriage_return = '\r';

	        System.out.println("MilitaSahu");
	        System.out.println("Milita"+new_line+"sahu");
	        System.out.println("Milita \nsahu");
	        System.out.println("Milita"+tab_line+"sahu");
	        System.out.println("Milita"+back_space+"sahu");
	        System.out.println( " ----- ");

	        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

	        char c10 = 'A';
	        //  // ASCII, (limited numbers) - A -> 65

	        char ruppes = '₹';
	        System.out.println(ruppes);

	        char my_laugh_smily = '\u1f60'; // :)
	        System.out.println(my_laugh_smily);

	        char c11  = '\u1F60';
	        
	        System.out.println();

	}
	
	public static void literal_non_primitive()
	{
		String name = "Milita Sahu"; // String is bunch of char.
        int[] arrays_of_items = new int[10];
        System.out.println(name);
	}
}
