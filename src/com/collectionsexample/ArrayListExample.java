package com.collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String args[])
	{
		
//		 Creation of an ArrayList
		List Automationresults = new ArrayList();
		Automationresults.add("this is Collection Example");
		Automationresults.add("Trinetra");
		
		for(int i=0;i<Automationresults.size();i++)
		{
//			System.out.println(Automationresults.get(i));
		}
		Automationresults.remove(0);
		
		for(int i=0;i<Automationresults.size();i++)
		{
//			System.out.println(Automationresults.get(i));
		}
		
		ArrayList<String> Schoolfriends = new ArrayList<String>();
		ArrayList<Integer>Marks = new ArrayList<Integer>();
		
		Marks.add(98);
		Marks.add(96);
		Marks.add(92);
		Marks.add(85);
		
		Schoolfriends.add("Rekha");
		Schoolfriends.add("Aliya Banu");
		Schoolfriends.add("Shruthi.Gajula");
		
		System.out.println(Schoolfriends);
		
        for(String team:Schoolfriends)
        {
        	System.out.println(team);
        }
        
        Schoolfriends.add(3, "Shrisha.Eshala");
        
        for(String team:Schoolfriends)
        {
        	System.out.println(team);
        }
        
        Collections.sort(Schoolfriends);
       Collections.sort(Marks); 
       
       System.out.println("***Sorting Marks***"); 
       
       for(int order:Marks)
       {
    	   System.out.println(order);
       }
	}

	
}
