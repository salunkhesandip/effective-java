package com.inhouse.debug;

public class DebugMain {

	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.count();
		System.out.println("We have counted : " + counter.getResult());
		counter.count();
	}

}
