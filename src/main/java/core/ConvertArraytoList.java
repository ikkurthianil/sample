package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArraytoList {

	//1.Arrays.asList();
	//2.collections.addAll();
	//3.add();
	public static void main(String[] args) 
	{
		String array[]= {"anil","Siva","Lion"};	
		//System.out.println(Arrays.toString(array));	
		
	//First Way	
		List a=Arrays.asList(array);
		{
		System.out.println("Usting Arrayslist="+a);	
		}
		
	//Second Way
		List a1=new ArrayList<String>();
		Collections.addAll(a1, array);
		{
			System.out.println("Usting CollectionsaddAll="+a1);	
		}
	//ThirdWay
		List a2=new ArrayList<String>();
		for(Object list1:array) 
			a2.add(list1);
			System.out.println(a2);
		
			
	
	//Array List to Array
			// Object[] arr = ArrLis.toArray();
			//Integer arr[] = new Integer[ArrLis.size()]; 
	      //   arr = ArrLis.toArray(arr)
			
			List e3=new ArrayList<String>();
			e3.add("Anil");
			
	  Object[] arr = new String[e3.size()]; 
      arr = e3.toArray(arr); 
      System.out.println(Arrays.toString(arr));
      
      Object[] arr1 = e3.toArray(); 
      System.out.println( Arrays.toString(arr1));
      
		
	}}


