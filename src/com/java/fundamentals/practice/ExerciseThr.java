package com.java.fundamentals.practice;

import java.util.Scanner;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  Practice Exercise.
| Date     :  12-Nov-2022
 =============================================================================*/

/*
   Write a program to:
   print reverses of the input array A and size N.  
 */

public class ExerciseThr {
	
	 static void reverse(int a[], int n)
	    {
	        int i ,j , k;
	        for (i = 0; i < n / 2; i++) {
	            j = a[i];
	            a[i] = a[n - i - 1];
	            a[n - i - 1] = j;
	        }
	  
	        // printing the reversed array
	        System.out.println("Reversed array is:");
	        for (k = 0; k < n; k++) {
	            System.out.println(a[k]);
	        }
	    }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[]= new int[n];

		// Capturing Input array
		for(int i=0; i<n; i++){
		arr[i] = scn.nextInt();
		}
		
		reverse(arr,n);
	}

}
