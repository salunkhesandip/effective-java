package com.inhouse.factory;


public class ComputerClient {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.createComputer(ComputerType.PC, "2GB", "SATA", "Intel Core i5");
		Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "8GB", "SDD", "Intel Core i10");
	
		System.out.println("Factory PC Config::" +pc);
		System.out.println("Factory Server Config::" +server);
	}
}
