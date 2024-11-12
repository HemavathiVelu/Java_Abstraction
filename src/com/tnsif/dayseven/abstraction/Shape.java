package com.tnsif.dayseven.abstraction;

public abstract class Shape {
	protected float area;
	
	abstract void callArea();
	
	void show() {
		System.out.println("Area of the given shape is " + area);
	}
	

}
