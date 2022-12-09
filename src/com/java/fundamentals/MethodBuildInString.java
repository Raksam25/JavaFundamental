package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain Built In String Method.
| Date     :  04-Nov-2022
=============================================================================*/

/*
  The ASCII characters can be divided as:

Control Characters (0–31 & 127): Control characters are not printable characters. 
        They are used to send commands to the PC or the printer and are based on telex technology.
        Today, they are mostly out of use.
Special Characters(32–47 /58–64 /91–96 /123–126): Special characters include all printable characters that are neither letters nor numbers. 
        These include punctuation or technical, mathematical characters.
        ASCII also includes the space (a non-visible but printable character).
Numbers (30–39): These numbers include the ten Arabic numerals from 0-9.
Letters(65–90 / 97–122): Letters are divided into two blocks:
                         Upper Case - A to Z ( 65 to 90)
                         Lower Case - a to z ( 97 to 122)
 */

public class MethodBuildInString {

	public static void main(String[] args) {
		// String in Java is an object, which contain methods that can perform certain operations on strings.
		// String variable contains a collection of characters surrounded by double quotes.

		// Creating String / Declaration.
		String msg = "Welcome To The World of Automation Training";

		// 1. length()  - which returns the number of characters contained in the string object.
		System.out.println(msg.length());

		// 2. toLowerCase() - Converts all of the characters in this String to lower case.
		System.out.println(msg.toLowerCase());	

		// 3. toUpperCase() - Converts all of the characters in this String to Upper case.
		System.out.println(msg.toUpperCase());	

		// 4. trim() - Returns a copy of the string, with leading and trailing whitespace omitted.
		String emailID = "  abc@noemail.com ";
		System.out.println(emailID);	
		System.out.println(emailID.trim());			

		System.out.println("*********************************");

		//Declaration
		String val1 = "Rakesh ";
		String val2 = "Samant ";
		String val3 = "Male ";


		// 5. concat() - This returns a new string by combining both the strings(String 2 added to it at the end)
		System.out.println(val1 + val3 + val2);
		System.out.println(val1.concat(val3).concat(val2));
		System.out.println("Welcome "+ val1);

		System.out.println("*********************************");

		/*		 
		 * ANSI
		 * A to Z ( 65 to 90)
		 * a to z ( 97 to 122)
		 * 	  
		 */

		// String Comparison
		// Two way comparison - True / False	
		// 6. equals() - This method returns true if the String are equal; false otherwise.

		String val4 = "vikash";
		String val5 = "Vikash";

		System.out.println(val4 == val5);
		System.out.println(val4.equals(val5));		
		System.out.println(val4.equalsIgnoreCase(val5));

		// Three Way Comparison
		// 7. compareTo() - It compares the given string with current string index based(order). It returns positive number, negative number or 0
		/*
		 * String 1 = String 2 -> 0
		 * String 1 > String 2 -> +ve value
		 * String 1 < String 2 -> -ve value
		 * 
		 */

		String val6 = "arun";
		String val7 = "Arun";

		System.out.println(val6.compareTo(val7));
		System.out.println(val7.compareTo(val6));
		System.out.println(val6.compareToIgnoreCase(val7));

		System.out.println("*********************************");

		// 8. charAt() - Return the character of the mentioned index value.	
		System.out.println(msg.charAt(5));

		// 9. indexOf()  - Returns the index of the specified character.
		System.out.println(msg.indexOf('a'));
		System.out.println(msg.indexOf('t'));
		System.out.println(msg.indexOf('T',8));

		// 10. contains() - Return true if the string contains specific characters
		System.out.println(msg.contains("World"));

		// 11. substring() - It returns a part of the string. 
		String transaction = "Transaction of message is 1234-5432-6788";
		System.out.println(transaction.substring(15));
		System.out.println(transaction.substring(15,21));	
		System.out.println(transaction.substring(25));

		System.out.println("*********************************");

		// 12. replace() - A string replacing all the old character/word
		String wcmsg = "Welcome to HDFC BANK";
		String updateMsg = wcmsg.replace("HDFC", "SBI");
		System.out.println(updateMsg);

		String updateChar = updateMsg.replace('t', 'T');
		System.out.println(updateChar);

		System.out.println("*********************************");

		// 13 . Handling Special Characters
		// Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
		String text = "Welcome to \"Selenium Online Class\"";
		System.out.println(text);

		// 14. startsWith() Checks whether a string starts with specified characters
		String str = "This World is Amazing";
		System.out.println(str.startsWith("Thi"));

		// 15. endsWith() Checks whether a string ends with the specified character(s)
		System.out.println(str.endsWith("ing"));

		// 16. Split() Splits a string into an array of substrings
		String []s6 = str.split(" ",6);
		for (String s5:s6) {
			System.out.println(s5);
		}

	}

}
