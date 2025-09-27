package Ex05_TypeCasting;

public class Lab04_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
       // short s = phone_no; // Narrowing - implicit
        short s = (short) phone_no; // Narrowing - Explicit
        System.out.println(s);
        
        //Test1
        long billno = 789L;
        int mybill = (int) billno; //narrowing explicitely
        

    }
}
