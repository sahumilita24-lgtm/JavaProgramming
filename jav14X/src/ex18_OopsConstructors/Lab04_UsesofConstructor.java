package ex18_OopsConstructors;
public class Lab04_UsesofConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    A a1 = new A();
        System.out.println(a1);
    }
}
class A{
    A() {
        System.out.println("I want to read a CSV File");
        System.out.println("Open the Page before loading the scripts");
        System.out.println("Y0u can do anything which you want to do, when Object is created.");
//        FileInputStream fileInputStream = new FileInputStream("C://a.txt");


    }

}

