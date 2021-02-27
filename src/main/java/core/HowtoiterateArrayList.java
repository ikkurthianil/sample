package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class HowtoiterateArrayList 
{

	public static void main(String[] args) 
	{
		
		ArrayList<String> sr=new ArrayList<String>();
		      sr.add("samsund");
		      sr.add("sony");
		      sr.add("lg");
		      sr.add("Mi");
		      System.out.println("size od list"+ sr.size());
		      
		 //Using jdk 1.8 for each loop and lamida expression
		      System.out.println("*****Using For Each Lamida*****");
		      sr.forEach(sr2 -> {
		    	  System.out.println(sr2);
		      });
		     
		  //Using Iterator
		      System.out.println("*****Using Iterator*****");
		    Iterator<String> it=  sr.iterator();
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    }
		    
		   //Using iterator forEachRemaning()
		    System.out.println("*****Using Iterator forEachRemaning*****");
		       it= sr.iterator();
		    it.forEachRemaining(sr2 ->{
		    	System.out.println(sr2);
		    });
		    
		    //Using For Each
		    System.out.println("*****Using For Each*****");
		    for(String is:sr) {
		    	System.out.println(is);
		    }
		    //Using For Loop
		    System.out.println("*****Using For Loop*****");
		    for(int i=0;i<sr.size();i++)
		    {
		    	System.out.println(sr.get(i));
		    }
		    
		    //Using List Iterator
		    System.out.println("*****Using List Iterator*****");
		  ListIterator<String> itrw=  sr.listIterator(sr.size());
		  while(itrw.hasPrevious())
		  {
			
			  System.out.println(itrw.previous());
		  }
	}

}
