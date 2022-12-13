package com.java.fundamentals.practice;

import java.util.Scanner;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  Practice Exercise on array.
| Date     :  12-Dec-2022
 =============================================================================*/

/*
   Write a program to:
   print maximum elements of the input array A and size N.
   print minimum elements of the input array A and size N.
   find sum of the input array using for-each loop.

 */

public class ExerciseTw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
		//int n = 5;
		int arr[]= { 100, 20 , 30 , 50 ,60};


		// Capturing Input array  a[0], a[1], a [2], a[3], a[4]
		for(int i=1; i<=n; i++){
			arr[i] = scn.nextInt();
		}
		
//-------------------------------------------------------------------------------------------------
		// To find Maximum number in an array
		int max = arr[0];
		for(int i=0; i<n; i++){
			if(max< arr[i]){
				max = arr[i];
			}
		}
		System.out.println("Maximum number in an array is: " + max);
		
//--------------------------------------------------------------------------------------------------
		// To find Minimum number in an array
		int min = arr[0];
		for(int i=0; i<n; i++){
			if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println("Minimum number in an array is: " + min);
		
//-------------------------------------------------------------------------------------------------		
		// To find Sum of number in an array using for-each loop
		 int sum =0;
		 for (int i : arr) {
			 sum = sum + i;
		 }
		 System.out.println("Sum of the number in an array is: " + sum);

	}

}
