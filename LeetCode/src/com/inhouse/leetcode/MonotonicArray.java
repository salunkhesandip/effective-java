package com.inhouse.leetcode;

public class MonotonicArray {

	public static void main(String[] args) {
		int[] arr = {1,1,2,3,4};
		boolean result = isMonotonic(arr);
		System.out.println(result);

	}

	/*
	private static boolean isMonotonic(int[] arr) {
		int len = arr.length - 1;
		int i,j;
		
		for(i = 0; i < len; i++) {
			if(!(arr[i] <= arr[i+1]))
				break;
		}
		if(i == len)
			return true;
		
		// decreasing
		for(j = 0; j < len; j++) {
			if(!(arr[j] >= arr[j+1]))
				break;
		}
		
		if(j == len)
			return true;
		
		return false;
	}
	*/
	private static boolean isMonotonic(int[] arr) {
		   boolean increasing = true;
	       boolean decreasing = true;
	       for (int i = 0; i < arr.length - 1; ++i) {
	           if (arr[i] > arr[i+1])
	               increasing = false;
	           if (arr[i] < arr[i+1])
	               decreasing = false;
	       }
	       return increasing || decreasing;
	}
}
