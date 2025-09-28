package ex09_Switch;

public class Lab03_Switch_jdk13Above {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in jdk> 13
		
		int itemcode =4;
		switch(itemcode)
		{
			case 01 -> System.out.println("item 1");
			case 02 -> System.out.println("item 2");
			case 03 -> System.out.println("item 3");
			case 04 -> System.out.println("item 4");
			default -> System.out.println("Default");
		}

	}

}
