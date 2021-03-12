package com.inhouse.generics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetEx {
/*
 * CopyOnWriteArraySet uses a CopyOnWriteArrayList internally for its operations.
 * It allows sequential write and concurrent reads by multiple threads. 
 * Only one thread can execute write operations (add and remove), 
 * and multiple threads can execute read operations (iterator) at a time.
 * Its iterator doesn’t throw ConcurrentModificationException and doesn’t support remove method.
 * 
 */
	public static void main(String[] args) {
		Set<Integer> set = new CopyOnWriteArraySet<Integer>();
		
		for(int i=0 ;i<5 ; i++)
			set.add(i);
		
		new WriteThread("Write",set).start();
		new ReadThread("Read",set).start();
	}

}

class WriteThread extends Thread {
	private Set<Integer> set;
	
	public WriteThread(String name,Set<Integer> set) {
		this.set = set;
		super.setName(name);
	}
	public void run() {
		int count = 6;
		while(true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			set.add(count++);
			System.out.println("Write done");
		}

	}
}

class ReadThread extends Thread {
	private Set<Integer> set;
	
	public ReadThread(String name,Set<Integer> set) {
		this.set = set;
		super.setName(name);
	}
	public void run() {
		while(true) {
			String output = "\n" + super.getName() + ":";
			Iterator<Integer> itr = set.iterator();
			while(itr.hasNext()) {
				Integer next = itr.next();
				output += " " + next;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(output);
		}

	}
}
