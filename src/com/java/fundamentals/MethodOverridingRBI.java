package com.java.fundamentals;


/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Method Overriding
| Date     :  04-Nov-2022
=============================================================================*/
// Parent Class
public class MethodOverridingRBI {

	float interest = 6.70f;
	public float getHomeLoan(float interest) {
		System.out.println("Home Loan Interest = "+ interest);
		System.out.println("RBI Class(parent) is executed");
		return interest;
	}
}
