package com.javapractice;

public class OperatorsExample {

	public static void main(String args[])
	{
		int a = 25;
		int b = 20;
		int c = 5;
		int d = a+b+c;
		
		System.out.println(d);
		
		int x = 33;
		int y = 7;
		int z = 33;
		
		if(x==y && x==z)
		{
			System.out.println("x is equal to y and z");
		}
		else
		{
			System.out.println("x is not eqaul to y and z");
		}
		
		if(x==y || x==z)
		{
		   System.out.println("x is equal to y or z");	
	    }
		else
		{
			System.out.println("x is not equal to y or z");
		}
		int k = 55;
		k++;
		System.out.println(k);
	    
		System.out.println(--k);
}
} 