package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Super Keyword
| Date     :  10-Dec-2022
 =============================================================================*/

/*
 * The super keyword in Java is a reference variable which is used to refer immediate parent class object.
 * Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

 * Usage of Java super Keyword
1. super can be used to refer immediate parent class instance variable.
2. super can be used to invoke immediate parent class method.
3. super() can be used to invoke immediate parent class constructor.

 */

public class SuperKeyword extends InheritanceAccount {

	String name = "Saving Account Class - Child";

	public void deposit() {		
		System.out.println("SuperKeyword Class(Child) is executed");
		System.out.println("The variable value is "+ name);
		// Implementing the super keyword
		System.out.println("The variable value is "+ super.name);
	}

	public void show() {
		//deposit();
		super.deposit();
		
	}
	
	public static void main(String[] args) {
		SuperKeyword  obj = new SuperKeyword();
		obj.deposit();		
		obj.show();		
		
	}

}
