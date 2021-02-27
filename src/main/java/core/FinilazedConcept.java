package core;

public class FinilazedConcept {
//finalize() is method
//Just before the object is garbage collector 
//finalize() is called by the garbage collector on an object
//when garbage collection determines that there are no more references to the object.
	public void finalize(){
	
		System.out.println("Finilized method");
	}
	
	
	public static void main(String[] args) 
	{

		FinilazedConcept f1=new FinilazedConcept();
		FinilazedConcept f2=new FinilazedConcept();
       f1=null;
       f2=null;
       System.gc();
	}
	
}
