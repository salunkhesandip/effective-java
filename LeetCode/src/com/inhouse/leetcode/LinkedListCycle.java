package com.inhouse.leetcode;

/* 141.
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. 
 * Internally,pos is used to denote the index of the node that tail's next pointer is connected to. 
 * Note that pos is not passed as a parameter.
 */
public class LinkedListCycle {

	public static void main(String[] args){
		ListNode head = null;
		boolean result = hasCycle(head);

	}

	/*
	private static boolean hasCycle(ListNode head) {
		if(head == null || head.next == null) return false;
		
		while(head != null) {
			if(head.val == Integer.MAX_VALUE)
				return true;
			head.val = Integer.MAX_VALUE;
			head = head.next;
		}
		return false;
	}
*/
	private static boolean hasCycle(ListNode head) {
		if(head == null || head.next == null) return false;
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		while(slow != null && fast !=null) {
			if(slow == fast) return true;
			
			slow = slow.next;
			
			if(fast.next == null) return false;
			fast = fast.next.next;
		}
		return false;
	}
}
