package core;

public class While_loops {

	public static void main(String[] args) 
	{
		
		//Disadvantages: it will generate the infinite loop if you don't given incremental part
		
  //1.While Loop
	 int i=1; //Initialization
	 while(i<=10)//Conditional
	 {
		 System.err.println(i);
		 i=i+1;//incremental/decrement
	 }
	 System.out.println("************");
	 
  //2.For Loop
	 //j++  j=j+1;
	 for(int j=1;j<=10;j++) //Initialization & Conditional & incremental
	 {
		 System.out.println(j);
	 }
	 System.out.println("************");
	 //print 10 to 1
	 //k-- means k=k-1
	 //10 9 8 7 6 5 4 3 2 1
	 for(int k=10;k>=-10;k--)//Initialization & Conditional & decrement
	 {
		 System.out.println(k);
	 }
	}

}
