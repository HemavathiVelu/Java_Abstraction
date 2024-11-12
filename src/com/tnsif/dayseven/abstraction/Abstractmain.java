package com.tnsif.dayseven.abstraction;

public class Abstractmain {

	public static void main(String[] args) {
		Square s=new Square();
		Rectangle r=new Rectangle();
		s.callArea();
		s.show();
		r.callArea();
		r.show();
		
		
//run time polymorphism
		
		Shape shape;
		shape=new Square(3.5f);
		shape.callArea();
		shape.show();
		
		shape=new Rectangle(5.0f,2.4f);
		shape.callArea();
		shape.show();
		
	}

}
