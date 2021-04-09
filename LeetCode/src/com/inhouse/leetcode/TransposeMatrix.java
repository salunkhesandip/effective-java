package com.inhouse.leetcode;

public class TransposeMatrix {

	public static void main(String[] args) {

		int[][] matrix = {{1,2,3,4},
				  {4,5,6,4},
				  {7,8,9,4}};
		
		int[][] result = transpose(matrix);
		int r = result.length;
		int c = result[0].length;
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] transpose(int[][] matrix) {
		int r = matrix.length;
		int c = matrix[0].length;

		int tran[][] = new int [c][r];
		
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < r; j++) {
				tran[i][j] = matrix[j][i];
			}
		}
		return tran;
	}

}
