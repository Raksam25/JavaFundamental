package com.java.fundamentals;


/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Static Variable
| Date     :  04-Dec-2022
 =============================================================================*/

/*
 * 1. Declaration : Inside the class and outside the method
 * 2. Single copy will be created at the class level.
 * 3. It will be declared using static keyword
 * 4. It is also called as Class Level Variables
 * 5. If the value is not declared for int - default value = 0
 * 6. If the value is not declared for String - default value = Null
 * 7. No need to create the object instance
 */

public class VariableStatic {

	// Employer Details - Instance Variables 
	String empNameOne = "Pranav";
	int empIDOne = 234567;
	float empSalaryOne = (float) 10000000.50;
	int empMobileNumOne ;
	String empAddressOne; 
		
	String empNameTwo= "Vinoth";
	int empIDTwo = 233124;
	float empSalaryTwo = (float) 10000000.75;
		
	// Static Variable
	static String companyName = "Google";
	static int companyRegNum= 2323232;
					
	public static void main(String[] args) {
		
		// Creating the instance of object
		// ClassName objectName = new ClassName Constructor
		VariableStatic empOne = new VariableStatic();
		System.out.println("Employee Name is "+ empOne.empNameOne);
		System.out.println("Employee ID is "+ empOne.empIDOne);
		System.out.println("Employee Salary is "+ empOne.empSalaryOne);
		System.out.println("Employee Mobile Number is "+ empOne.empMobileNumOne);
		System.out.println("Employee Address is "+ empOne.empAddressOne);	
		System.out.println("*****************************");
	
		// Calling the static variable
		System.out.println("**Displaying Static Variables Values");
		System.out.println("The Company name is "+ companyName);
		System.out.println("The Company ID is "+ companyRegNum);

	}

}
