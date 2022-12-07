package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain This Keyword
| Date     :  04-Nov-2022
 =============================================================================*/

/*
  You may invoke the method of the current class by using the this keyword. 
  If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
*/

public class ThisKeywordMethod {

	void show() {
		System.out.println("Show method is excuted");
	}	
	
	// Execute the below method without this keyword
	void display() {		
		this.show();
		System.out.println("Display method is executed");
	}
		
	public static void main(String[] args) {
		ThisKeywordMethod obj = new ThisKeywordMethod();
		obj.display();

	}
}
