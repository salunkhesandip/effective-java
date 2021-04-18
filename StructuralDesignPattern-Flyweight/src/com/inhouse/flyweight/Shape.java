package com.inhouse.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public interface Shape {
	public void draw(Graphics line, int x1 , int y1, int x2 , int y2, Color color);
}
