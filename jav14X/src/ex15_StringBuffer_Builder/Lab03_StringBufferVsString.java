package ex15_StringBuffer_Builder;

public class Lab03_StringBufferVsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer = new StringBuffer("Pramod");

        stringBuffer.append("Dutta");
        System.out.println(stringBuffer); // PramodDutta


        String s1 = "PRamod";
        s1 = s1+ "Dutta";
        System.out.println(s1);

	}

}
