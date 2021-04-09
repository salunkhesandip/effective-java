package com.inhouse.leetcode;

import java.util.Stack;

public class StackQueueImpl{
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();	
		queue.push(1);
		queue.push(2);
		System.out.println(queue.pop());
		queue.push(3);
	}
}

class MyQueue {
	Stack <Integer> stack1 = new Stack <Integer>();
	Stack <Integer> stack2 = new Stack <Integer>();

	public void push(int x) {
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		
		stack1.push(x);
		
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}		
	}
	
	
	public int pop() {
		if(stack1.isEmpty())		
			System.out.println("Queue is empty.");
		int x = stack1.peek();
		stack1.pop();
		return x;
	}
	
	public int peek() {
		return stack1.peek();
	}
	
	public boolean isEmpty() {
		return false;
	}
}
