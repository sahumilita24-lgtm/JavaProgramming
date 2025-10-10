package ex14_Strings;

public class Lab06_Interview_Referencecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // == -> Comparison -> String => this check the ref location
        System.out.println( s1 == s3);
        System.out.println(s1 == s2);
        System.out.println( s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);


        // equals ( content) -> value
        System.out.println("4 "+s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("6 "+ s3.equals(s5)); // Hello equal hello - so false
        System.out.println(s3.equalsIgnoreCase(s5));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value


	}

}
