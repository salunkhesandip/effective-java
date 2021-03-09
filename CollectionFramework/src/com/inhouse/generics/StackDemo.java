package com.inhouse.generics;

import java.util.Random;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack <Integer>();
		
		for(int i=0;i<5;i++)
			stack.add((new Random()).nextInt(100));
		
		stack.pop();
		System.out.print("\n Stack : ");
		for(int num :stack) {
			System.out.print(num +", ");
		}
	}
}
