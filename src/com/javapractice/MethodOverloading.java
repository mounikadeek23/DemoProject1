package com.javapractice;

public class MethodOverloading {

	public int add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	    
		return c;
	}
	public int add(int a,int b,int c)
	{
		int d = a+b+c;
		System.out.println(d);
	    
		return d;
	}
	
	public double add(double a, double b)
	{
		double d = a+b;
		System.out.println(d);
	    
		return d;
	}
	
	public static void main(String args[])
	{
		MethodOverloading m1 = new MethodOverloading();
	    m1.add(15, 20);
		m1.add(10, 13, 15);
		m1.add(2.1, 2.2);
	}
	
	
}
