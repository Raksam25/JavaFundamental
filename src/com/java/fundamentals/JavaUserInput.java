package com.java.fundamentals;

import java.util.Scanner;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain User Input.
| Date     :  04-Dec-2022
=============================================================================*/

public class JavaUserInput {

	/*
	 * Java User Input
	 * The Scanner class is used to get user input, and it is found in the java.util package.
	 * 
	 * To use the Scanner class, create an object of the class and 
	 * use any of the available methods found in the Scanner class documentation. 
	 * 
	 */

	public static void main(String[] args) {

		// To get the input from user dynamically 
		// ScannerClass objectName = new ScannerConstructor()
		Scanner scn = new Scanner(System.in);

		// nextLine() method used for String values
		System.out.println("Enter the name of person ");
		String name = scn.nextLine();   
		System.out.println("The user name is "+ name);

		// nextInt() method used for integer values
		System.out.println("Enter the age");
		int age = scn.nextInt();
		System.out.println("Age of the person is "+ age);

		// nextFloat() method used for integer values
		System.out.println("Enter the Salary");
		float salary = scn.nextFloat();
		System.out.println("The salary of the person is "+ salary);

	}

}
