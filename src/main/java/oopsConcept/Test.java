	package oopsConcept;

public class Test 
{

	public static void main(String[] args) 
	{
	//Static Polymorphism---->Compiletime polymorphism
		System.out.println("***Bmw Clild Class All Properties with out same method of parent class**");
		Bmw bm=new Bmw();
	    //bm.start() parent start method not showing
		bm.start();
		bm.stop();
		bm.fual();
		bm.wheel();
		bm.engine();
	
		System.out.println("*****Car Parent Class All Properties*****");
		Car c=new Car();
		c.start();
		c.stop();
		c.engine();
	
		
		//Top Casting
		System.out.println("*****Car Parent Class All Properties and Combination of child method properties ****");
 //using child class object reference	
 //Child class object can be refereed by parent class reference variable is called-->runtimepolimorisum-->dynamic polyrisum
		Car c1=new Bmw();
		c1.start();//(Bmw method)it will execute overridden statement(like child class method)
		c1.stop();
		c1.engine();
		
		//Down casting
		//Using parent class object can be refereed by Child class reference variable
		//To achieve the casting but it will give the rum time error i.e(class cast exception)
		Bmw b1=(Bmw) new Car();//If we are using then class cast exception is displayed
		b1.start();

		
		Vechile v1=new Bmw();
		v1.engine();
		v1.start();
		
		
		
		
	}

}
