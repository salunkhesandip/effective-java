package com.inhouse.abstractfactory;


public class ServerFactory implements ComputerAbstractFactory {

	private String ram, hdd, cpu;
	
	public ServerFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	public Computer createComputer() {
		return new Server(ram , cpu, hdd);
	}

}
