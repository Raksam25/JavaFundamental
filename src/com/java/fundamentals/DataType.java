package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Data Type
| Date     :  04-Dec-2022
 =============================================================================*/
 
 
          /* 
             Data types are divided into two groups:

             Primitive data types - includes byte, short, int, long, float, double, boolean and char
             Non-primitive data types - such as String, Arrays and Classes
			 
			 Primitive data types: specifies the size and type of variable values, and it has no additional methods.
			                       Primitive types are predefined (already defined) in Java.
								   Primitive types cannot call methods.
								   A primitive type has always a value.
								   The size of a primitive type depends on the data type.
								   A primitive type starts with a lowercase letter.
			 
                 Data Type: byte	
                 Size: 1 byte	
                 Description: Stores whole numbers from -128 to 127

                 Data Type: short
                 Size: 2 bytes	
                 Description: Stores whole numbers from -32,768 to 32,767

                 Data Type: int	
                 Size: 4 bytes	
                 Description: Stores whole numbers from -2,147,483,648 to 2,147,483,647

                 Data Type: long	
                 Size: 8 bytes	
                 Description: Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

                 Data Type: float	
                 Size: 4 bytes
                 Description: Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits

                 Data Type: double	
                 Size: 8 bytes	
                 Description: Stores fractional numbers. Sufficient for storing 15 decimal digits

                 Data Type: boolean	
                 Size: 1 bit	
                 Description: Stores true or false values
 
                 Data Type: char  
			     Size: 2 bit
			     Description: Stores a single character/letter or ASCII values.
			                  The character must be surrounded by single quotes, like 'A' or 'c'
						 
			Non-primitive data types- Non-primitive data types are called reference types because they refer to objects.
                                      Non-primitive types are created by the programmer and is not defined by Java (except for String).	
                                      Non-primitive types can be used to call methods to perform certain operations.		
                                      Non-primitive types has value and can be null	also.
                                      Non-primitive types starts with an uppercase letter.	
                                      Non-primitive types have all the same size.									  
						 
			     Data Type:  String
			     Description: used to store a sequence of characters (text)
			                  String values must be surrounded by double quotes.

			
            */
			
			
 

public class DataType {

	public static void main(String[] args) {

		// byte data type
		byte month = 12;
		System.out.println("Byte data type value is " + month);
		
		// short data type
		short quantity = 1000;
		System.out.println("Short data type value is "+ quantity);
		
		// integer date type
		int empNumber = 12345;
		System.out.println("Integer data type value is "+ empNumber);
		
		// long data type - 'l' needs to be added to the number
		long profit = 12323435465767l;
		System.out.println("Long data type value is "+ profit);
		
		// float data type - type case float 
		float pieValue = (float) 3.142548946266548666;
		System.out.println("Float data type value is "+ pieValue);
		
		// float data type - 'f' needs to be added to the number
		float pieValue2 = 3.142548946266548666f;
		System.out.println("Float data type value is "+ pieValue2);
		
		// double data type 
		double pieValue3 = 3.142548946266548666;
		System.out.println("Double data type value is "+ pieValue3);
		
		// boolean data type 
		boolean status = true;
		System.out.println("Boolean data type value is "+ status);
		
		// character data type
		char initial = 'V';
		System.out.println("Character data type value is "+ initial);
		
		// String data type - S in capitals
		String firstName = "Vinoth";
		System.out.println("String data type value is "+ firstName);
				
				
				
				
		/* Java Type Casting: is used to assign a value of one primitive data type to another (e.g int to float and vice-versa).
           Two types of casting:
			  Widening Casting - automatically system onverts a smaller date type to a larger date type size.
                                  byte -> short -> char -> int -> long -> float -> double.
			  Narrowing Casting - manually converting a larger type to a smaller size type  by placing the type in parentheses in front of the value.
                                  double -> float -> long -> int -> char -> short -> byte.							   
		
		*/		
		
		
		int numOn = 19;
        double numTw = numOn;      // Compiler automatically casting: int to double
		
		System.out.println(numOn);   
        System.out.println(numTw); 
		 
		 
		double numThr = 19.7876d;
        int numFr = (int) numThr; // Manually casting: double to int by using type within parentheses

        System.out.println(numThr);   
        System.out.println(numFr);    
				
	}

}
