package com.inhouse.composite;

// leaf
public class Circle implements Shape {

	public void draw(String fillColor) {
		System.out.println("Drawing Circle with " + fillColor);
	}

}