package com.inhouse.adapter;


public class AdapterPatternTest {

	public static void main(String[] args) {
		testClassAdapter();
		testObjectAdapter();
	}

	public static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		System.out.println("v3 volts using Class Adapter="+ v3.getVolts());
	}
	
	public static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		System.out.println("v3 volts using Object Adapter="+ v3.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get3Volts();
		case 40: return sockAdapter.get40Volts();
		case 120: return sockAdapter.get120Volts();
		default: return sockAdapter.get120Volts();
		}
	}
}