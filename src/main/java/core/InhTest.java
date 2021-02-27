package core;

class A {
	void car() 
	{
		System.out.println("ClassA Statements");
	}
}

public class InhTest extends A 
{
	void bike() 
	{
		System.out.println("ClassB Statements");
	}

	public static void main(String[] args)

	{
		InhTest d = new InhTest();
		d.car();
		d.bike();
	}

}
