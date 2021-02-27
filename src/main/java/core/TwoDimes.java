package core;

public class TwoDimes
{

	public static void main(String[] args) 
	{
	int a[][]=new int[3][3];
	
	System.out.println("Length of Row =" +a.length);
	System.out.println("Length of Coloum =" +a[0].length);
	a[0][0]=3;
	a[0][1]=4;
	a[0][2]=8;
	
	
	a[1][0]=6;
	a[1][1]=7;
	a[1][2]=1;
	
	a[2][0]=3;
	a[2][1]=4;
	a[2][2]=1;
	System.out.println("Index bases Array="+a[1][2]);

	for(int row=0;row<a.length;row++)
	{
		for(int col=0;col<a[0].length;col++)
		{
			System.out.println(+a[row][col]);
		}
		
	}
	
	
	
	

	}

}
