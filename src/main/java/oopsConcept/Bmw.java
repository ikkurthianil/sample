package oopsConcept;

public class Bmw extends Car
{
	//Method over riding:When same method is present in parent class as well
	//as in child class with same name and same number of arguments is called method overriding
	//we can not override the final methods
	
	public void start()//Overridden Method is prefer first 
	{
		System.out.println("Bmw Start Method");
	}

	public void fual() 
	{
		System.out.println("Bmw Fual Method");
	}
	
	public void wheel() 
	{
		System.out.println("Bmw Fual wheel");
	}
	

}
