package com.javapractice;

public class constructorExample {

    public void print()	
	{
		System.out.println("this is the method");
	}
//  Default constructor
	constructorExample()
	{
		System.out.println("this is constructor method");
	}
//	Parametrixed Constructor
	constructorExample(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
//	constructor overloading
	
	constructorExample(int e, int f, int g)
	{
		int h = e*f+g;
		System.out.println(h);
	}
	
	constructorExample(int Roll,String name)
	{
		System.out.println("Roll Number is:"+Roll);
		System.out.println("Name is:" +name);
	}
	public static void main (String args[])
	{
     constructorExample ce = new constructorExample();
     
     ce.print();
     
     constructorExample ce1 = new constructorExample(15,16);
	
     constructorExample ce2 = new constructorExample(23, "Shristi Deshay");
     
     constructorExample ce3 = new constructorExample(1, 2,3);		 
	}


}
