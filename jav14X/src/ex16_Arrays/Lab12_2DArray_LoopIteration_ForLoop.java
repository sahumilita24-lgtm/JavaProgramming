package ex16_Arrays;

public class Lab12_2DArray_LoopIteration_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] matrix = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9},
	                {5, 7, 9}
	        };

	        // 4x3
	        // R -> 3
	        // C -> 3
		 System.out.println(matrix[0].length);
		 for (int rows = 0; rows< matrix.length ; rows++)
		 {
			for(int col =0 ; col < matrix[rows].length; col ++)
			{
				
				System.out.print(matrix[rows][col]+ " | ");
			}
			System.out.println();
		 }

	}

}
