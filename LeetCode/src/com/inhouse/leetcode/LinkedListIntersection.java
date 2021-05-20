package com.inhouse.leetcode;

public class LinkedListIntersection {

	public static void main(String[] args) {
		ListNode headA = null;
		ListNode headB = null;
		 
		ListNode node = getIntersectionNode(headA, headB);		
		
	}

	private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) return null;
		
		ListNode a_ptr = headA;
		ListNode b_ptr = headB;
		
		while(a_ptr != b_ptr) {
			if(a_ptr == null)
				a_ptr = headB;
			else
				a_ptr = a_ptr.next;
			
			if(b_ptr == null)
				b_ptr = headA;
			else
				b_ptr = b_ptr.next;
		}
		return a_ptr;
	}

}
