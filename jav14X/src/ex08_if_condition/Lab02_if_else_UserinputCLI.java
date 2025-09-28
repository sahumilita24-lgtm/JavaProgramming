package ex08_if_condition;

public class Lab02_if_else_UserinputCLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userinput =args[0];
		int age = Integer.parseInt(userinput);
		
		if (age > 18) {

            System.out.println("Yes you can vote!");

        } else {
            System.out.println("You can't vote!");
        }

	}

}
