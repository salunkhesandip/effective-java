package com.inhouse.builder;


public class Computer {
	private String HDD, RAM; // required parameters	
	private boolean isGraphicsCardEnabled, isBluetoothEnabled; // optional parameters

	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	}
	
	public String getHDD() {
		return HDD;
	}
	public String getRAM() {
		return RAM;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	public static class ComputerBuilder {
		private String HDD, RAM; // required parameters	
		private boolean isGraphicsCardEnabled, isBluetoothEnabled; // optional parameters
		
		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}
		
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}
	}
	
	public String toString(){
		return "HDD= "+this.getHDD()+", RAM="+this.getRAM()+", isGraphicsCardEnabled="+this.isGraphicsCardEnabled() + ", isBluetoothEnabled=" + isBluetoothEnabled;
	}
}
