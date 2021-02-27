package core;

public class CallByvalue_Refrence 
{
 // by using the object reference to achieve the call by reference
	int p;
	int q;
	
	public static void main(String[] args) 
	{
		
		CallByvalue_Refrence va=new CallByvalue_Refrence();
		int x=30;
		int y=40;
	    va.sum(x,y);// call by value or pass by value
		
		va.p=50;
		va.q=100;
		
		va.swap(va);
		//after swap
		System.out.println(va.p);
		System.out.println(va.q);
	}

	
	public int sum(int a,int b)
	{
		 a=50;
		 b=20;
		int c=a+b;
		return c;
	}
	
	//Call by reference
	public void swap(CallByvalue_Refrence t) 
	{
		int temp;
		temp=t.p; //temp=50
		t.p=t.q;  //p=100;
		t.q=temp; //q=50;
		
	}
}
