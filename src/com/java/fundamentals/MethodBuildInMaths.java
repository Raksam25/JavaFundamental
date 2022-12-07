package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Built In Maths Method.
| Date     :  04-Nov-2022
=============================================================================*/

public class MethodBuildInMaths {

		public static void main(String[] args) {

			int num1 = 10;
			int num2 = 20;
			int num3 = -10;
			float num4 = 145.67f;

			// Comparing the numbers
			System.out.println(num1==num2);
			System.out.println(num1==num3);

			System.out.println("***********************");

			// Mathematical Methods
			System.out.println("Maximum of two numbers is " + Math.max(num1, num2));

			System.out.println("Minimum of two numbers is " + Math.min(num1, num2));

			System.out.println("The Absolute value is " + Math.abs(num3));

			System.out.println("Round of value is " + Math.round(num4));

			System.out.println("Random number generated is " + Math.random());

			// To generate random number between 0 to 1000
			int randomNum = (int)(Math.random() * 1001);
			System.out.println("Random number between 0 to 1000 is " + randomNum);	

			System.out.println("***********************");

			// Integer Parsing - Converting String to Integer 
			int x = Integer.parseInt("10");
			System.out.println(x);

			int y = Integer.parseInt("20");
			System.out.println(y);

			// Adding x + y 
			System.out.println(x+y);

			// Concatenating the String
			System.out.println("10"+"20");

		}

	}
