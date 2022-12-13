package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Abstract
| Date     :  10-Dec-2022
 =============================================================================*/
// 1. An abstract class must be declared with an abstract keyword.
// 2. All the methods declared as abstract in the parent class.
// 3. Non Abstract method can also be used in Abstract class. 

 
public abstract class AbstractBankAtmScreen {
	abstract void deposit();

	abstract void withdrawal();

	abstract void balance();

	abstract void pinChange();

	abstract void mobileRegistration();		

	void minimumStatement() {
		System.out.println("Minimum Statement Method is displayed");
	}
}
