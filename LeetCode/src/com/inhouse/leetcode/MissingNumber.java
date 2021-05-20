package com.inhouse.leetcode;
/*
 * 268. Missing Number
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */
public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {1,2,0};
		int num = missingNumber(nums);
		System.out.println(num);
	}

	/*
	private static int missingNumber(int[] nums) {
		int size = nums.length;
		int sum = (size * (size + 1))/2;
		
		for(int num : nums) {
			sum -= num;
		}
		return sum;
	}
	*/
	
	private static int missingNumber(int[] nums) {
    int missing = nums.length;
    for (int i = 0; i < nums.length; i++) {
        missing ^= i ^ nums[i];
    }
    return missing;
	}
/*
	Input	Output
	A	B	A XOR B
	0	0	0
	0	1	1
	1	0	1
	1	1	0
*/
}
