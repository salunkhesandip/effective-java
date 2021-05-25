package com.inhouse.leetcodemedium;

import java.util.Stack;

/* 2. Add Two Numbers
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */



public class AddNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode();
		ListNode l2 = new ListNode();
		ListNode result = addTwoNumbers(l1, l2);		
	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while(p != null || q != null) {
			int a = p != null ? p.val : 0;
			int b = q != null ? q.val : 0;
			int sum = a + b + carry;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			
			if(p != null) p = p.next;
			if(q != null) q = q.next;
		}
        
		if(carry == 1) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;			
	}
}
