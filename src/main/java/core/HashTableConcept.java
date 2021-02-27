package core;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept 
{

	//It is Smiler to HashMap ,but is synchronized
	//stores the value on the basis of key value
	//Hash Table the key stored in the form object each and every object one unique HashCode
	//It contain unique value
	//Null key and null values are not allowed (null pointer expection is diaplayed)
	// System.out.println(h3.hashCode()); for hashcode
	// if(h3.containsValue("Sima"))-->value is there are not
	//if(h2.equals(h3))--->both tables are same are not
	// h2 = (Hashtable)h.clone();--->Copy table
	//h2.clear();--->clear table
	
	//Enumeration
	/*
	 * Enumeration e= h3.elements();
	 *  while(e.hasMoreElements()) 
	 *  {
	 * System.out.println(e.nextElement()); 
	 * }
	 */
	
	
	public static void main(String[] args) 
	{
		Hashtable h=new Hashtable();
		h.put(1, "Anil");
		h.put(2, "Siva");
		h.put(3, "Ravi");
		
		
			//Create clone/copy shallow copy
		
		Hashtable h2=new Hashtable();
		
		  h2 = (Hashtable)h.clone();
		  System.out.println(h2);
		  System.out.println(h);
		  
		  //clear h2
		  h2.clear();
		  System.out.println(h2);
		  
		  System.out.println(h);
		  
		  //Contains
		  Hashtable h3= new Hashtable();
		  h3.put(1, "Anil");
			h3.put(2, "Siva");
			h3.put("A", "Siva");
			h3.put(2, "Siva");// it contains uniq values
		  if(h3.containsValue("Sima"))
			  System.out.println("Valuefound");
		  
		  
		  //Get the all the values hashtable using ---.enumeration
		  Enumeration e= h3.elements();
		  while(e.hasMoreElements()) {
			  System.out.println("Using Enumeration="+e.nextElement());
		  }
		  
		  
		  //Using Entry set
		 Set s= h3.entrySet();
		 System.out.println("Using Entry Set="+s);
		 
		 //Check the both table are equal are not
		 
		 if(h2.equals(h3))
			 System.out.println("both are eual");
		 
		 //get the value from thr key
		 System.out.println(h3.get(1));
		 
		 //get the hashcode using the key object
		 System.out.println(h3.hashCode());
	}

}
