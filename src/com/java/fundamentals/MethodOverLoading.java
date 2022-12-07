package com.java.fundamentals;


/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Method Overloading
| Date     :  04-Nov-2022
=============================================================================*/
public class MethodOverLoading {

	// 1. By changing the number of arguments
	public static int multiply(int a , int b){
		int result = a * b;
		return result;		
	}

	public static int multiply(int a , int b , int c) {
		int result = a * b * c;
		return result;
	}

	// 2 By changing the data type of the method
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

