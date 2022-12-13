package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Constructor
| Date     :  04-Dec-2022
=============================================================================*/

/*
			   In Java, a constructor is a block of codes similar to the method. 
			   It is called when an instance of the class is created. 
			   It can be used to set initial values for object attributes.
			   At the time of calling constructor, memory for the object is allocated in the memory.

			  It is a special type of method which is used to initialize the object.

			  Every time an object is created using the new() keyword, at least one constructor is called.

			  It calls a default constructor if there is no constructor available in the class. 
			  In such case, Java compiler provides a default constructor by default..

			  Rules for creating Java constructor
			1. Constructor name must be the same as its class name
			2. A Constructor must have no explicit return type
			3. A Java constructor cannot be abstract, static, final, and synchronized

 */

public class ConstructorDefault {

	// Instance Variable
	String name;
	int empID;	

	ConstructorDefault(){
		System.out.println("Constructor is executed first");
	}

	public static void main(String[] args) {

		ConstructorDefault obj = new ConstructorDefault();
		System.out.println(obj.name);
		System.out.println(obj.empID);

	}

}
