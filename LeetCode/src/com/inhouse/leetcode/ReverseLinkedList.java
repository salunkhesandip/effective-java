package com.inhouse.leetcode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode();
		System.out.println(head.val);
	}

}

// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next;}        

public ListNode reverseList(ListNode head) {
	ListNode prev = null;
	ListNode curr = head;

	while(curr!= null) {
		ListNode  nextTemp = curr.next; // store next reference
		curr.next = prev;
		prev = curr;
		curr = nextTemp;
	}
	return prev; 
}

}