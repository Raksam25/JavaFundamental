package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Variable Naming
| Date     :  04-Nov-2022
 =============================================================================*/

public class VariableNaming {

	public static void main(String[] args) {

	  /* All Java variables are identified with unique names.
         These unique names of variable is called identifiers, which short names (x, y) or more descriptive names (age, sum)
	  
	     1. A variable name can consist of Capital letters A-Z, lowercase letters a-z, digits 0-9,
            and two special characters such as underscore(_) and dollar($).
         2. Variable name must begin with a letter. 
         3. Variable names are case-sensitive. "EMPLOYEE" and "employee" are different variables 
	        e.g:  int employee;
		          int EMPLOYEE;
	     4. Variable name cannot begin with number.
		    e.g:  int 4salary; 
		 5. Blank spaces cannot be used in variable names.
            e.g:  String first name;
		 6. Java keywords cannot be used as variable names.
		    e.g:  int if;
		          float while;
		 7. If we assign new value to an existing variable, it will overwrite the previous value.		  
		 8. Final Variable: 
		          final keyword: if we declare the variable as "final" or "constant" than it cannot be changed and became read-only.
		*/

		// Syntax : datatype variablename = value;
		
		// Use lower Camel Case for naming variables.
		// Avoid using special character ( _ or $).

	
		String firstName = "Rakesh";
		String lastName = "Samant";
		String gender = "Male";
		String streetAddress = "Delhi";		
		byte age = 28;
		short experience = 7;
		long mobileNumber = 12345678912L;
		
		// To declare multiple variable of the same type on one line, we can use a comma-separated list.
		// We can also initiate multiple variables in one line.
		int x, y, z;
		x=y=z=10;
		
		System.out.println(x+y+z);
		System.out.println("***************************************");
		
		// To combine both text and a variable, we use + character.
		// + character is also used to add one variable to another and if both variable contains numeric values than it will do addition.
		
		System.out.println("Name:" + firstName + " " + lastName);
		System.out.println("Gender:" + gender);
		System.out.println("Age:" + age);
		System.out.println("Experience :" + experience);
		System.out.println("Contact Number:" + mobileNumber);
		System.out.println("Address:" + streetAddress);
		
	}

}
