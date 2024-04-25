package com.collectionsexample;

import java.util.HashSet;

public class HashsetExample {

	public static void main(String args[])
	{
		HashSet<String> setNumbers = new HashSet();
		
		setNumbers.add("Fifty");
		setNumbers.add("Ninety");
		setNumbers.add("Ten");
		setNumbers.add("Twenty");
		setNumbers.add("Thirty");
		setNumbers.add("Twenty");
		
		setNumbers.remove("Thirty");
		
		for(String num:setNumbers)
		{
		System.out.println(num);
		}
		
		
	}
		
	}
	
	
	
	

