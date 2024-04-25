package com.javapractice;
   
class mathsproblems
{
	int numberoflines = 4;
	
	public void triangle() 
	{
		System.out.println("triangle problems");
	}
	
}

class clock extends mathsproblems
{
	public void clock1()
	{
		System.out.println("Clock has 12 numbers");
	}
	
}

class train extends clock
{
	public void train1()
	{
		System.out.println("train is a best transport way");
	}
}


public class inheritanceExample {

	public static void main(String args[])
	{
		clock m1 = new clock();
		m1.triangle();
		m1.clock1();
		
		
		train t1 = new train();
		t1.train1();
		
	}
	
}
