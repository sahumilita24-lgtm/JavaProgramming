package ex14_Strings;

public class Lab05_Interview_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String s1 = "Hello";
	        String s4 = "Hello";
	        String s10 = "Hello";
	        String s11 = "hello";
	        System.out.println(s1== s4); //True --> Reference check

	        // 2

	        String s2 = new String("Hello");
	        String s3 = new String("Hello");
	        String s5 = new String("hello");
	        
	        System.out.println(s2==s3); //False
	        System.out.println(s2==s1); //False

	}

}
