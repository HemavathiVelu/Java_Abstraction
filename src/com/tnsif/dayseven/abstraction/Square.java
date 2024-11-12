package com.tnsif.dayseven.abstraction;

public class Square extends Shape {
	private float side;
	
	public Square() {
		side=2.5f;
	}
	
	public Square(float side) {
		this.side=side;
	}
	
	void callArea() {
		super.area=side*side;
	}

}
