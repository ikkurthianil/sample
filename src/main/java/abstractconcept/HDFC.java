package abstractconcept;

public class HDFC extends Bank
{
	
	//Constructor
	HDFC()
	{
		System.out.println("Child Class Constructor");
	}
	
	
	@Override
	public void loan()
	{
		System.out.println("Over ride method");	
	}
	
	//Own Method
	public void add()
	{
		System.out.println("Internal Method");
	}
	
	
}
