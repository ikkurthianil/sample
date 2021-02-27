package abstractconcept;

public class IOD implements InteF 
{
	

	@Override
	public void start() 
	{
		// TODO Auto-generated method stub
		System.out.println("OOD override methods start");
	}

	
	@Override
	public void strop() {
		// TODO Auto-generated method stub
		System.out.println("OOD override methods strop");
	}

	@Override
	public void reful() {
		// TODO Auto-generated method stub
		System.out.println("OOD override methods reful");
	}
	
	
	//Non_Overriden method
	
	public void threadsafe()
	{
		System.out.println("OOd Internal method");
	}
	
	

}
