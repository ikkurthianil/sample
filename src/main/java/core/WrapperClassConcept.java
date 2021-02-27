package core;

public class WrapperClassConcept {

	public static void main(String[] args) 
	{
		

// String to integer convert
	String s="100";
	System.out.println(s+20);
	int i=Integer.parseInt(s);
	System.out.println("String to Integer=:"+i+20);
	
//String to double
	
	String r="89.0";
	double g=Double.parseDouble(r);
	System.out.println("String to Double=:"+g);
	
//String to Boolean
	String b="True";
	boolean b1=Boolean.parseBoolean(b);
	System.out.println("String to Boolean=:"+b1);
	
//Integer to String
		int i1=100;
		System.out.println(i1+20);
		String s1=String.valueOf(i1);
		System.out.println("Integer to String=:"+s1+20);
		
//double to String
		double o=99.0;
		String e=String.valueOf(o);
		System.out.println("Double to String=:"+e);
		
	//Can u convert this string to integer 	-->No because 
		String s3="100A";//it's not a pure numeric
		int i3=Integer.parseInt(s3);
		System.out.println(i3);// Display the NumberFormatException 
	}


	
}
