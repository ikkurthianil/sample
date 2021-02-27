package oopsConcept;

public class TestInterface 
{

	public static void main(String[] args) 
	{
	
		HSBCBank hs =new HSBCBank();
		
		hs.credit();
		hs.debit();
		hs.refund();
	    hs.ownhs();
	    System.out.println(hs.i);
	    hs.atm();
	    System.out.println(UsBank.i);

	    
	    //Dynamic polymorisum:child class object can be refered by parent class refrence varible--->runtime polymorisum 
	    UsBank c=new HSBCBank();
	    c.credit();
	    c.debit();  // only overritten methods will be calling
	    c.refund();
	   // c.ownhs();this is own method not showing
	}

}
