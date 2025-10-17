package ex16_Arrays;

public class Lab03_ArraysPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {51, 100, 91, 87, 90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println(" ---");
        
        //using for loop
        for(int i= 0; i< marks.length;i++)
        {
        	System.out.println(marks[i]);
        }
        
        System.out.println(" ------ Enhanced For loop ----");
        //Enhanced for loop
        for(int tempmark: marks)
        {
        	System.out.println(tempmark);
        }


	}

}
