package core;

public class SingleArray 
{
	//To store the values with smiler data type 
	//lowest bound index=0;
	//upper bound index(n-1);(n is size of array)
	//one dimensional array
	
	//DisAdvantages of Array
	//---------------------
	//Size is fixed--->to over come this problem--->using collection like array list,linked list--->dynamic array
	//Stores in smiler data types--->over come this problem using object array  

	public static void main(String[] args) 
	{
		int a[]=new int[3];
		a[0]=12;
		a[1]=20;
		a[2]=40;
	
		System.out.println("Length of the Array = "+a.length);
		
	//Based on the index get the result
		System.out.println(a[2]);
	//Array boundary index error
		
	   // System.out.println(a[4]);
		
	// Print all the values using for loop
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Print All Values=" + a[i]);
		}
		
		//char 
		char c[]=new char[3];
		c[0]='w';
		c[1]=3;
		System.out.println(+c[1]);
		
		//String
		String s[]=new String[4];
		s[0]="Anil";
		s[1]="Srinu";
		s[2]="Dream";
		
		System.out.println("Length of the string array "+ s.length);
		System.out.println(s[1]);
		
		//Using object array
		Object[] ob=new Object[4];
		ob[0]="anil";
		ob[1]=2;
		ob[2]='c';
		ob[3]=true;
		
		System.out.println("Length of object array = " +ob.length);
		System.out.println("2 array index = " + ob[2]);
		
		System.out.println("-----Using normal loop-----");
		for(int i=0;i<ob.length;i++)
		{
			System.out.println("Object of Array = " +ob[i]);
		}
		
		System.out.println("-----Using for each loop-----");	
		for(Object ar:ob) 
		{
			
			System.out.println("Object of Array = "+ar);
		}
		
		
	}

}
