package ex15_StringBuffer_Builder;

public class Lab05_StringBufferex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Java");
        sb.append(" Milita");
        System.out.println(sb);

        sb.replace(2, 8, "#"); //Ja#ita -> Replaces from 2 to 8
        System.out.println(sb);
        sb.replace(0, 4, "C++");
        System.out.println(sb); //C++a Milita

	}

}
