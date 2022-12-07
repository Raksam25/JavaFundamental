package com.java.fundamentals;


/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain For loop
| Date     :  04-Nov-2022
 =============================================================================*/

/*
Syntax:
 for (statement 1; statement 2; statement 3) {
      code block to be executed
  }
  
Statement 1 is executed (one time) before the execution of the code block.
Statement 2 defines the condition for executing the code block.
Statement 3 is executed (every time) after the code block has been executed.

In Nexted For Loop, "inner loop" will be executed one time for each iteration of the "outer loop".

For-Each Loop: Syntax
for (type variableName : arrayName) {
     code block to be executed
      }
	  	 
*/

public class LoopFor {

	public static void main(String[] args) {

		// Program to print 1 to 10 using for loop
		// for(initialization;condition;increment/decrement)
		for(int num=1; num<=10; num++) {
			System.out.println(num);
		}

		// Assignment - Print the number from 10 to 1

		// Nested For Loop
		outerloop:
			for(int i=1; i<=5; i++) {
				for(int j=1;j<=5;j++) {
					System.out.println(i +","+ j);
					if((j==4)) {
						break outerloop;
					}
				}
			} 

         
		// For-Each loop
           String[] str = {"Rakesh", "Rahul", "Ayush", "Rajesh"};
               for (String i : str) {
                System.out.println(i);
               }
				/*Above For-Each loop is same as shown below.
				for (int j=0; j<4; j++) {
			     System.out.println(str[j]);
		         }
		         */
				
                			 
	}

}
