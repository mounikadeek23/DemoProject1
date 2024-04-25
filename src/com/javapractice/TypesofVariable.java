package com.javapractice;

public class TypesofVariable {
//	global variable(displayed in blue)
	int a=10;
	
	int b = 54;
	
	public void print1()
	{ 
//		local variable is basically created inside the method
		int x = 16;
		System.out.println(x);
	}

//	method with return type
	public int add()
	{
		int a = 15;
		int b = 12;
		int c = a+b;
		return c;
	}
	public static void print2()
		{
		System.out.println("print this is democlass");
	}
	
//	This is the main method to create an object we need to use the class name for that
	
	public static  void main(String args[]) {
		TypesofVariable obj1 = new TypesofVariable();
		System.out.println(obj1.a);
		
		boolean javaiseasy = true;
		char Chitti = 's';
		System.out.println(javaiseasy);
		System.out.println(Chitti);
		obj1.print1();
		System.out.println(obj1.add());
		obj1.print2();
	} 
	

}
