package core;

public class StringToInteger_IntToString 
{

	public static void main(String[] args) 
	{
		
		//String to integer
		
		String s="2015";
		int i=Integer.parseInt(s);
		{
		System.out.println(i);
		}
		int i1=Integer.valueOf(s);
		System.out.println(i1);
		
		
		//Integer to String
		
		int k=2015;
		String s2=Integer.toString(k);
		System.out.println(s2);
		
		int l=2010;
		Integer s3=Integer.valueOf(l);
		System.out.println(s3);
		
		
		
		
		
	}

}
