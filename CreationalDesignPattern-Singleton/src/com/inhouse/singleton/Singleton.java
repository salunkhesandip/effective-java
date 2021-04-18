package com.inhouse.singleton;

public final class Singleton {
	 // The field must be declared volatile so that double check lock would work correctly.
	private static volatile Singleton instance;
	public String value;
	
	private Singleton(String value){
		this.value = value;
	}
	 
	// Private constructor to restrict instantiation of the class from other classes.
	// this is the global access point for outer world to get the instance of the singleton class.

	 public static Singleton getInstance(String value) {
		 if(instance == null) {
			 synchronized(Singleton.class) {
				 if(instance == null)
					 instance = new Singleton(value);
			 }
		 }
		 return instance;
	 }
}