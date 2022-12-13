package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Exceptional Handling.
| Date     :  10-Dec-2022
 =============================================================================*/

/*
   An exception is a problem that occurs during the execution of a program. 
   It occurs due to coding errors made by the programmer, errors due to  invalid input, etc..,
   When an exception occurs, program execution will stop and generate an  error message
   To handle such scenario’s we use Java Exception Handling ( try..catch..)
   
   Syntax:
   try {
      Block of code to monitor for error;
      }
   catch (ExceptionType1 e1){
      Handler for ExceptionType1
   }   
   catch (ExceptionType2 e2){
      Handler for ExceptionType2
   } 
   finally {
      final code
      }
      
   try: The "try" keyword is used to specify a block where we should place an exception code. 
        It means we can't use try block alone. The try block must be followed by either catch or finally. 
   catch: The "catch" block is used to handle the exception. 
          It must be preceded by try block which means we can't use catch block alone. 
          It can be followed by finally block later.      
   finally: The "finally" block is used to execute the necessary code of the program. 
            It is executed whether an exception is handled or not.  
   throw: The "throw" keyword is used to throw an exception.         
             
 */

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//System.out.println(10/0);
		
		//  Arithmetic Exception 
		int a = 10;
		int b = 0;
		try 
		{
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont divide number by zero. The error message is"  + e );
		}
		System.out.println("********************************************");
		
		
        //  Null Pointer Exception
		/*
		 * In Java, a special null value can be assigned to an object reference. 
		 * NullPointerException is thrown when program attempts to use an object reference that has the null value.
		 */
	  
		String name = null;		
		try
		{
			if (name.equals("Java")) {
				System.out.println("Strings are same");
			}
			else
			{
				System.out.println("String are not same");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Dont enter the null value. The error message is "+ e);
		}
		System.out.println("********************************************");
		
		
		//  Array Index out of bounds exception
		
		int [] num = new int[4];
		try {
			num[10]= 100;
			System.out.println(num[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Mention the value within the array limit");
			System.out.println("The Error message is "+ e);
		}
		finally {
			// This code will be executed as compulsory 
			System.out.println("Finally Block is executed");
		}
		System.out.println("********************************************");
		
		
		// Using "throw" keyword is used to throw an exception.
		
		int age = 16;

		if(age<18)  {
			throw new ArithmeticException("Not valid age to Vote"); 
		}
		else  
		{
			System.out.println("Valid age to Vote !! ");  
		}
		System.out.println("********************************************");
		
		
		/*
	
		// Number Format Exception
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Read Two Number");
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();					
		try {
			int c = Integer.parseInt(s1);
			int d = Integer.parseInt(s2);
			System.out.println(c+d);
		}
		catch(NumberFormatException e5) {
			System.out.println(e5);
		}
		
		finally {
			// This code will be executed as compulsory 
			System.out.println("Finally Block is executed");
		}
		*/
	}

}
