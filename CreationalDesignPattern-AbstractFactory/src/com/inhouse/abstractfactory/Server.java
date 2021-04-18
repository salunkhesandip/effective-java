package com.inhouse.abstractfactory;


public class Server extends Computer {

	private String RAM;
	private String HDD;
	private String CPU;
	
	
	public Server(String rAM, String hDD, String cPU) {
		this.RAM = rAM;
		this.HDD = hDD;
		this.CPU = cPU;
	}

	public String getRAM() {
		return this.RAM ;
	}

	public String getHDD() {
		return this.HDD ;
	}

	public String getCPU() {
		return this.CPU ;
	}

}
