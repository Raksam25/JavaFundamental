package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Array
| Date     :  04-Nov-2022
 =============================================================================*/

import java.util.Arrays;

/*
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
To declare an array, define the variable type with square brackets
Syntax:
DataType arrayName [];

To find out how many elements an array has, use the length property
Usually for loop is used to go through array elements, and use the length property to specify how many times the loop should run.
*/

public class Array {

	public static void main(String[] args) {

		// 1. Create Array
		// Syn: dataType arrName[]
		int arrNum[];	

		// 2 . Define Arrays - Allocate Memory
		// Syn : arrName = new dataType[size]
		arrNum = new int[4];

		// 3. Assign the values
		arrNum[0] = 100;
		arrNum[1] = 200;
		arrNum[2] = 300;
		arrNum[3] = 400;

		// Display (accessing)
		System.out.println(arrNum[2]);

		System.out.println("*********************Numbers***********************");

		// Alternative way
		int arrNum2[] = {10,20,30,40,50,60};
		System.out.println(arrNum2[3]);


		// Print all the arrays
		for(int iArr : arrNum2) {
			System.out.println(iArr);
		}

		// print as list using tostring method
		String arrNumList = Arrays.toString(arrNum2);
		System.out.println(arrNumList);

		System.out.println("********************Strings***********************");

		String arrName[] = {"Rakesh","Ram","Anand","Pranav"};
		System.out.println(arrName[3]);

		// Display
		for(String iArr : arrName) {
			System.out.println(iArr);
		}

		String arrNumList2 = Arrays.toString(arrName);
		System.out.println(arrNumList2);

		System.out.println("********************Methods***********************");

		// Present or not
		boolean word = Arrays.asList(arrName).contains("Anand");
		System.out.println(word);

		// String Method
		// split() method
		String msg = "Welcome to the world of AI. AI is called Artificical Intellience";

		String arrWords[] = msg.split("AI");
		for(String iArr : arrWords) {
			System.out.println(iArr);
		}

	}

}
