package com.inhouse.leetcode;

import java.util.Stack;

public class MinStack {
	Stack<Integer> data;
	Stack<Integer> mins;
	public MinStack() {
		data = new Stack<Integer>();
		mins = new Stack<Integer>();
	}
	   
	public void push(int val) {
		data.push(val);
		if(mins.isEmpty())
			mins.push(val);
		else
			mins.push(Math.min(val, mins.peek()));
	    }
	    
	    public void pop() {
	    	data.pop();
	    	mins.pop();
	    }
	    
	    public int top() {
	    	return data.peek();
	    }
	    
	    public int getMin() {
	    	System.out.println(data);
	    	System.out.println(mins);
	        return mins.peek();	        
	    }
	    
	public static void main(String[] args) {
		MinStack obj = new MinStack();
	
		obj.push(5);
		obj.push(3);
		obj.push(1);
		obj.push(2);
		System.out.println("Min : " + obj.getMin());

	}

}
