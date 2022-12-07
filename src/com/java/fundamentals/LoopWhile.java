package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain While Loop.
| Date     :  04-Nov-2022
 =============================================================================*/

/*
Loops can execute a block of code as long as a specified condition is reached.

The while loop loops through a block of code as long as a specified condition is true.
Syntax:
    while (condition) {
    code block to be executed
    }

do/while loop is a variant of the while loop. 
This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
Syntax:
   do {
  code block to be executed
      }
  while (condition);
  

*/

public class LoopWhile {

	public static void main(String[] args) {

		// Program to print 1 to 10
	    int num = 1;
	    System.out.println("****While Output*****");
	    
	    while(num<=10) {
	    	System.out.println(num);
	    	num++; // i = i+1
	    }
	    
	    // Do while 
	    // Even though the input value is invalid, it will be executed once, because the code block is executed before the condition is tested
	    System.out.println("****Do While Output*****");
	    
	    int num2 = 1;
	    do
	    {
	    	System.out.println(num2);
	    	num2++;
	    }while(num2<=10);
          
	}

}
