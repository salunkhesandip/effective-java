package com.inhouse.templatemethod;


public class GlassHouse extends HouseTemplate{

	@Override
	public void buildPillars() {
		System.out.println("Building pillars with Glass coating.");
		
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
		
	}

}
