package ex15_StringBuffer_Builder;

public class Lab02_StringBuilder_Vs_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s0 = "Milita";
        String s1 = new String("Milita");

        // less than <10% used.
       StringBuffer buffer = new StringBuffer(s0);
       StringBuilder builder = new StringBuilder(s1);
       System.out.println(buffer);
       System.out.println(builder);
       System.out.println(buffer.reverse());
       System.out.println(builder.reverse());
	}

}
