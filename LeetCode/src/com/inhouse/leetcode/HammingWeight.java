package com.inhouse.leetcode;

/*
 * Write a function that takes an unsigned integer and 
 * returns the number of '1' bits it has (also known as the Hamming weight).
 */
public class HammingWeight {

	public static void main(String[] args) {
		 int num = 3;
		 int result = hammingWeight(num);
		 System.out.println(result);

	}
	
	private static int hammingWeight(int num) {
		int sum = 0;
		
		while(num != 0) {
			sum++;
			num &= (num - 1);
		}
		return sum;
	}
/*
	private static int hammingWeight(int num) {
		int bits = 0;
		int mask = 1;
		//      mask = 00000000000000000000000000000001
		// next mask = 00000000000000000000000000000010
		// logical AND between any number and the mask 1 gives us the least significant bit of this number. 
		// To check the next bit, we shift the mask to the left by one.
		for(int i = 0; i < 32; i++) {
			if((num & mask) != 0)
				bits++;
			
			mask <<= 1;
		}		
		return bits;
	}
	*/
}
