package com.inhouse.abstractfactory;


public class Client {
	public static void main(String[] args) {
		testAbstractFactory();
	}
	
	public static void testAbstractFactory() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("34 GB","5000 GB","2.4 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}
}
