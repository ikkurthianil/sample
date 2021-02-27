package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

public class ConvertListToSet 
{
	  static String s="selenium";
	public static void main(String[] args) 
	{
		
		//Array to set Convert
		
		List<String> mylist = Arrays.asList("Anil", "Ramu", "Krishna");	
		System.out.println(mylist);
	
		
		Set<String> set1 = ImmutableSet.copyOf(mylist);
		System.out.println(set1);
		
		
		 List<String> alphaList = new ArrayList<String>();
	        alphaList.add("A");
	        alphaList.add("B");
	        alphaList.add("C");
	        alphaList.add("A");
	        alphaList.add("B");
	        System.out.println("List values .....");
	        for (String alpha : alphaList)
	        {
	            System.out.println(alpha);
	        }
	        Set<String> alphaSet = new HashSet<String>(alphaList);
	        System.out.println("\nSet values .....");
	        for (String alpha : alphaSet)
	        {
	            System.out.println(alpha);
	        }
	        
	        
	        
	        
}
}