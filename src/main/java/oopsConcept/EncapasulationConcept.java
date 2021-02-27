package oopsConcept;

public class EncapasulationConcept 
{
	//To hide the data members--->it can be method it can be varibles outside of world no one seeing 
	//The binding fields and the method together 
	//Encapusalatio is also called as data hiding
	
	
	//Pravite varibles:so that these varibles can not accessed directly from out side the class
	private int ssn;
	private String name;
	private double contition;

	
	
	// If we want pravite varibles out side the calss then using public setter public methods
	//Getter setter method
	public static void main(String[] args)
	{
		EncapasulationConcept en= new EncapasulationConcept();
		en.setSsn(3131);
		en.setName("Anil");
		en.setContition(41.4);
		
		System.out.println("Employe ssn"+en.getSsn());
		System.out.println("Employee Name"+en.getName());
		System.out.println("Employee Contition"+en.getContition());
		
		
	}

	public int getSsn() 
	{
		return ssn;
	}

	public void setSsn(int ssn)
	{
		this.ssn = ssn;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getContition() 
	{
		return contition;
	}

	public void setContition(double contition)
	{
		this.contition = contition;
	}

	
	
}
