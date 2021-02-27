package core;

public class Local_Global_Varibles 
{
  //Global&Class variables
	String s= "anil";
	int age=20;
	
	
	public static void main(String[] args) 
	{
		// Here using the global  then create  the object of class then reference of object display the variables 
		Local_Global_Varibles ob=new Local_Global_Varibles();
		System.out.println("Global Varibles=:"+ob.s);
		System.out.println("Global Varibles=:"+ob.age);

            int i=10;// Local Variable(here using only in side the main method)
            System.out.println("Local Varibles in side the main method=:"+i);
	}

	public void add() 
	{
		int i=30;//Here using the in side the ass method-->local variables in side method
		int e=20;
	}
	
}
