package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain HashSet
| Date     :  12-Dec-2022
 =============================================================================*/

/*
 Java HashSet class is used to create a collection that uses a hash table for storage. 
 HashSet contains unique elements only.
 HashSet allows null value. 
 
 */

import java.util.*; 

public class HashSet {

	public static void main(String[] args) {

		HashSet<String> employee = new HashSet<String>();		
		employee.add("Vinoth");
		employee.add("Anand");
		employee.add("Pranav");
		employee.add("Raghul");
		employee.add("Anand");

		System.out.println(employee);

		for(String name:employee) {
			System.out.println("Name of the employee "+ name);
		}

		employee.remove("Vinoth");
		System.out.println(employee);

	}
}


