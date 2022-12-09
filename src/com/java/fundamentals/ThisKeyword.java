package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain comments
| Date     :  04-Nov-2022
 =============================================================================*/

public class ThisKeyword {

	// Instance Variable 
		String empName ="Rakesh";
		int empID = 12345;
		
		// Execute the below constructor with and without this keyword
		ThisKeyword(String empName, int empID){
			empName = empName;
			empID = empID;
			//this.empName = empName;
			//this.empID = empID;
		}
		
		void display() {
			System.out.println(empName + " - " + empID);
		}
			
		
		public static void main(String[] args) {
			ThisKeyword obj = new ThisKeyword("Pranav",54321);
			obj.display();

		}

}
