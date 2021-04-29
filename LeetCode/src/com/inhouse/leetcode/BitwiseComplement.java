package com.inhouse.leetcode;

public class BitwiseComplement {

	public static void main(String[] args) {
		int num = 0;
		int result = bitwiseComplement(num);
		System.out.println(result);
	}

	private static int bitwiseComplement(int num) {
		int power = 1;
		int result = 0;
		if(num == 0)
			return 1;
		
		while(num >= 1) {
			int remainder = num % 2;
			if(remainder == 0)
				result += power;
			
			num /= 2;
			power *= 2;
		}		
		return result;
	}
}
