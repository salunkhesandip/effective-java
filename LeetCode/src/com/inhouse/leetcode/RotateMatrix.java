package com.inhouse.leetcode;

public class RotateMatrix {

	public static void main(String[] args) {
		int [][] mat = {
                {1, 2, 3 , 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
            };		
		
		//int [][] result = rotate(mat);
		int [][] result = rotateMatrix(4,mat);
		
		int r = result.length;
		int c = result[0].length;
		
		for(int i = 0 ; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=======");
		
		for(int i = 0 ; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] rotate(int[][] mat) {
		
		int r = mat.length;
		int c = mat[0].length;
		int[][] res = new int[r][c];
		
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < r; j++) {				
				//System.out.println(mat[i][j]  + " " + mat[j][len]);
				res[i][j] = mat[j][c - i - 1];			
			}
		}
		return res;
	}
	private static int[][] rotateMatrix(int N, int[][] mat){
		
		for(int i = 0; i < N/2 ; i++) {
			for(int j = i; j < (N - i - 1); j++) {
				
				// current cell in temp
				int tmp = mat[i][j];
				
				// move values from right to top
				mat[i][j] = mat[j][N - 1 - i];
				
				// move values from bottom to right
				mat[j][N - 1 - i] = mat[N - 1 - i][N - 1 - j];
				
				// move values from left to bottom
				mat[N - 1 - i][N - 1 - j] = mat[N - 1 - j][i];
				
				// assign temp to left
                mat[N - 1 - j][i] = tmp;								
			}
		}
		return mat;
	}

}
