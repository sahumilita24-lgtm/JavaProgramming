package ex16_Arrays;

public class Lab11_2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix3x3 = {{2,3,4}, {4,5,6} ,{6,7,5}}; // R X C
		int[][] matrix2X2 = {{2,3},{4,5}};
		int[][] matrix3X1 = {{3},{5},{6}};
		int[][] matrix2X3 = {{2,3,4}, {3,4,5}};
		
		int[][] matrix = new int[2][3];
		matrix[0][0] = 1;
		matrix[0][1] = 3;
		matrix[0][2] = 4;
		matrix[1][2] = 5;
		
		for (int i =0 ; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + " | ");
			}
			System.out.println();
		}
		
		/*
		 * output 
		 *  1 | 3 | 4 |
		 *  0 | 0 | 5 |
		 */

	}

}
