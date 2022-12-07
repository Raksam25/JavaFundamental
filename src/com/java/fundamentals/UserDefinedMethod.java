package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain User Define Method
| Date     :  04-Nov-2022
=============================================================================*/

/**
	    Method - A set of statement that are grouped together to perform  an operation
	    Methods are used to perform certain actions, and they are also known as functions in java.
	    It is defined with the name of the method, followed by parentheses ()
		To call a method in Java, write the method's name followed by parentheses ()
		Parameters are specified after the method name, inside the parentheses separated by a comma.
		When a parameter is passed to the method while calling, it is called an argument.
		Calling method must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.

	    User Defined Methods

	    1. Methods without returning values
	    2. Methods which returns values 

 */
public class UserDefinedMethod {

	// Methods which returns values
	// accessModifier returnType methodName(dataType variableName) // (Arguments or Parameters)
	public int addition(int a, int b){
		int result = a + b;
		return result;		
	}

	public int subtraction(int a, int b) {
		int result  = a - b;
		return result;		
	}

	// Method without returning value
	// accessModifier returnType methodName(dataType variableName)
	public void display(int value) {
		System.out.println("The value is "+ value);
	}

	public static void main(String[] args) {

		//UserDefinedMethod obj = new UserDefinedMethod();
		UserDefinedMethod obj;
		obj = new UserDefinedMethod();
		
		int add = obj.addition(10, 20);
		System.out.println(add);

		int sub = obj.subtraction(20, 10);
		System.out.println(sub);

		obj.display(add);
		obj.display(sub);


	}		

}
