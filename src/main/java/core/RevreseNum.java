package core;

public class RevreseNum {

	public static void main(String[] args) 
	{
		long num=123123123;	
		 long rev =0;
		 while(num!=0)
		 {
			 rev=rev *10 + num % 10;
			 num=num/10;
		 }
			 System.out.println(""+rev);
			 
		
			 long num1=1221213;
			 System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}
		

}
