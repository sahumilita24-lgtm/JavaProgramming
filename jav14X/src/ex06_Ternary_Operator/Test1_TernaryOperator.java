package ex06_Ternary_Operator;

public class Test1_TernaryOperator {

	public static void main(String[] args) {
		
	        //Problem 1
		Test1_TernaryOperator.oddeven();
	        //problem 2
		Test1_TernaryOperator.maxnum();
	        //problem 3
		Test1_TernaryOperator.ageclassification();
	    }
	    public static void oddeven()
	    {
	        System.out.println("Check if the number is even or odd by using Ternary Operator. ");
	        int num = 3;
	        String Oddoreven= num%2== 0 ? "Even number":"odd number";
	        System.out.println(num + " is an "+ Oddoreven);
	    }
	    public static void maxnum()
	    {
	        System.out.println();
	        System.out.println("Interview - Zeta → (AT) Ter nested → Max between 3 numbers →  int n1 = 2; int n2 = 9;  int n3 = -11");
	        int n1 = 2;
	        int n2 =9;
	        int n3 =-11;
	        int maxnum = n1>n2?(n1>n3? n1: n3):(n2>n3?n2: n3);
		        System.out.println(maxnum + " is the maximum number");
	    }
	    public static void ageclassification()
	    {
	        System.out.println();
	        System.out.println("Real_Age_Classification (  age → 59 ) →  Minor, Adult (Adult , Sr Senior) - Ternary Operator ");
	        int age=59;
	        String ageclass=
	        age< 18? "Minor":(age>=60 ? "Senior citizen":"Adult");
	        System.out.println("Age Classification: "+ ageclass);
	    }

	

}
