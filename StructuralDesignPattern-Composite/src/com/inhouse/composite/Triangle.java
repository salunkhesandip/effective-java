package com.inhouse.composite;
// leaf
public class Triangle implements Shape {

	public void draw(String fillColor) {
		System.out.println("Drawing Triangle with " + fillColor);
	}

}
