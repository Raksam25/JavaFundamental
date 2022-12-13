package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Local Variable
| Date     :  04-Dec-2022
 =============================================================================*/

/*
 * 1. It will be declared within the method
 * 2. It will be created while executing the block in which we declared it
 * 3. We cannot access the local variable outside the method
 */
public class VariableLocal {

	public void sampleMethod() {
		// Local Variable
		int num = 10; 
		System.out.println(num);
	}

	public static void main(String[] args) {

		// Declaring local variable inside main method
		int num2 = 100;
		System.out.println(num2); // It will print the value of b

		// Calling the local variables of sampleMethod()
		// It cannot access the local variable outside the method
		// System.out.println(a); 
	}

}
