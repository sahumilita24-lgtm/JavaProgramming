package ex05_TypeCasting;

public class Lab05_TypCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
       // int total1 = course+GST; // Narrowing - Implicit
        int total = course+(int)GST; // Narrowing - Explicit , float > int
        System.out.println(total);

        float total2 = course+GST; // Widening - auto - implicit
         float total3 = (float)course+GST; // Widening  - Explicit
        System.out.println(total2); //118.45
        System.out.println(total3); //118.45
        // no need for explicit widening 
        //implicit narrowing does not work in Java.
        
        
        // explicit narrowing - needed
        //explicit widening - not required
        //implicit narrowing : doesnot work
        //implicit widening - works 
        
 
        



    }
}
