package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Break and Continue.
| Date     :  04-Dec-2022
 =============================================================================*/
 

public class StatementBreakConitnue {

	public static void main(String[] args) {
		
		// Break Statement
		/*
		break statement is used to "jump out" of a switch statement.
		break statement can also be used to jump out of a loop.
		*/
	    for(int num=1; num<=10; num++) {
	    	if(num==5) {
	    		break;
	    	}
	    	System.out.println(num);
	    }	
	    
	    System.out.println("*****Continue****");
	    
	    /* It will skip the current iteration and 
	     * will not execute the codes below the continue*/
	    for(int num=1; num<=10; num++) {
	    	if(num==5) {
	    		continue;
	    	}
	    	System.out.println(num);
	    }	     

	}

}
