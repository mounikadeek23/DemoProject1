
package com.javapractice;

public class SwitchStatementExample {

	public static void main(String args[]) {
		
		int day = 3;
		String weekday = "Not Defined";
		
		switch(day)
		{
			case 1 : weekday = "Monday";
			break;
			
			case 2 : weekday = "Wednesday";
			break;
			
			case 3 : weekday = "Saturday";
		}
		System.out.println(weekday);	
			
		}
	}
	
	

