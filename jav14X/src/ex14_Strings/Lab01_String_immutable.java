package ex14_Strings;

public class Lab01_String_immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Milita";
		name.toUpperCase(); // MILITA
		System.out.println(name); //Milita
		System.out.println(name.toUpperCase()); //MILITA
		/*
		 * - "Milita" is in the String Pool as its string literal It's a compile-time constant
		 * - "MILITA" is a new object in the Heap as its created during run time
		 * name still points to "Milita".
		 */

		
	

	}

}
