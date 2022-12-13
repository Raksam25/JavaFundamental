package com.java.fundamentals;

/*
 Hashtable class implements a hashtable, which maps keys to values.
 Hashtable is an array of a list. Each list is known as a bucket. 
 The position of the bucket is identified by calling the hashcode() method.
 Hashtable contains values based on the key.
 Hashtable class contains unique elements.
 Hashtable class doesn't allow null key or value.
 */

import java.util.*; 

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
	}

}
