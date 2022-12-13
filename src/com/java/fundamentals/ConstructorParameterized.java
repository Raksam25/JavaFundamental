package com.java.fundamentals;


/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Parameterize Constructor
| Date     :  04-Dec-2022
 =============================================================================*/
 
/*
 * The parameterized constructor is used to provide different values to distinct objects.
 * However, you can provide the same values also.
 */

public class ConstructorParameterized {
	
	// Instance Variable
	String empName;
	int empID;	
	
	ConstructorParameterized(String n,int i){
		empName = n;
		empID = i;
	}	
		
	public static void main(String[] args) { 
		ConstructorParameterized obj = new ConstructorParameterized("Welcome to Java Class",12345);
		System.out.println(obj.empName);
		System.out.println(obj.empID);
	}
}
