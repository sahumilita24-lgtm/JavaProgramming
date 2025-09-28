package ex01_02_Java_Basics;

public class Test01_printf {

	public static void main(String[] args) {
		
		/*Use println → quick, simple output.
		Use printf → when you need formatted, structured, or aligned output.
		
		%d -> int, byte, long, short, - data type
        %s -> String
        %f -> float, double,
        %b ->boolean */
		
		Test01_printf.practice();
		Test01_printf.ninetable();

	}
	
	public static void practice()
	{
		int a=10;
		System.out.printf("Hello World %s", "Milita Sahu");
		System.out.println();

		
		String name = "Milita Sahu";
		int age =24;
		double salary = 24.56;
		System.out.printf("My name is: %s, Salary is: %f, age is: %d ", name, salary, age);
		System.out.println();
	}
	
	public static void ninetable()
	{
		//Task 14th Sept. | Print the Table of 9 (printf)
		int table= 9;
		System.out.printf
		("%d x 1= %d %n%d x 2= %d %n%d x 3= %d%n%d x 4= %d%n%d x 5= %d%n%d x 6= %d%n%d x 7= %d%n%d x 8= %d%n%d x 9= %d%n%d x 10= %d"
		,table, table*1, table, table*2,table, table*3,table, table*4,table, table*5,table, table*6,table, table*7,table, table*8,table, table*9,table, table*10);
	}

	
}
