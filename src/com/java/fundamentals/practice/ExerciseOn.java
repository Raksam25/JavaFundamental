package com.java.fundamentals.practice;

import java.util.Arrays;
import java.util.Scanner;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  Find the missing number in an array.
| Date     :  12-Nov-2022
 =============================================================================*/

/*
   sort a string of characters given in lower case.      
 */

public class ExerciseOn {
	
	static void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(String.valueOf(arr));
    }
	
	static void descOrder(char[] s2)
    {
        Arrays.sort(s2);
        reverse(s2);
    }
 
    static void reverse(char[] a)
    {
        int i, n = a.length;
        char t;
        for (i = 0; i < n / 2; i++)
        {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "amazingworld";
        sortString(s1);
        
        // Shorting the string in descending order
        char[] s2 = "amazingworld".toCharArray();
        descOrder(s2); // function call
        System.out.println(String.valueOf(s2));
	}

}
