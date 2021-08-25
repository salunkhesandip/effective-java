package com.inhouse.leetcodeeasy;

import java.util.Stack;

public class MinStack155 {
	Stack<Integer> data;
	Stack<Integer> mins;
    public MinStack155() {
       data = new Stack<Integer>();
       mins = new Stack<Integer>();
    }
    
    public void push(int val) {
    	data.push(val);
    	if(mins.empty()) mins.push(val);
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
    	return mins.peek();
    }
    
	public static void main(String[] args) {
		MinStack155 obj = new MinStack155();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		System.out.println("Min value : " + obj.getMin());
		obj.pop();
		obj.pop();
		System.out.println("Min value : " + obj.getMin());		
	}

}
