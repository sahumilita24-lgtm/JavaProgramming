package ex16_Arrays;

public class Lab06_Array_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 2, 3, 4, 5};
        // 5,4,3,2,1
		
		for (int i = numbers.length-1 ; i >= 0 ; i--)
		{
			System.out.println(numbers[i]);
		}

	}

}
