package com.inhouse.leetcode;
import java.util.LinkedList;
import java.util.List;

public class addTwoNumbersEx {

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		List<Integer> list3 = new LinkedList<Integer>();
		// List 1 342
		list1.add(2);
		list1.add(4);
		list1.add(3);
		
		StringBuilder sb1 = new StringBuilder();
		for(int i = list1.size() - 1 ; i >= 0; i--) {
			sb1.append(list1.get(i));
		}
		System.out.println(sb1);

		// List 2 465
		list2.add(5);
		list2.add(6);
		list2.add(4);
		StringBuilder sb2 = new StringBuilder();
		for(int i = list2.size() - 1 ; i >= 0; i--) {
			sb2.append(list2.get(i));
		}
		
		System.out.println(sb2);
		int num1 = Integer.valueOf(sb1.toString());
		int num2 = Integer.valueOf(sb2.toString());
		
		int sum = num1 + num2;
		
		String total = String.valueOf(sum);
		StringBuilder sb3 = new StringBuilder(total);
		total = sb3.reverse().toString();
		System.out.println(sb3);

		for(int i = 0; i < total.length();i++) {
			int num = Character.getNumericValue(total.charAt(i));
			list3.add(num);
		}
		System.out.println(list3);
	}
}
