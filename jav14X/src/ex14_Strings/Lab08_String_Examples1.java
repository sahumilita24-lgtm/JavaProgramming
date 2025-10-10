package ex14_Strings;

public class Lab08_String_Examples1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Java";
        char c = s.charAt(2);
        System.out.println(c); //v

        int result =  "abc".compareTo("ABC");
        System.out.println(result);  //32

        int idx = "Java".indexOf("a"); 
        System.out.println(idx); //1

        int idx2 = "Java".lastIndexOf("a"); // 3
        System.out.println(idx2);


        boolean b = "".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("*", "Java", "Python", "cSharp");
        System.out.println(s11); //Java*Python*cSharp , * acts as delimeter

        String s12 = "Java".replace('a', 'o'); // "Jovo"
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);

        String b2 = "Java".concat("Mava"); // true
        System.out.println(b2);

	}

}
