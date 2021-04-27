package com.inhouse.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQue {

	public static void main(String[] args) {
		MyStack obj = new MyStack();
		obj.push(8);
		int param_2 = obj.pop();
		System.out.println(param_2);
	}

}

class MyStack {
	Queue<Integer> queue1,queue2;
	int head;
	public MyStack() {
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
	}
	
	public void push(int x) {
		while(!queue1.isEmpty()) {
			queue2.add(queue1.poll());
		}
		queue1.add(x);
		while(!queue2.isEmpty()) {
			queue1.add(queue2.poll());
		}
	}
	
	public int pop() {
		head = queue1.peek();
		queue1.poll();
		return head;
	}
	
	public int top() {
		head = queue1.peek();
		return head;
	}
	
	public boolean empty() {
		return queue1.isEmpty();
		
	}
}