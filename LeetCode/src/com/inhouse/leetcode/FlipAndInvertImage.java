package com.inhouse.leetcode;

public class FlipAndInvertImage {

	public static void main(String[] args) {
		int[][] image =  {{1,1,0},{1,0,1},{0,0,0}};
		int[][] revImage = flipAndInvertImage(image);
		int n = image.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
	}
/*
	private static int[][] flipAndInvertImage(int[][] image) {
		int n = image.length;
		int[][] revImage = new int[n][n];
		for(int i = 0; i < n; i++) {
			int len = n - 1;
			for(int j = 0; j < n; j++) {
				if(image[i][len] == 0)
					revImage[i][j] = 1;
				else
					revImage[i][j] = 0;				
				len --;
			}
		}
		return revImage;
	}
	*/
	
	private static int[][] flipAndInvertImage(int[][] image) {
		int n = image.length;
		
		for(int [] row : image) {
			for(int i = 0; i < (n+1)/2 ; i++) {
				int tmp = row[i] ^1;
				row[i] = row[n - i - 1]^1;
				row[n - i - 1] = tmp;
			}
		}
		return image;
		
	}
}
