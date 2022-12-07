package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain User Define Static Method
| Date     :  04-Nov-2022
=============================================================================*/

/**
 *  Method - A set of statement that are grouped together to perform  an operation
 *  
 *  User Defined Methods
 *  
 *  1. Methods without returning values
 *  
 *  2. Methods which returns values 
 * 
 */
public class UserDefinedMethodStatic {

	// Methods which returns values
	// accessModifier static returnType methodName(dataType variableName) // (Arguments or Parameters)
	public static int addition(int a, int b){
		int result = a + b;
		return result;		
	}

	public static int subtraction(int a, int b) {
		int result  = a - b;
		return result;		
	}

	// Method without returning value
	// accessModifier returnType methodName(dataType variableName)
	public static void display(int value) {
		System.out.println("The Value is "+ value);
	}

	public static void main(String[] args) {

		int add = addition(10,50);
		display(add);

		int sub = subtraction(40, 20);
		display(sub);

	}
}
