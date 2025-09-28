package ex09_Switch;

public class Lab04_Switch_JDK13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemcode = 007;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
            break;  
            default:
                System.out.println("None");

	}
	}

}
