package core;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept 
{

	//HashMap is a class which implements Map Interface
	//extend one abstractMap Class
	//It contains only unique elements
	//Store the values--KEY--valu pair
	//It may have one null key and multiple null values
	//It maintains no order
	//HashMap is non-synchronized-->not thread safe
	//concurrent modification exception-->fail-fast condition
	
	//Using entry set For Loop
    
	/*
	 * for(Entry m:hm.entrySet()) 
	 * {
	 *  System.out.println(m.getKey()+""+m.getValue());
	 * }
	 */
	
	/*
	 * Set s= hm.entrySet(); 
	 * System.out.println("Using"+s);
	 */
	
	public static void main(String[] args) 
	{
	
    HashMap<Integer,String> hm =new HashMap<Integer,String>();
		/*
		 * HashMap hm=new HashMap(); 
		 * hm.put(1, "anil"); 
		 * hm.put('a', "Ramu");
		 * System.out.println(hm);
		 */
                  hm.put(1, "Selenium");
                  hm.put(2, "Anil");
                  hm.put(3, "Siva");
                  hm.put(4, "Ram");
                  System.out.println(hm.get(2));
                  System.out.println(hm.get(5));
                  
                  
                  //Using For Loop
                  
                  for(Entry m:hm.entrySet())
                  {
                	  System.out.println(m.getKey()+""+m.getValue());
                  }
                  
                Set s=  hm.entrySet();
                System.out.println("Using"+s);
               
                  //Remove
                  
                  hm.remove(2);
                  System.out.println(hm);
                  
HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
Employee e1=new Employee("Anil",23,"QA");
Employee e2=new Employee("Fall",26,"Te");
Employee e3=new Employee("darn",27,"Dev");
emp.put(1, e1);
emp.put(2, e2);
emp.put(3, e3);
//Traverse Map

for(Entry <Integer,Employee> m:emp.entrySet())
{
	int key=m.getKey();
	Employee e=m.getValue();
	System.out.println("Employee"+ key + "info:");
	System.out.println(e.Name+""+e.age+""+e.dept);
	
}
	}

}
