package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Single level and Hierarchical Inheritance
| Date     :  04-Nov-2022
=============================================================================*/

public class InheritenceSavingAccount extends InheritanceAccount{

	public int viewSummary(int accNum) {
		System.out.println("The Account summary is displayed for "+ accNum );
		System.out.println("Saving Account Class is executed");
		return accNum;		
	}

	public static void main(String[] args) {

		InheritenceSavingAccount personOne = new InheritenceSavingAccount();
		personOne.deposit();
		personOne.withdrawal();
		personOne.viewSummary(12345);

	}

}
