package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Abstract
| Date     :  10-Dec-2022
 =============================================================================*/

public class AbstractRBIBank extends AbstractBankAtmScreen {
	
	@Override
	void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit Method is displayed");		
	}

	@Override
	void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawl Method is displayed");
		
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance Method is displayed");
	}

	@Override
	void pinChange() {
		System.out.println("Pin Change RBI Method is displayed");
		
	}

	@Override
	void mobileRegistration() {
		// TODO Auto-generated method stub
		
	}

}
