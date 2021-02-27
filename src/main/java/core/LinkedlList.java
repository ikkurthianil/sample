package core;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlList 
{

	public static void main(String[] args) 
	{
		//LinkedList class uses a doubly linked list to store the elements.
		//It provides a linked-list data structure. 
		//In Java LinkedList class, manipulation is fast because no shifting needs to occur
		//addfirst();--->li.addFirst(90);
		//addLast();--->li.addLast(89);
		//removefirst();
		//removelast();
		
		//reverse List
		/*
		 * Iterator i=ll.descendingIterator(); 
		 * while(i.hasNext()) 
		 * {
		 * System.out.println(i.next()); 
		 * }
		 */
		
		LinkedList li = new LinkedList();
		
		li.add("anil");
		li.add("siva");
		li.add("mani");
		li.add(22);
		
		//Print
		System.out.println(" "+li);
		
		li.remove(2);
	    System.out.println("remove two index(mani)"+ li);
		
	   //addFirst
		li.addFirst(90);
		System.out.println(" "+li);
		
		//addLast
		li.addLast(89);
		System.out.println(" "+li);
		
		LinkedList<String> ln = new LinkedList<String>();
		ln.add("anil");
		ln.add("ramu");
		ln.add("dear");
		ln.add("kiran");
		
		
		//Set
		ln.set(0, "first");	
	    System.out.println(""+ ln);
	    
	    //get
	    System.out.println(""+   ln.get(2));
	    
	    //remove first & last
	    ln.removeFirst();
	    System.out.println("Remove first"+ ln);

	    ln.removeLast();
	    System.out.println("remove last"+ ln);

	    
	    
	    //for loop
	    System.out.println("****USING FOR LOOP****");
	    for(int n=0;n<li.size();n++)
	    {
	    	System.out.println(li.get(n));
	    }

	    //ADVANCE LOOP
	    System.out.println("******ADVANCE LOOP*****");
		for(String str:ln)
		{
			System.out.println((str));
		}
		
		//while Loop
		  System.out.println("******While LOOP*****");
		  int num=0;
		  while(ln.size()>=num);
		  {
			  System.out.println(ln.get(num));
			  num++;  
		  }
		
		  
		  //iterator
		  System.out.println("******ITERATOR LOOP*****");
		 Iterator<String> it =li.descendingIterator();
		  while(it.hasNext());
		  {
		  System.out.println(it.next());
	}

}}
