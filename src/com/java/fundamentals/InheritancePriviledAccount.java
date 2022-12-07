package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain MultiLevel Inheritance
| Date     :  04-Nov-2022
=============================================================================*/

public final class InheritancePriviledAccount extends InheritenceSavingAccount{

	public void creditCard(int accNum) {
		System.out.println("Credit card dispatched to the customer" + accNum );
		System.out.println("Priviled Account Class is executed");
	}

	public static void main(String[] args) {

		InheritancePriviledAccount PersonTwo = new InheritancePriviledAccount();
		PersonTwo.deposit();
		PersonTwo.withdrawal();
		PersonTwo.viewSummary(54311);
		PersonTwo.creditCard(54311);		

	}

}