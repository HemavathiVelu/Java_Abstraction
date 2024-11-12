package com.tnsif.dayseven.abstraction;

public class Rectangle extends Shape {
	private float width,height;
	
	public Rectangle() {
		this.width=5.5f;
		this.height=2.2f;
	}
	
	public Rectangle(float width,float  height) {
		this.width=width;
		this.height=height;
	}
	
	void callArea() {
		area=width*height;
	}

}
