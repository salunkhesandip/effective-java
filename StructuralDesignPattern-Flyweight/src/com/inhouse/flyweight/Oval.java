package com.inhouse.flyweight;
import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape {
	//intrinsic property
	private boolean fill;
	
	public Oval(boolean f) {
		this.fill = f;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void draw(Graphics circle, int x1, int y1, int x2, int y2, Color color) {
		circle.setColor(color);
		circle.drawOval(x1, y1, x2, y2);
		if(fill) {
			circle.fillOval(x1, y1, x2, y2);
		}
	}

}
