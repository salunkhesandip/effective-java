package com.inhouse.leetcodemedium;

import java.util.Hashtable;

/* 146. LRU Cache
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * Implement the LRUCache class:
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * The functions get and put must each run in O(1) average time complexity
 */
public class LRUCache {
	private class Node {
		Node prev, next;
		int key, value;
		
		public Node(int key, int value) {
			this.key = key;
			this.value = value;
			this.prev = null;
			this.next = null;
		}
	}
	
	private int capacity;
	private Hashtable<Integer, Node> hs = new Hashtable<Integer, Node>();
	private Node head = new Node(-1, -1);
	private Node tail = new Node(-1, -1);
	
	public LRUCache(int capacity) {
     this.capacity = capacity;
     tail.prev = head;
     head.next = tail;
    }
    
    public int get(int key) {
    	if(!hs.containsKey(key)) return -1;
    	
    	Node current = hs.get(key);
    	current.prev.next = current.next;
    	current.next.prev = current.prev;
    	moveToTail(current);
        return hs.get(key).value;
    }
    
    private void moveToTail(Node current) {
		current.prev = tail.prev;
		tail.prev = current;
		current.prev.next = current;
		current.next = tail;		
	}

	public void put(int key, int value) {
        if(get(key) != -1) {
        	hs.get(key).value = value;
        	return;
        }
        
        if(hs.size() == capacity) {
        	hs.remove(head.next.key);
        	head.next = head.next.next;
        	head.next.prev = head;
        }
        
        Node insert = new Node(key, value);
        hs.put(key, insert);
        moveToTail(insert);
    }
	
    public static void main(String[] args) {
	

	}

}
