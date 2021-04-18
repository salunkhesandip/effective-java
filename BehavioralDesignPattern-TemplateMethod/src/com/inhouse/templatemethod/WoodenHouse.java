package com.inhouse.templatemethod;


public class WoodenHouse extends HouseTemplate{

	@Override
	public void buildPillars() {
		System.out.println("Building pillars with Wood coating.");
		
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
		
	}

}
