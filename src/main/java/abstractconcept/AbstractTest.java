package abstractconcept;

public class AbstractTest {

	public static void main(String[] args) 
	{

		HDFC op=new HDFC();
		op.loan();
        op.fund();
       // op.reamount();
        op.run();
        
        //dynamic polyerisum 
       Bank op1=new HDFC();
            op1.fund();
            op1.reamount();
            op1.loan();
            
            
	}

}
