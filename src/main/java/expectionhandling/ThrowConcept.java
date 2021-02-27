package expectionhandling;

public class ThrowConcept {

	//Throw:The "throw" keyword is used to throw an exception.
	//to achive the exception using try catch
	//You cannot throw multiple exceptions.
	//Throw is followed by an instance.
	public static void main(String[] args) 
	{
	
           System.out.println("ABC");
        try {
          throw new Exception("Naveen Exception");
             }catch(Exception e)
                {
	            e.printStackTrace();
              }
             System.out.println("DEF");
	}

}
