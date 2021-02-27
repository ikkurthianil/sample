package core;


public class RevreseString 
{
	public static void main(String[] args) 
	{
		
	String s ="selenium";
	String rev="";	
	int s1=s.length();
	
	for(int i=s1-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(""+rev);
	
	//Another Way
	       String e="Anil";
           StringBuffer sf= new StringBuffer(e);

	{
		System.out.println(sf.reverse());
	}
	}
	
	

}
