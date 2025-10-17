package ex16_Arrays;

import java.util.Arrays;

public class Lab04_Max_MinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		Arrays.sort(array);
		System.out.println("Max " + array[array.length-1]);
		System.out.println("Min "+ array[0]);
		
		System.out.println("using for loop");
		int max = array[0];
		for(int i=0;i< array.length; i++)
		{
			if (array[i]> max)
			{
				max = array[i];
			}
		}
		
		System.out.println(max);
		
		System.out.println("Minimum valud finding");
		int min = array[0];
		
		for (int i =0; i< array.length; i++)
		{
			if(array[i] < min)
			{
				min = array[i];
			}
		}
		System.out.println(min);

	}

}
