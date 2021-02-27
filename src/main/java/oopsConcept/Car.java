package oopsConcept;

public class Car extends Vechile
{
	//Inheritance:We can create a one child class which can be inherit all the properties or Methods in parent class
	//Has-a Releation ship
	public void start()//Method override parent class
	{
		System.out.println("Car Start Method");
	}

	public void stop()
	{
		System.out.println("Car Stop Method");
	}
	
}
