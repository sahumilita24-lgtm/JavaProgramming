package ex08_if_condition;

public class Lab01_if_elseif_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 34;
		if (age > 34)
		{
			System.out.println("age > 34");
		}
		else if (age<34) if (age != 34)
		{
			System.out.println("age < 34");
		}
		else System.out.println("age =34");
		else System.out.println("age =4"); // runs This line 
		
		//classic example of dangling else problem 
		//An else always pairs with the nearest unmatched if (unless you use braces {} to override).
		

	}

}
