package com.TypeCastingExample;

public class TypeCastingExample {

	public static void main(String args[])
	{
//		Down Casting
		int a = 10;
		
		long b = a;
		
		float c = b;
	    System.out.println(b);
		System.out.println(c);
		
//		Up Casting
		
		double d = 510.10;
		
		long ln=(long)d;
		
		System.out.println(ln);
		
		int y = (int)ln;
		
		System.out.println(y);
		
	}
	
	
	
}
