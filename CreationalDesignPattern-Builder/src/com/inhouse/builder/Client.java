package com.inhouse.builder;


public class Client {
	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").build();
		Computer comp1 = new Computer.ComputerBuilder("1 TB", "8 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		System.out.println(comp);
		System.out.println(comp1);
		
		Computer comp3 = ComputerBuilderDirector.getBasicComputer();

	}
}
