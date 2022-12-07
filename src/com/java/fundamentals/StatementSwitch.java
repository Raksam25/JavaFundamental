package com.java.fundamentals;


/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Switch Statement
| Date     :  04-Nov-2022
 =============================================================================*/
 
import java.util.Scanner;

/*
The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
The break and default keywords are optional.
When Java reaches a break keyword, it breaks out of the switch block.This will stop the execution of more code and case testing inside the block.
The default keyword specifies some code to run if there is no case match.
if the default statement is used as the last statement in a switch block, it does not need a break.
*/

public class StatementSwitch {

	public static void main(String[] args) {		
		   
	   // Enter the month in Number 
	   System.out.println("Enter the Month Number");
	   
	// Create a Scanner object	
	   Scanner scn = new Scanner(System.in);
	   int month = scn.nextInt();
	   
	   System.out.println("Number entered is "+ month);
	   
	   switch((month)) {
	   
	   case 1: System.out.println("January Month");
	   break;
	   
	   case 2:  System.out.println("February Month");
	   break;
	   
	   case 3:  System.out.println("March Month");
	   break;
	   
	   case 4:  System.out.println("April Month");
	   break;
	   
	   case 5:  System.out.println("May Month");
	   break;
	   
	   case 6:  System.out.println("June Month");
	   break;
	   
	   case 7:  System.out.println("July Month");
	   break;
	   
	   case 8:  System.out.println("August Month");
	   break;
	   
	   case 9:  System.out.println("September Month");
	   break;
	   
	   case 10:  System.out.println("October Month");
	   break;
	   
	   case 11:  System.out.println("November Month");
	   break;
	   
	   case 12:  System.out.println("December Month");
	   break;     

	   default: System.out.println("Enter a valid Month");	
	   
	   }   		
		
	}

}
