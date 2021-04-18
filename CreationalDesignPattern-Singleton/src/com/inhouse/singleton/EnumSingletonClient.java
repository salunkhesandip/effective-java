package com.inhouse.singleton;

public class EnumSingletonClient {

	public static void main(String[] args) {
		EnumSingleton singleton = EnumSingleton.INSTANCE;
		
		System.out.println(singleton.getValue());
		singleton.setValue(2);
		System.out.println(singleton.getValue());
	}

}
