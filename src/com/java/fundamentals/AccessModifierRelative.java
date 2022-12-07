package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Access Modifier
| Date     :  04-Nov-2022
 =============================================================================*/

public class AccessModifierRelative extends AccessModifierSelf {
	
	//Uncomment the below lines and learn the scope. 

	public static void main(String[] args) {

		// Outside the package - Sub class only - Inheritance 
		// Here we have to create object for the present class
		AccessModifierRelative obj = new AccessModifierRelative();
		//obj.internetBanking();
		//obj.atmPassword();
		obj.loanDetails();
		obj.bankName();		

		}

}
