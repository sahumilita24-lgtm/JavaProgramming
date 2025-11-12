package ex18_OopsConstructors;

public class Lab03_BasicConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Baby b1 = new Baby();
		new Baby();
		new Baby();
		Baby b2; // just reference is created
		//b2.name; error
		
		//3 times Baby constructor gets called for above code
		
		new Baby("Sarvana");
		

	}

}

class Baby{
	String name;
	Baby(){
		System.out.println("I am called, Object is created!");
		
	}
	
	Baby (String nameFromObj)
	{
		this.name =nameFromObj; // this here takes care as current object reference
		System.out.println("Print the name coming from Object "+  name);
	}
}
