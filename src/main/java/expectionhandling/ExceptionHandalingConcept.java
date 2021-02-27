package expectionhandling;

public class ExceptionHandalingConcept 
{
	
//ExceptionHandeling:To handle the runtime errors so that normal flow of the application can be maintained.
//To achive the Exceptions we are using try catch block
//TryCatch:To handels the Exceptions and report the exceptions also in side the catch block
	
	
	int a=10;
	public static void main(String[] args) 
	{
	   //uncought exception
		
		  int i=9/0; //Arthmatic exception is showing
		 System.out.println(i);
		 		
		//cought exception
		//  Thread.sleep(2000);// showing add try catch hins in java
		
		
		  ExceptionHandalingConcept ob = null; 
		  ob=null; //Null point exception is  showing because ob=null creating
		  System.out.println(ob.a);
		 
		
		//Types of Exceptionshandles
		//1.try-catch block
		try {
			int k=9/0;	
		}
		catch(Exception e)
			{
		e.printStackTrace();
		System.out.println((e.getMessage()));
			
	}
		System.out.println("abc");
	}}
