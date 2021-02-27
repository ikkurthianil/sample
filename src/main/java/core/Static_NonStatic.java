package core;

public class Static_NonStatic 
{
	//Global variable:The scope of the global variable will be available across all the functions with some conditions
	
	String name="tom";// NoN-Static Global variable
	static int age =45;// Static Global variable
	

	public static void main(String[] args) 
	{
		//how to call static method and variables
		
		//1.Direct calling
		System.out.println("Static Methods and Varibles");
		send();
		System.out.println(age);
		
		//2.calling by class name
		Static_NonStatic.send();
		System.out.println(Static_NonStatic.age);
		
		//how to calling non-static method

		Static_NonStatic ob=new Static_NonStatic();
		System.out.println("Non_Static Methods and Varibles");
		ob.sendMail();
	    System.out.println(ob.name);
		
	    //Can i access the static method by using object reference ----YES
	    ob.send(); //But it should be showing warning
		
		
	}

	public void sendMail()//Non static method
	{
		System.out.println("send mail");
	}
	
	public static void send()//Static method
	{
		System.out.println("send");
	}
}
