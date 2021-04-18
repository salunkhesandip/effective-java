package com.inhouse.abstractfactory;


public class PCFactory implements ComputerAbstractFactory {

	private String ram,hdd,cpu;
	
	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}

}
