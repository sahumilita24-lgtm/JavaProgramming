package ex16_Arrays;

import java.util.Arrays;

public class Lab08_2ndHighest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34
		Arrays.sort(numbers);
		System.out.println(numbers[numbers.length-2]);

	}

}
