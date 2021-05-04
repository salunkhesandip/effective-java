package com.inhouse.leetcode;

public class SortArrayByParity {

	public static void main(String[] args) {
		int[] A = {3, 1, 2, 4};
		int[] result = sortArrayByParity(A);
		
		for(int num : result) {
			System.out.println(num);
		}
	}
/*
	private static int[] sortArrayByParity(int[] A) {
		int j = 0;
		for(int i = 0 ; i < A.length; i++) {		
			if(A[i] % 2 == 0) {
				int tmp = A[j];
				A[j] = A[i];
				A[i] = tmp;
				j++;
			}
		}
		return A;
	}
	*/
	private static int[] sortArrayByParity(int[] A) {
	  int i = 0, j = A.length - 1;
      while (i < j) {
          if (A[i] % 2 > A[j] % 2) {
              int tmp = A[i];
              A[i] = A[j];
              A[j] = tmp;
          }

          if (A[i] % 2 == 0) i++;
          if (A[j] % 2 == 1) j--;
      }
      return A;
	}
}
