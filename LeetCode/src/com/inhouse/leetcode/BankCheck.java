package com.inhouse.leetcode;

import java.util.HashMap;

public class BankCheck {

	public static void main(String[] args) {
		String amount = "1234";
		String money = formatMoney(amount);
		System.out.println(money);
	}

	private static String formatMoney(String amount) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(0, "");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(10, "Ten");
		map.put(11, "Eleven");
		map.put(12, "Twelve");
		map.put(13, "Thirteen");
		map.put(14, "Fourteen");
		map.put(15, "Fifteen");
		map.put(16, "Sixteen");
		map.put(17, "Seventeen");
		map.put(18, "Eighteen");
		map.put(19, "Nineteen");
		map.put(20, "Twenty");
		map.put(30, "Thirty");
		map.put(40, "Fourty");
		map.put(50, "Fifty");
		map.put(60, "Sixty");
		map.put(70, "Seventy");
		map.put(80, "Eighty");
		map.put(90, "Ninety");
		map.put(100, "Hundred");
		map.put(1000, "Thousand");
		
		String result = "";
		char[] arr = amount.toCharArray();
		
		int len = arr.length;
		int len1 = arr.length - 1;
		
		if(map.containsKey(Integer.parseInt(amount)))
				return map.get(Integer.parseInt(amount));
						
		for(int i = 0; i < len; i++) {
			int pos = Character.getNumericValue(arr[i]);

			int factor = (int) Math.pow(10,len1);
			int unit = pos * factor;
			int digit = unit / factor;						
			len1 --;		
			
			if(map.containsKey(unit)) {
				if(digit == 1 && factor > 10)
					result += "One ";
				
				result +=  map.get(unit);
				result += " ";
			} else {
				result += map.get(digit) + " " +  map.get(factor);
				result += " ";				
			}
			
			int sum = Integer.parseInt(amount.substring(i+1,len));
			System.out.println(digit + " " + factor + " " + unit + " " + sum);
			
			if(map.containsKey(sum)) {
				result +=  map.get(sum);
				break;
			}
		}		
		return result;
	}
}
