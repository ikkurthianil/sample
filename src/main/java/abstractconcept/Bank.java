package abstractconcept;

public abstract class Bank 
{
	//Abstract:Hiding the implementation logic-->is called abstraction
	//Abstration is a pertial abstraction 
	//Abstrcat class can have abstract methods and non abstract methods
	//can not create the object of abstrcat class
	//we craete the any kind of varible satic,non static and final varibles
	//When to use abs:When ever to use partial abstraction then we use abstraction like
	//(abstract&Non abstract method/commen metods)
	//Performsnce wise is fast
	//no static methods
	//We can create the constructor and crate the parent class object then first parent class statment print
	//0-100% abstract methods it should allow in abstract class(like witout given one abstract method we will create the abs)
	int a=10;
	final int age  =89;
	static int dec=90;
	
	
	//Absract methods
	public abstract void loan();
	//abstract method --->no body 
	
	
	//Constructor
	Bank()
	{
		System.out.println("Parent Class Constructor");
	}
	
	//Non abstract Methods
	public void fund() 
	{
		System.out.println("Normal Method");
	}
	
	public void reamount()
	{
		System.out.println("Normal Method");
	}
	
	static void run()
	{
		
	}
	
	
	
}
