package com.java.fundamentals;


/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain If Statement
| Date     :  04-Nov-2022
 =============================================================================*/
 
import java.util.Scanner;

     /* Syntax:
       IF Statement
       if (condition) {
          block of code to be executed if the condition is true
        }

       IF - ELSE Statement
       if (condition) {
          block of code to be executed if the condition is true
        } else {
          block of code to be executed if the condition is false
        }
  
       IF - ELSE -IF Statement
       if (condition1) {
         block of code to be executed if condition1 is true
        } else if (condition2) {
         block of code to be executed if the condition1 is false and condition2 is true
        } else {
         block of code to be executed if the condition1 is false and condition2 is false
        }

      */

public class StatementIf {

	public static void main(String[] args) {

		// Create a Scanner object	   
		Scanner scn = new Scanner(System.in);

		// Enter Age 
		System.out.println("Enter the Age");
		int age = scn.nextInt();

		// if and else statement
		// Program to verify the Candidate is eligible to Vote or not
		
		if(age >= 18) {
			System.out.println(age+ " is eligible to Vote"); 
		} 
		else 
		{ 
			System.out.println(age+ " is not eligible to Vote"); 
		}


		// if else if.. statement
		// Program to validate students marks		  
		// Enter the marks
		System.out.println("Enter the marks");
		int marks = scn.nextInt();

		if(marks == 35) {
			System.out.println(marks + " is just pass marks");
		}
		else if ((marks>35) && (marks<90)) {
			System.out.println(marks + " is Good marks");
		}
		else if (marks>=90) {
			System.out.println(marks + " is merit marks");
		}
		else
		{
			System.out.println(marks + "is Fail marks");
		}


		// Nested If statement
		// Program to find largest of 3 numbers
		int num1 = 900;
		int num2 = 200;
		int num3 = 300;
		int largestNumber;

		if(num1>= num2) {
			if(num1 >= num3) {
				largestNumber = num1;
			}
			else {
				largestNumber = num3;
			}		
		}
		else
		{
			if(num2 >= num3)			{
				largestNumber = num2;
			}
			else
			{
				largestNumber = num3;
			}
		}		
		System.out.println("Largest Number is "+ largestNumber);		
	}		

}
