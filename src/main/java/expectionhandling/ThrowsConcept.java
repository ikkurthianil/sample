package expectionhandling;

public class ThrowsConcept 
{
//The Throwable class is the superclass of all errors and exceptions  
//Error-->Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.
//Exception-->Is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime
// ex:ArithmeticException, NullPointerException,ArrayIndexOutOfBoundsException etc
	
//CheckedException:Checked exceptions are checked at compile-time.(sqlException,filenotfound)
       //It means if a method is throwing a checked exception then it should handle the exception using try-catch block 
	
	
//Unchecked:Unchecked exceptions are not checked at compile time(arrayindex,nullpointer)
//If you compile this code, it would compile successfully however when you will run it, it would throw Exception

//Throwes:The "throws" keyword is used to declare exceptions. It doesn't throw an exception
//Throwes is used to infront of the method
//It's kind of handling where exception will be thrown one method to 
//another method to main method then jvm ging to exception then program is terminted
//To achive the throwes using try catch then program will be execute with no exceptions
//	Throws is followed by class.
//You can declare multiple exceptions e.g.
//public void method()throws IOException,SQLException.

	
	public static void main(String[] args)
	{
		
		ThrowsConcept ob= new ThrowsConcept();
		ob.sum();
		 
		System.out.println("Anil");
	}

	public void sum()
	{
		try {
		 div();
		 div23();
		}catch(ArithmeticException e)
		{
			
		}
	}
	public void div()throws ArithmeticException 
	{
		
		int i=9/0;//exception line
	}
	public void div23()throws NullPointerException
	{
		
		String s=null;  
		System.out.println(s.length());//NullPointerException  
	}
	
	
}
