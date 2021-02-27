package abstractconcept;

public class InterfaceTest {

	public static void main(String[] args) 
	{

		IOD od=new IOD();
        od.start();
        od.reful();
        od.strop();
        od.threadsafe();

     
InteF e1=new IOD();
e1.reful();
e1.start();
e1.strop();

	}

}
