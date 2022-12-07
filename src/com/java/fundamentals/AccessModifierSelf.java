package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Access Modifier
| Date     :  04-Nov-2022
 =============================================================================*/

public class AccessModifierSelf {


	// Public - Access to all of them 
	public void bankName() {
		System.out.println("Having Account in HDFC Bank");
	}
	
	// Protected - Access within package and outside package using inheritance
	protected void loanDetails() {
		System.out.println("50 Lakhs Home Loan in HDFC Bank");
	}
	
	// Default - Access to only within the package 
    void atmPassword() {
		System.out.println("1234 is ATM password");
	}
	
	// Private - Access only within the class
	private void internetBanking() {
		System.out.println("xyz is is internet banking password");
	}	

	public static void main(String[] args) {
		 
		AccessModifierSelf obj = new AccessModifierSelf();
		obj.internetBanking();
		obj.atmPassword();
		obj.loanDetails();
		obj.bankName();

	}
}
