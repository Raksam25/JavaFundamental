package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Method Overloading
| Date     :  04-Nov-2022
=============================================================================*/

/*
  -Recursion is a process of making a function call itself. 
   This provides a way to break complicated problems down into simple problems which are easier to solve 
 */

public class Recursion {

	// Creating recursive method to return sum of range of number.
	public static int sum(int n) {
	    if (n > 0) {
	      return n + sum(n - 1);
	    } else {
	      return 0;
	    }
	  }
	
	// Recursive addition of range function/ Method
	public static int sum(int a, int b) {
	    if (b > a) {
	      return b + sum(a, b - 1);
	    } else {
	      return b;
	    }
	  }
	
	// Recursive factorial function/ Method
	int factorial(int n) {
		int result;
		if (n==1) return 1;
		result = factorial(n-1) *n ;
		return result;
	}
	
	/*
	 // Iterative equivalence of recursive function method
	  int factorial (int n) {
	  int result;
	  
	  result = 1;
	  for (int i =1; i<=n; i++){
	  result *=i;
	  }
	  return result;  
	  }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int resultOn = sum(15);
	    System.out.println("Sum of the range of number is : " + resultOn);
	    
	    int resultTw = sum(5, 10);
	    System.out.println("Sum of the range of number is : " + resultTw);
	    
	    Recursion rec = new Recursion();
	    System.out.println("Factorial of the number is : " + rec.factorial(5));
	}

}
