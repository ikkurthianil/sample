package core;

public class Class_Object 
{
	//class: is an entity we have to define number of properties ,we have define numbers of methods and variables
	//Object means we have to create the physical entity of the particular class
	//Object:To create the instance of a class is called object
	
	//class variables 
	int model;
	int bike;
	public static void main(String[] args) 
	{
		//new ClassName()--->This is the object of the class
		//object variables duplicates are not allowed
		// new keyword is use to create the object
		//a,a1,a2 object reference variables
		
	//how to create the object
		
		Class_Object a=new 	Class_Object();
		Class_Object a1=new Class_Object();
		Class_Object a2=new Class_Object();
		
	//How to pass the copy of class variables each  and every object
		
		a.model=2100;//pass values using object reference
		a.bike=9;
		
		a1.model=2019;
		a1.bike=2;
		
		a2.model=1999;
		a2.bike=3;
		System.out.println("befor shifting refrence varibles");
		System.out.println(a.model);
		System.out.println(a2.model);
		System.out.println(a2.bike);
		System.out.println("After shifting refrence varibles");
		
		a=a1;
		a1=a2;
		a2=a;
		a.model=10;
		System.out.println(a.model);
		a2.model=30;
		System.out.println(a.model);
				
				
		
		
		
}}
