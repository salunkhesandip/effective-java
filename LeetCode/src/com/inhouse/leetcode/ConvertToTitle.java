package com.inhouse.leetcode;

public class ConvertToTitle {

	public static void main(String[] args) {
		int columnNumber = 702; // AB
		String cell = convertToTitle(columnNumber);
		System.out.println(cell);
	}

	private static String convertToTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[100];
		int i = 0;
		
		while(columnNumber > 0) {
			arr[i] = columnNumber % 26;
			columnNumber /= 26;
			i++;
		}
		
		for(int j = 0; j < i - 1; j++) {
			if(arr[j] <=0) {
				arr[j] += 26;
				arr[j + 1] =  arr[j + 1] - 1;				
			}
		}
		
		for(int j = i ; j >= 0; j--) {
			if(arr[j] > 0)
				sb.append((char)('A' + arr[j] - 1));
		}

		return sb.toString();
	}

}
