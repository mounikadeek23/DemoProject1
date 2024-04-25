package com.javapractice;

public class AccessModifierExample {

	private int a = 10;
	
	public void print1()
	{
		System.out.println("Printing Public Method");
	}
	
	protected void print2()
	{
		System.out.println("Printing Protected Method");
	}
	
	private void print3()
	{
		System.out.println("Printing Private Method");
	}
	void print4()
	{
		System.out.println("Printing Default Method");
	}
	
	
}

class A
{
	public static void main(String args[])
	{
		AccessModifierExample obj1 = new AccessModifierExample();
		
		obj1.print2();
		obj1.print1();
		obj1.print4();
		
}
}