package com.java.fundamentals;


/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Method Overriding
| Date     :  10-Dec-2022
=============================================================================*/
/*
  -If subclass (child class) has the same method as declared in the parent class, it  is known as method overriding.
  -Rules for Method Over Riding:
            Method must have same name as in the parent class
            Method must have same parameter as in the parent class.
            Must be IS-A relationship (inheritance).
   -It is used to provide specific implementation of a method that is already  provided by its super class(Parent class
   -Method in a subclass has the same return type, name and parameter as in super class.
   -When overriden method is called from within a sub class, it will always refer to the version of method define in subclass
 */

// Parent Class
public class MethodOverridingRBI {

	float interest = 6.70f;
	public float getHomeLoan(float interest) {
		System.out.println("Home Loan Interest = "+ interest);
		System.out.println("RBI Class(parent) is executed");
		return interest;
	}
}
