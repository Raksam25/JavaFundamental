package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Single level and Hierarchical Inheritance
| Date     :  04-Nov-2022
=============================================================================*/

public class InheritanceCurrentAccount extends InheritanceAccount {

	public float getRateOfInterest(float interest) {
		System.out.println("Rate of Interest ="+ interest);
		System.out.println("Current Class is executed");
		return interest;
	}
	
	public int getRate(int x) {
		System.out.println("Rate of Interest ="+ x);
		System.out.println("Current Class is executed");
		return x;
	}
	

	public static void main(String[] args) {

		InheritanceCurrentAccount personThree = new InheritanceCurrentAccount();
		personThree.deposit();
		personThree.withdrawal();
		personThree.getRateOfInterest(10.5f);
		personThree.withdr();
		personThree.with();

	}

}

