package com.javapractice;

public class AlterationExample {
 
	public static void main(String args[])
	{
		int a = 25;
		int b = 20;
		int c = 5;
		
		if(a<b)
		{
			System.out.println("A is greater than B");
		}
		else if(a>c)
		{
			System.out.println("A is greater than C");
		}
		else
		{
			System.out.println("A is greater than B & C ");
		}
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater than  B and C");
			}
		}
	}
	
	
	
}
