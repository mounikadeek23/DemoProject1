package com.javapractice;

public class ArrayExample {

	public static void main(String args[])
	{
//		syntax of creating an array
		
//		Data type, array name with the size for creating the array
		int array1[] = new int[5];
	
//		second wway of creating array
		
		int array2[] = {10,20,30,40,50};
		
		array1[0] = 32;
		array1[1] = 36;
		array1[2] = 40;
		array1[3] = 44;
		array1[4] = 48;
		
		System.out.println("The size of array1="+array1.length);
		System.out.println("The size of the array2="+array2.length);
		
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
		for(int i=0;i<array2.length;i++)
		{
			System.out.println(array2[i]);
		}
	}
}
