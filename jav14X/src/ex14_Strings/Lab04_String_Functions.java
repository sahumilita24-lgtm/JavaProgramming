package ex14_Strings;

public class Lab04_String_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	char c = 'A';
	        System.out.println(c); //A

	        String s1 = "ABCD";
	        System.out.println(s1); //ABCD
	        System.out.println(s1.concat("EFGH"));// ABCDEFGH
	        System.out.println(s1.length()); //4
	        System.out.println(s1.contains("ABC")); // TRUE
	        System.out.println(s1.toLowerCase());//abcd
	        System.out.println(s1.toUpperCase());//ABCD

	}

}
