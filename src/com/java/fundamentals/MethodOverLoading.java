package com.java.fundamentals;


/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Method Overloading
| Date     :  10-Dec-2022
=============================================================================*/

/*
   -Method Overloading : is when a class has multiple methods having same name but different in  parameters.
   -Ways to achieve Method Overloading:
               By changing number of arguments.
               By changing the data type.
   
   -Return type of overloaded method can or cannot be same. 
        But having different return type is not sufficient for method overloading.
        Hence method overloading is not affected by return type.
   -When overloaded method is called, the method whose parameter matched the argument is executed.
   -Method overloading is one of the way java implements polymorphism.
 */


public class MethodOverLoading {

	// By changing the number of arguments
	public static int multiply(int a , int b){
		int result = a * b;
		return result;		
	}
 
	// By changing the number of arguments
	public static int multiply(int a , int b , int c) {
		int result = a * b * c;
		return result;
	}

	// By changing the data type of the method
	public static float multiply(float a, float b){
		float result = a * b;
		return result;		
	}

	public static void main(String[] args) {

		System.out.println(multiply(50 ,20));
		System.out.println(multiply(10 , 50 , 60));
		System.out.println(multiply(7.5f , 10.25f));		
		System.out.println(multiply(10 , 15.50f));		

	}

}

