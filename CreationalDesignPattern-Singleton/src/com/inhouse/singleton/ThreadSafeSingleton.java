package com.inhouse.singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	private String value;
	private ThreadSafeSingleton() {
		value = "Singleton Class";
		System.out.println(value);
	}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance == null)
			instance = new ThreadSafeSingleton();
		return instance;
	}
}
