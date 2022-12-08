package com.java.fundamentals.practice;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  Practice Exercise
| Date     :  12-Nov-2022
=============================================================================*/

/* 
    Count uppercase in a String.
    Count lowercase in a String.
    Count vowel in a String.
 
    Hint:
    check one character at a time on the basis of ASCII values:
    if String >= 65 and String <=90, then it is uppercase letter, 
    if String >= 97 and String <=122, then it is lowercase letter, 
    if String >= 48 and String <=57, then it is number, 
    else it is a special character.
*/


public class ExerciseFr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int upperCnt = 0, lowerCnt = 0, vowelCnt =0;
	      String s1 = "Welcome to the world of automation testing ";

	      for(int i=0; i<s1.length(); i++)
	      {
	          if(s1.charAt(i) >='A' && s1.charAt(i) <= 'Z')
	          {
	        	  upperCnt++;
	          }
	      }
	      System.out.println("Number of upper case in String : " + upperCnt);
//---------------------------------------------------------------------------------------------------	      
	      
	      for(int i=0; i<s1.length(); i++)
	      {
	          if(s1.charAt(i) >='a' && s1.charAt(i) <= 'z')
	          {
	        	  lowerCnt++;
	          }
	      }
	      System.out.println("Number of lower case in String : " + lowerCnt);
//-------------------------------------------------------------------------------------------------
	    
	      for(int i=0; i<s1.length(); i++)
	      {
	          if(s1.charAt(i) =='a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' ||
	        		  s1.charAt(i) == 'u')
	          {
	        	  vowelCnt++;
	          }
	      }
	      System.out.println("Number of vowel in String : " + vowelCnt);
	      
	      
	}

}
