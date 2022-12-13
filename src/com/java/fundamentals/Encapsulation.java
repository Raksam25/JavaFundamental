package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Encaptulation
| Date     :  10-Dec-2022
 =============================================================================*/

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationExample obj = new EncapsulationExample();
		obj.fname = "Rakesh";
		obj.getEmpNum();
		obj.setName("Vinoth");
		obj.setEmpNum(123544);
		obj.setAge(32);
		obj.setMobNum(968545756);

		System.out.println((obj.getName()));
		System.out.println((obj.getEmpNum()));
		System.out.println((obj.getAge()));
		System.out.println((obj.getMobNum()));
	}

}
