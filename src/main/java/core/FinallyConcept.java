package core;

public class FinallyConcept 
{

	//Finally is a block 
	//Finally block associated with try catch block
	//After the try catch block then will execute the finally block
	
	public static void main(String[] args) 
	{
		test();
		test1();
	}
	
	
	public static void test()
	{
		try {
			System.out.println("Try Expection");
			throw new Exception("test");
		}catch(Exception e) {
			System.out.println("catch expection");
			
		}
			finally{
				System.out.println("final statement");
			}
		
	}
	
	
	
	public static  void test1()
	{
		try {
			System.out.println("Try exception");
		}finally{
			System.out.println("final statement");
		}
		
		
		
		
	}

	}


