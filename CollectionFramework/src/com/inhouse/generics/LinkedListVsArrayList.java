package com.inhouse.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListVsArrayList {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		
		// LinkedList internally uses a doubly linked list to store the elements.
		// ArrayList internally uses a dynamic array to store the elements.
		
		for(int i=0;i<5;i++) {
			numbers.add((new Random()).nextInt(100));
			list.add((new Random()).nextInt(100));
		}
		
		System.out.print("Linked list : ");
		for(Integer d:numbers) 
			System.out.print(d +",");
		
		numbers.remove(2);
		System.out.print("\nLinked list : ");
		for(Integer d:numbers) 
			System.out.print(d +",");
		
		System.out.print("\nArray list : ");
		for(Integer d:list) 
			System.out.print(d +",");
		
		list.remove(2);
		System.out.print("\nArray list : ");
		for(Integer d:list) 
			System.out.print(d +",");
		
		// Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
		
		for(int i=0;i<10E5;i++) {
			numbers.add((new Random()).nextInt(100));
			list.add((new Random()).nextInt(100));
		}
		
		long startTime = System.currentTimeMillis();
		for(int i=6000;i<8000;i++) {
			numbers.remove(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("\nDeletion time taken by LinkedList :" + (endTime-startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		for(int i=6000;i<8000;i++) {
			list.remove(i);
		}
		endTime = System.currentTimeMillis();
		
		System.out.println("\nDeletion time taken by ArrayList :" + (endTime-startTime) + "ms");
		
	}
}
