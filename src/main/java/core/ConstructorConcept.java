package core;

public class ConstructorConcept 
{
	//Constructor it's look like a fumctions but not a functions
	//Constructor can not a return any value
	//constructor name should be class name
	//can u over load a constructor--Yes
	//Can u override a constructor ---NO

	//Construcction
	 public ConstructorConcept()
	{
		System.out.println("default constructor");
	}
	
	 public ConstructorConcept(int i)
		{
			System.out.println(i);
		}
		
	 public ConstructorConcept(int i,double d)
		{
			System.out.println(i);
			System.out.println(i);
		}
		
	
	
	
	public static void main(String[] args) 
	{
		ConstructorConcept ob1=new ConstructorConcept();
		ConstructorConcept ob2=new ConstructorConcept(10);

		ConstructorConcept ob3 =new ConstructorConcept(23,87);



	}

}
