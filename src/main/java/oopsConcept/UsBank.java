package oopsConcept;


public interface UsBank 
{
	int i=10;
	final int k=10;
	static int  h=1;
 public void credit() ;
	 
 public void debit();
 
 public  void refund();
 
 
 //Interface is nothing but a class
 //Only method deceleration 
 //No method body only method  prototype
 //In Interface we can declare the variables,,,in variables by default static nature
 //The value of variables can not be changed,,it's final constant in nature
 //No static method are allowed in interface---why--interface is part of objects---objects can not have static methods
 //No Main method in interface
 //we can not create the object of interface because interface is an abstract in nature
 
}
