package com.javapractice;

public class ForLoopExmaple {

	public static void main(String args[])
	{
//		Normal for loop
		for(int i=4;i<7;i++)
		{
			System.out.println(i);
		}
		
//		Enhanced for loop
		 int [] Array1 = {22,25,26,36};
		 
		for(int a:Array1)
		{
			System.out.println(a);
		}
		
		 for(int i=0;i<=10;i++);
		 {
			 for(int j=0;j<6;j++)
			 {
				 System.out.println(j);
			 }
		 }
	}
}
