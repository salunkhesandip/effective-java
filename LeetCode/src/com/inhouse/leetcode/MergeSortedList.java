package com.inhouse.leetcode;
/*
 * Merge two sorted linked lists and return it as a sorted list. 
 * The list should be made by splicing together the nodes of the first two lists.
 */
public class MergeSortedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode();
		ListNode l2 = new ListNode();
		ListNode result = mergeTwoLists(l1, l2);

	}
/*
	private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyNode = new ListNode();
		ListNode tail = dummyNode;
		
		while(true) {
			if(l1 == null) {
				tail.next = l2;
				break;
			} else if(l2 == null) {
				tail.next = l1;
				break;
			}
			
			if(l1.val <= l2.val) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}
			tail = tail.next;
		}
		return dummyNode.next;
	}

	*/
	private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		if(l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next,l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1,l2.next);
			return l2;
		}
	}
}
