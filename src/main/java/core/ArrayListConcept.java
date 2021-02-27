package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		int array[] = new int[3];
		// This is static array; size is fixed
		
		
        //It inherits the AbstractList class and implements List interface.
		//Java ArrayList --> extends AbstractListclass---> which implements--> List interface
		//Array List It Contain duplicate values
		// so we are using dynamic array that is called dynamic array list
		// ArrayList class maintains insertion order.
		// ArrayList class is non synchronized.(that is not thread safe)
		// It allows random access because array works at the index basis--->like(ar3.get(i))
		//addAll()--->ar.addAll(ar3);--->It can be added two list
		//removeAll()--->ar4.removeAll(ar3);--->It can be remove one list
		//retainAll()--->ar.retainAll(ar3);-->It can be showing combination of element in both
		//Collections.sort()--->Collections.sort(sr);-->List is should be sorted
		//The get() method returns the element at the specified index, 
		//The set() method changes the element--->al.set(1,"Dates");  to set the value based on index
		
		//Using Loops
		
		
		//For Loop
		/*for(int i=0;i<ar.size;i++)
		{
			System.out.println(ar.get(i));
		}
		*/
		
		
		//For Each
		/*
		 * for(Object ob:ar)
		 *  {
		 *   System.out.println(ob); 
		 *   }
		 */
		
		//Iterator
		/*
		 * Iterator sm= ob.iterator(); 
		 * while(sm.hasNext()) 
		 * {
		 * System.out.println(sm.next()); 
		 * }
		 */
		
		
		ArrayList ar = new ArrayList();
		ar.add("Anil");
		ar.add("siva");
		ar.add("test");
		ar.add("Anil");
		ar.add(74);
		System.out.println(ar.size());
		ar.set(2, "Ramu");
		System.out.println("alll valued" + ar);

		
		 System.out.println("-----Using For Loop-----");
		System.out.println("******NON-GENERIC ELEMENTS****");
		for (int i = 0; i < ar.size(); i++)
		{
			System.out.println("" + ar.get(i));
		}

		
		ArrayList<Integer> ar4 = new ArrayList<Integer>();

		ar4.add(24);
		ar4.add(10);
		ar4.add(44);
		ar4.add(14);
		
		 System.out.println("-----Using For Each Loop-----");
		for (Integer it : ar4) 
		{
		 System.out.println("advance" + it);
		}
		System.out.println(ar.size());

		
		
		ArrayList ar3 = new ArrayList();

		ar3.add(34);
		ar3.add(30);
		ar3.add(54);
		ar3.add(64);
		ar3.add(74);
		ar.add("siva");
		System.out.println(ar3.size());

		System.out.println("-----Using For Loop-----");
		System.out.println("******GENERIC ELEMENTS****");
		for (int i = 0; i < ar3.size(); i++) {

			System.out.println("" + ar3.get(i));

		}

		ArrayList<E> er1 = new ArrayList<E>();

		Employee e1 = new Employee("anil", 45, "as");
		Employee e2 = new Employee("Ravii", 48, "Das");
		Employee e3 = new Employee("RAMI", 42, "Aas");

		ArrayList<Employee> gt2 = new ArrayList<Employee>();

		gt2.add(e1);
		gt2.add(e2);
		gt2.add(e3);
		
		
		System.out.println("******CLASS OBJECTS****");
		System.out.println("-----Using Iterator-----");
		Iterator<Employee> it = gt2.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();

			System.out.println(emp.Name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		// AddAll() Mathod
		ar.addAll(ar3);
		
		System.out.println("******ADD ALL****");
		System.out.println("-----Using For Loop-----");
		for (int i = 0; i < ar.size(); i++)
		{
			System.out.println("" + ar.get(i));
		}

		// RemoveAll();

		ar4.removeAll(ar3);
		
		System.out.println("-----Using For Loop-----");
		System.out.println("******REMOVE ALL****");
		for (int i = 0; i < ar4.size(); i++) 
		{
			System.out.println("" + ar4.get(i));
		}

		// RatainAll
		ar.retainAll(ar3);
		System.out.println("-----Using For Loop-----");
		System.out.println("******RETAIN ALL****");
		for (int i = 0; i < ar.size(); i++) {

			System.out.println("" + ar.get(i));
		}

		//Sorted Array List
		ArrayList sr=new ArrayList();
		sr.add(23);
		sr.add(3);
		sr.add(13);
		sr.add(33);
		
		 Collections.sort(sr);
		 
		 System.out.println("******Sorted List****");
			System.out.println("-----Using For Loop-----");
		 for (int i = 0; i < sr.size(); i++) {

				System.out.println("" + sr.get(i));
			}

		 System.out.println("-----Using For Each Loop-----");
				for(Object d:sr)
				{
					System.out.println(d);
				}
				
				System.out.println("-----Using For Iterator Loop-----");
				Iterator it1 =	sr.iterator();
				while(it1.hasNext()) {
					System.out.println(it1.next());
				}
	}

}
