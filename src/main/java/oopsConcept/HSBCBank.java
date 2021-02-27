package oopsConcept;

public class HSBCBank implements UsBank ,Brezile//We are achiving multiple inhertance 
//Is=a relation ship called
{
	
//If a class implements any interface ,then it's mandatory to defind override all the methods of interface

	//US Bank Method i'e overrdie methods
 public void credit() 
 {
	 System.out.println("HS Credit Override");
 }
 
 public void debit()
 {
	 System.out.println("HS Debit Override");
 }
 
 public void refund()
 {
	 System.out.println("Hs Refund Override");
 }
 
 
//Own method of HSBC
 public void ownhs()
 {
	 System.out.println("Own Meyhod of HS");
 }
 
 
 //Brizle Bank method override method
 public void atm()
 {
	 System.out.println("Brzile Meyhod of override ");
 }
}
