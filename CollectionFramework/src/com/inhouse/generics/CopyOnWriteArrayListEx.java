package com.inhouse.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
/*
 * enhanced version of ArrayList in which all modifications (add, set, remove, etc) are 
 * implemented by making a fresh copy.
 * it's very efficient if you have a List where Iteration out-numbers mutation.
 * difference between ArrayList and CopyOnWriteArrayList is that Iterator of ArrayList is fail-fast and throw 
 * ConcurrentModificationException once detect any modification in List once iteration begins
 * but Iterator of CopyOnWriteArrayList is fail-safe and doesn't throw ConcurrentModificationException
 */
	public static void main(String[] args) {
		List<Integer> threadSafeList = new CopyOnWriteArrayList<Integer>();
		// List<Integer> threadSafeList = new ArrayList<Integer>();
	    // The reader thread throws ConcurrentModificationExceptionas soon as the writer thread adds a new element to the list. 
		// The reader thread die and only the writer thread alive
		
		for(int i=0 ; i<5; i++) {
			threadSafeList.add(i);
		}
		
		System.out.println(threadSafeList);
		Iterator<Integer> failSafeIterator = threadSafeList.iterator();
		
		while(failSafeIterator.hasNext())
			System.out.println(failSafeIterator.next());
		
		// add, remove operator is not supported by CopyOnWriteArrayList iterator
		

		new ReadThread("Reader", threadSafeList).start();
		new WriterThread("Writer",threadSafeList).start();
	}

}

class ReadThread extends Thread{
	private List<Integer> list;
	
	public ReadThread(String name, List<Integer> list){
		this.list = list;
		super.setName(name);
	}
	
	public void run() {
			while(true) {
			String output = "\n" + super.getName() + " : ";
			
			Iterator<Integer> itr = list.iterator();
			
			while(itr.hasNext()) {
				Integer element = itr.next();
				output += " " + element;
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(output);
		}
	}
	
}

class WriterThread extends Thread{
	private List<Integer> list;
	
	public WriterThread(String name, List<Integer> list){
		this.list = list;
		super.setName(name);
	}
	
	public void run() {
		int count = 6;
		
			while(true) {
						try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			list.add(count++);
			System.out.println(super.getName() + " done");
			}
		}
	}

