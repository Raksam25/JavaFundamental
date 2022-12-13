package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Method Overriding
| Date     :  10-Dec-2022
=============================================================================*/

// Child Class - Method Overriding 

public class MethodOverridingHDFC  extends MethodOverridingRBI {	

	public float getHomeLoan(float interest) {
		System.out.println("Home Loan Interest = "+ interest);
		System.out.println("HDFC Class(Child) is executed");
		return interest;
	}

	public static void main(String[] args) {		
		MethodOverridingHDFC obj = new MethodOverridingHDFC();
		obj.getHomeLoan(7.10f);

	}

}
