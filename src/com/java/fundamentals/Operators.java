package com.java.fundamentals;


/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Operators
| Date     :  04-Dec-2022
 =============================================================================*/
 


public class Operators {

	public static void main(String[] args) {
		
		//  Operators are used to perform operations on variables and values.
		 
		// 1. Assignment Operator: used to assign values to variables
		int num1 = 50;
		int num2 = 60;
		int num3 = 70;
		
		// 2. Arithmetic Operator
		
		// Addition
		//System.out.println(10 + 20 );
		System.out.println(num1 + num2);
		
		// Subtraction
		System.out.println(num2 - num1 );
		
		// Multiplication
		System.out.println(num1 * num3);
		
		// Division
		System.out.println(num3/num1);
		
		// Remainder % 
		System.out.println(10%3);
		
		System.out.println("******************");
		
		
		// 3. Assignment operator with Arithmetic operator.
		// Addition assignment operator (+=).
		int num = 10;
		num += 5;                       // same as num = num + 5
		System.out.println(num);
		
		// Subtraction assignment operator (-=).
		num -= 5;                       // same as num = num - 5
		System.out.println(num);        
		
		// Multiplication assignment operator (*=).
		num *= 5;                       // same as num = num * 5
		System.out.println(num);         
		
		// Division assignment operator (/=).
		num /= 5;                        // same as num = num / 5
		System.out.println(num);     
		
		// Modulus assignment operator (%=).
		num %= 5;                         // same as num = num % 5
		System.out.println(num);
		
		// 4. Equality and relational operators (==, >, <, >=, <=, !=)
		//    Return value of a relational operators is either true or false.
		
		int num4 = 500;
		int num5 = 700;
		int num6 = 500;			
					
		System.out.println(num4 == num6);
		System.out.println(num4 >= num5);
		System.out.println(num4 <= num5);
		System.out.println(num5 != num6);
		System.out.println("******************");
		
		// 5. Conditional Operator
		//    Use to test for true or false values with logical operators.
		
		// And - &&		
		System.out.println(num4==num6 && num4<=num6 && num5>=num6);
		System.out.println(num4==num6 && num4>num5);
		System.out.println("******************");
		
		// OR - ||
		System.out.println(num4==num6 || num4<=num6);
		System.out.println(num4==num6 || num4>num5);
		System.out.println(num4>num6 || num4>num5);	
				
	}
}
