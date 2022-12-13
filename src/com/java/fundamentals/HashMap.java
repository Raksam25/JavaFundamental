package com.java.fundamentals;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  This java program is used to explain HashMap
| Date     :  12-Dec-2022
 =============================================================================*/

/*
  Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique.
  HashMap class is found in the java.util package.
  Denoted as HashMap<K,V>, where K stands for key and V for value.

 */

import java.util.*; 

public class HashMap {

public static void main(String[] args) {
		
		HashMapOn<Integer, String> map = new HashMapOn<Integer,String>();
		map.put(1, "Vinoth");
		map.put(2, "Anand");
		map.put(3, "Pranav");
		map.put(2, "Anand");
		System.out.println(map);
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() +"," + m.getValue());
		}

		// Removing the values
		map.remove(2);
		System.out.println(map);
		
		map.remove(1, "Vinoth");
		System.out.println(map);
		
		map.replace(3, "Arun");
		System.out.println(map);
		
		//HashMap<String, String> map2 = new HashMap<String,String>();
		
		
		
	}
}
