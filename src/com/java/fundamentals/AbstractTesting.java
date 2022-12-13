package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Abstract
| Date     :  10-Dec-2022
 =============================================================================*/

public class AbstractTesting {
	
public static void main(String[] args) {
		
		/*
		 * Object needs to be created for each bank for the same user.
		 * Following below way is not possible. 
		 * 
		 */
		// BankAtmScreen obj = new RBIBank();
		// BankAtmScreen obj = new HDFCBank();
		
		// Alternative Way to improve above code
		
	AbstractBankAtmScreen obj;
		
		// Creating object instance for RBI Bank
		obj = new AbstractRBIBank();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();
		
		System.out.println("************************");
		
		// Creating object instance for HDFC Bank
		obj = new AbstractHDFCBank();
		obj.pinChange();
		obj.mobileRegistration();
		obj.minimumStatement();	
		


	}

}
