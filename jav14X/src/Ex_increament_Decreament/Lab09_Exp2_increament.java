package Ex_increament_Decreament;

public class Lab09_Exp2_increament {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);   //11+12 =23
        System.out.println(a); //12

        // ++a -> A -> ExpA -> 11 , a -> 11
        // ++a -> B -> ExpB -> 12 , a -> 12
        // ExpA+ExpB -> 11+12 -> 23, a -> 12
    }
}
