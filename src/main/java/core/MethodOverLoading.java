package core;

public class MethodOverLoading 
{

	
	public static void main(String[] args) 
	{
		System.out.println("main method one");
		MethodOverLoading mo=new MethodOverLoading ();
		mo.sum();
		mo.sum(10);
		mo.sum(20,30);
		mo.main(3);
		mo.main(2, 0);
	}
	
	public static void main(int a) 
	{
		System.out.println("main method two");
	}
		
	public static void main(int a,int l) 
	{
		System.out.println("main method three");
	}

	//Method Overload:when the method name is same with different arguments & 
	//different data type and different input parameters passing with in the same class
	// we can over load a main method
	
//Disadvantages of overload:
	//you can not crate a same method inside method	
	//Duplicate Methods:same method name and same number arguments &same data types are not allowed;
	
	
	public void sum()//0 input method
	{
		System.out.println("sum method zero");
	}
	
	public void sum(int i) //1 input method
	{
		System.out.println("sum method input one");
		System.out.println(i);
	}
    
	public void sum(int i,int k) //2 input method
	{
		System.out.println("sum method two imput");
		System.out.println(i+k);
	}
	
}
