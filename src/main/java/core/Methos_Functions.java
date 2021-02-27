package core;

public class Methos_Functions 
{

	public static void main(String[] args) 
	{
		Methos_Functions ob=new Methos_Functions();
		//one object will be created obj is the reference variable ,refereeing to this object
		//after creating the object,the copy of all non static methods will be given to this object
		
		ob.test();
		int i=ob.cat();
		System.out.println(i);
		String s1=ob.add();
		System.out.println(s1);
		  int m=ob.division(100, 10);
		  System.out.println(m);
		//Why main method void--->because we never write the return type in side the main method
	}
	
	//Non-Static methods
	// return type-->void
	// Void means does not return any value
		public void test()//no input ,no output
		{
			System.out.println("Empty Method");
		}
		
		
		//return type---> Int
        public int cat() //no input some out put
        {
        	System.out.println("catmethod");
        	int a=10;
        	int b=20;
        	int c=a+b;
        	return c;
        }
        
        
        //return type--> String
        public String add()//no input some out put
        {
        	System.out.println("addMethod");
        	String s="Selenium";
        	return s;
        }
        
        
        //return--->int
        //x/y input parameters/arguments 
        public int division(int x,int y) 
        {
        	System.out.println("Division Method");
        	int d=x/y;
        	return d;
        }
        
        
	}


