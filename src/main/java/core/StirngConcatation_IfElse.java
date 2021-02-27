package core;

public class StirngConcatation_IfElse {

	
	//+ To use the Concatenation operation
	//Println is use to print on the console with a new line
	//print is use to just print on the console
	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		
		String s1="Hello";
		String s2="world";
		
		System.out.println(a+b);
		System.out.println(s1+s2);
		System.out.println(s1+s2+a+b);
		System.out.println(s1+s2+(a+b));
		System.out.println(s1+a+s2+b);
		System.out.println(b+s1+a+s2+b);
		System.out.print(s1+a+s2+b);    // no new line
		System.out.println(a+b);
		
		// If condition
		
		//Compassion operations
		//<  >  <= >=  ==  !=
		
		if(a<b)
		{
			System.out.println("Condition is true");
		}
		else {
			System.out.println("Condition is false");
		}
		
		//== operation
		int d= 10;
		int r=10;
		
		if(d==r)
		{
			System.out.println("Condition is true equal d");
		}
		else
		{
			System.out.println("Condition is true not equal d");
		}
		
		//Find out the Highest number
		
		int a1=100;
		int a2=400;
		int a3=300;
		//using nested if loop
		if(a1>a2 & a1>a3) //false+false=false;  true+true=true;  false+true=false
		{
			System.out.println("A1 is the higest Value ");
		}
		else if(a2>a3) {
			System.out.println("A2 Is the higest value");
		}
		else {
			System.out.println("A3 Is the higest value");
		}
			
	}

}
