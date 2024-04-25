package com.javapractice;


	class vehicle
	{
		public void run()
		{
			System.out.println("Vehivle run with petrol");
		}
	}
	
	class car extends vehicle
	{
//		Using the same method name which is defined in my main class(parent)is called as MethodOverRiding
		public void run()
		{
			System.out.println("Car runs in Petrol");
		}
	}
	
	public class MethodOverRidingExample{
		 public static void main(String args[])
		 {
			 
			 car c1 = new car();
			 c1.run();
	}
	
	
}
