package com.javapractice;


abstract class shape {

	abstract void draw();
	abstract void colour();
	
	public void print()
	{
		System.out.println("Printing something");
	}
}
 class triangle extends shape
 {

@Override
void draw() {

	System.out.println("Draw a cricle");
	
}

@Override
void colour() {
	 
	System.out.println("Circle is in gray colour");
	
}
}
 class square extends shape
 {

	@Override
	void draw() {
		System.out.println("Drawing square");
		
	}

	@Override
	void colour() {
		System.out.println("square colour is green");
		
	}
	 
 }
 
 public class AbstracClassExample
 {
	public static void main(String args[])
	{
		shape s1 = new triangle();
		s1.draw();
		
		shape s2 = new square();
		s2.draw();
		s2.colour(); 
	}
 }
 