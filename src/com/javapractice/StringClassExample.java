package com.javapractice;

public class StringClassExample {

	public static void main(String args[])
	{
		   String f = "This is java Class";
		   System.out.println(f.charAt(0));
		   System.out.println(f.charAt(5));
		   System.out.println(f.charAt(7));
		   System.out.println(f.charAt(6));
		   
		   String student1 = "Geetha";
		   String student2 = "Geethik";
		   
		   if(student1.equalsIgnoreCase(student2))
		   {
			  System.out.println("Both the student ames are same");
		   }
		   else {
				 System.out.println("student names are different");  
		   }
		  System.out.println(student1.isEmpty());
		  System.out.println(student1.toLowerCase());
		  System.out.println(student1.length());
		  
		  System.out.println(f.concat("class"));
		  
		  System.out.println(f.contains("good"));
		  
		  System.out.println(f.substring(0,6));
	}
}
