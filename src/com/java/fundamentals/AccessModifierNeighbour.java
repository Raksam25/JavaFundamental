package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Access Modifier
| Date     :  04-Dec-2022
 =============================================================================*/

public class AccessModifierNeighbour {

	// Uncomment the below lines and learn the scope. 

	public static void main(String[] args) {

		// Outside the package
		AccessModifierSelf obj = new AccessModifierSelf();
		//obj.internetBanking();
		//obj.atmPassword();
		//obj.loanDetails();
		obj.bankName();	

		}

}
