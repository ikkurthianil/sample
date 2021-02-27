package core;

public class RemoveJunk {

	public static void main(String[] args) 
	{
		String s="@##@%%&& java anil kumar12321313";
		String s1=" *()&(&  234423  anadhahak423472&&%&%&9 qrwirgjgro711263u";
		
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
				
	}

}
