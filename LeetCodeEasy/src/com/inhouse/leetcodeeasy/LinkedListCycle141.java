package com.inhouse.leetcodeeasy;
/*
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class LinkedListCycle141 {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		ListNode second = new ListNode(2);
		head.next = second;
		
		ListNode third = new ListNode(0);
		second.next = third;
		ListNode fourth = new ListNode(4);
		fourth.next = second;
		
		boolean result = hasCycle(head);
		System.out.println(result);
	}

	private static boolean hasCycle(ListNode head) {
		if(head == null || head.next == null) return false;
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		while(slow != null || fast != null) {
			
			if(slow == fast) return true;
			slow = slow.next;
			
			if(fast == null) return false;
			fast = fast.next.next;			
		}		
		return false;
	}
}
