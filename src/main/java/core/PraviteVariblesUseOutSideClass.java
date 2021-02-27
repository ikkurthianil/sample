package core;

import java.lang.reflect.Field;

//Using Reflection
//getDeclaredField(string);
//setAccessible(boolean);

class Variables
{
private int i=2;	
}

public class PraviteVariblesUseOutSideClass 

{

	

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException 
	{
		Field f= Variables.class.getDeclaredField("i");
		Variables obj = new Variables();
		
		f.setAccessible(true);
		int s=(int)f.getInt(obj);
		
		System.out.println(s);
	}

}
