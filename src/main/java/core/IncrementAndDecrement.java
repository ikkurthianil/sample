package core;

public class IncrementAndDecrement {

	public static void main(String[] args) 
	{
		
		
		int i=1;
		int j=i++;//Post Increment
		System.out.println(i); //i=2
		System.out.println(j);// j=1
		
		
		int k= 1;
		int m= ++k;//pre increment
		System.out.println(k); //k=2
		System.out.println(m);// m=2
		
		int n= 2;
		int o= n--;//post decrement
		System.out.println(n); //n=1
		System.out.println(o);// o=2
		
		int p= 2;
		int q= --p;//pre decrement
		System.out.println(p); //p=1
		System.out.println(q);// q=1
	}

}
