package com.java.fundamentals;


/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Inheritance
| Date     :  04-Dec-2022
=============================================================================*/

/*
   When one object acquires all the properties and behaviours of parent object, it  is known as inheritance.
   Inheritance represents the IS-A relationship, also known as parent-  child relationship.
   It uses extends keyword to call the super or parent class.
   We can only inherit public and protected method of parent class not private method. As Scope of private is within class only.
   
   Inheritance id used in Java:
       For Code reusability.
       For Method Overriding (so runtime polymorphism can be achieved).
       
   Inheritance is of three level:
       Single Level Inheritance.
       MultiLevel Inheritance.
       Hierarchical Inheritance.
       
   Multiple Inheritance is not supported in Java i.e, calling multiple class using keyword "extends" leads to compile time error.         

  Syntax:
  
  class subclass-name extends superclass-name {
  body of class
  }
  
    OR,
    
    class childClass-name extends parentClass-name {
    body of class
    }
 */

public class InheritanceAccount {
	
	String name = " Welcome to the world of Banking";

	public void deposit() {
		System.out.println("Amount is deposited");
		System.out.println("Account Class is executed");
	}

	public void withdrawal() {
		System.out.println("Amount is withdrawn");
		System.out.println("Account Class is executed");
	}
	
	public void withdr(int w, int h) {
		System.out.println("Amount is withdrawn");
		System.out.println("Account Class is executed");
	}
	
	protected void with() {
		System.out.println("Amount is withdrawn");
		System.out.println("Account Class is executed");
	}
}
