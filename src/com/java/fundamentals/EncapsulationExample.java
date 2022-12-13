package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Encapsulation
| Date     :  10-Dec-2022
 =============================================================================*/

public class EncapsulationExample {

	// Declaring the variable as private  
		private String name;
		private int empNum;
		private int age;
		private int mobNum;
		
		 String fname;
		
		// Using the set method
		public void setName(String newName) {
			name = newName;
		}
		
		public void setEmpNum(int newNum) {
			empNum = newNum;
		}
		
		public void setAge(int newAge) {
			age = newAge;
		}
		
		public void setMobNum(int newMobNum) {
			mobNum = newMobNum;
		}
		
		// Using get method
		public String getName() {
			return name;
		}	
		
		public int getEmpNum() {
			return empNum;
		}
		
		public int getAge() {
			return age;
		}
		
		public int getMobNum() {
			return mobNum;
	}

}
