package ex18_OopsConstructors;

public class Lab02_ParameterConstructor_Car {

	String model;
    int year;

    Lab02_ParameterConstructor_Car() {
        model = "XXX";
        year = 1900;
        System.out.println("DC");
    }
    Lab02_ParameterConstructor_Car(String model_name)
    {
    
    this(); //default parameter calling which is called as constructor chaining
    this.model = model_name;
    System.out.println(model); //Honda Model
    
    
    }
    
    Lab02_ParameterConstructor_Car (String model_name, int year_created) {
        this("i10"); //Calling parameterized constructor
        this.model = model_name;
        this.year = year_created;
    }

    public static void main(String[] args)
    {
    	Lab02_ParameterConstructor_Car s = new Lab02_ParameterConstructor_Car("Honda Model");
    	
    }

}
