package com.inhouse.templatemethod;


public abstract class HouseTemplate {

	//template method, final so subclasses can't override
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}
	
	private void buildFoundation() {
		System.out.println("Building foundation...");
	}
	public abstract void buildPillars();
	public abstract void buildWalls();
	
	public void buildWindows() {
		System.out.println("Building Glass windows...");
	}
	
}
