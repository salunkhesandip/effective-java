package com.inhouse.builder;


public class ComputerBuilderDirector {
	public static Computer getBasicComputer() {
		return new Computer.ComputerBuilder("500 GB", "2 GB").build();
	}
	
	public static Computer getGraphicsCardEnabledComputer() {
		return new Computer.ComputerBuilder("1 TB", "8 GB").setGraphicsCardEnabled(true).build();
	}
}
