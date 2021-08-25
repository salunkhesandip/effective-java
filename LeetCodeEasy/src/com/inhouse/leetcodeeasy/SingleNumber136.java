package com.inhouse.leetcodeeasy;

public class SingleNumber136 {

	public static void main(String[] args) {
		int nums[] = {2,2,1,1,3};
		int number = singleNumber(nums);
		System.out.println(number);
	}

	// 0 XOR num = num
	// num XOR num = 0
	private static int singleNumber(int[] nums) {
		int n = 0;
		for(int num: nums) {
			n ^= num;
		}
		return n;
	}

}
