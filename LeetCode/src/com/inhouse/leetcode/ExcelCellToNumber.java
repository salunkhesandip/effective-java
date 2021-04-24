package com.inhouse.leetcode;

public class ExcelCellToNumber {

	public static void main(String[] args) {
		String columnTitle ="ZY";
		int num = titleToNumber(columnTitle);

	}

	private static int titleToNumber(String columnTitle) {
		char[] arr = columnTitle.toCharArray();
		int num = 0;
		int j = 0;
		for(int i = arr.length - 1; i > -1; i--) {
			int digit = (int)arr[i] - (int)'A' + 1;
			num += digit * (int)Math.pow(26,j);
			j++;
		}
		System.out.println(num);
		return num;
	}

}
