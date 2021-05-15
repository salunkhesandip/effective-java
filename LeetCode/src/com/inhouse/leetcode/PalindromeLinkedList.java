package com.inhouse.leetcode;

import java.util.Stack;

// 234.Given the head of a singly linked list, return true if it is a palindrome.
public class PalindromeLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode();
		boolean isPal = isPalindrome(head);
	}
/*
	private static boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(slow != null) {
			stack.push(slow.val);
			slow = slow.next;
		}		
		while(head != null) {
			int num = stack.pop();
			if(num == head.val) {
				head = head.next;
			} else {
				return false;
			}			
		}
		return true;
	}
*/
/*
	private static boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null)
			return true;
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		ListNode rev = reverse(slow.next);
		slow = head;
		fast = rev;
		
		while(fast != null) {
			if(slow.val != fast.val) return false;
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
	private static ListNode reverse(ListNode node) {
		ListNode reverse = new ListNode(-1);
		while(node != null) {
			ListNode next = node.next;
            node.next = reverse.next;
            reverse.next = node;
            node = next;
		}
		return reverse.next;
	}
*/
	private static ListNode left = null;
	private static boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null) return true;
		
		left = head;
		return isP(left);		
	}
	private static boolean isP(ListNode right) {
		if(right == null) return true;
		
		if(!isP(right.next)) return false;
		
		boolean result = (left.val == right.val);
		left = left.next;
		return result;
	}	
}