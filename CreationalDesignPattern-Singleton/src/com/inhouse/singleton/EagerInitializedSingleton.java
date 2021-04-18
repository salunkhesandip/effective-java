package com.inhouse.singleton;


public class EagerInitializedSingleton {
	// the instance of Singleton Class is created at the time of class loading
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {}
	
	// this method doesn’t provide any options for exception handling.
	public static EagerInitializedSingleton getInstance() { 
		return instance;
	}
}
