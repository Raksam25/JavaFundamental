package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain ArrayList
| Date     :  12-Dec-2022
 =============================================================================*/

/*
 Java ArrayList class uses a dynamic array for storing the elements.  
 It is like an array, but there is no size limit.
 The ArrayList in Java can have the duplicate elements also. 
 The ArrayList maintains the insertion order internally.
 We can not create an array list of the primitive types, such as int, float, char, etc. 
                        It is required to use the required wrapper class in such cases. 
                        
                        ArrayList<int> al = ArrayList<int>(); // does not work  
                        ArrayList<Integer> al = new ArrayList<Integer>(); // works fine    
                
 
 */

import java.util.*; ;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> employee = new ArrayList<String>();
		employee.add("Vinoth");
		employee.add("Anand");
		employee.add("Pranav");
		employee.add("Raghul");
		employee.add("Anand");

		System.out.println(employee);

		for(String name:employee) {
			System.out.println("The name of the employee is "+ name);
		}

		System.out.println("*****************************************");

		System.out.println(employee.get(3));

		employee.set(3, "Vignesh");

		System.out.println(employee);


		System.out.println("*****************SORT************************");

		Collections.sort(employee);

		for(String name:employee) {
			System.out.println("After sorting "+ name);
		}

		System.out.println("*****************Remove************************");


		employee.remove("Vignesh");
		System.out.println(employee);

		employee.remove(2);
		System.out.println(employee);

		employee.removeAll(employee);
		System.out.println(employee);


	}

}

