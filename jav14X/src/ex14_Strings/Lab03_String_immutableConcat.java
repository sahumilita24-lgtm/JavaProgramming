package ex14_Strings;

public class Lab03_String_immutableConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
        s1  = s1.concat("world");
        System.out.println(s1); //helloworld
        
        //first s1 was referencing to Hello in SCP later its pointed to helloworld
        // here reassignment is done

	}

}
