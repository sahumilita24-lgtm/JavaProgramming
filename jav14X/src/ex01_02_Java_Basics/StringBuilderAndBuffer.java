package ex01_02_Java_Basics;

import java.util.List;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName= "Milita Sahu";
		//String Length
		System.out.println(myName.length());
		int len= myName.length();
		//charAt
		System.out.println(myName.charAt(len -1));
		//Concat
		System.out.println(myName.concat(" Hey add me"));
		//contains
		System.out.println(myName.contains("ita"));
		//Equals (check values)
		boolean val= myName.equals("Milita sahu");//small s added so result false
		System.out.println(val);
		//== (check reference)
		String b = "Milita Sahu";
		String c = new String("Milita Sahu");
		System.out.println(b == myName);
		System.out.println(c == myName);
		//EqualsignoreCase
		System.out.println(b.equalsIgnoreCase("milita saHU"));
		//indexof
		System.out.println(myName.indexOf("S"));
		//replace
		System.out.println(myName.replace("i", "N"));
		//split
		String[] values = myName.split(" ");
		System.out.println(values[1]);
		//substring
		System.out.println(myName.substring(3,8)); //m0,i1,l2,i3,t4,a5, 6,s7,a8,h9,u10 --> gives 3 to 8-1
		//String Buffer
		
		StringBuffer ac = new StringBuffer("NM Sahu");
		ac.append(" Panda");
		ac.append(" Titlr");
		System.out.println(ac + " Helloo buffers");
		
		System.out.println(ac);
		
		StringBuilder ab = new StringBuilder("NM Sahu");
		ab.append(" builder");
		
		System.out.println(ab + " Helloo Builders");
		System.out.println(ab);
		

	}

}
