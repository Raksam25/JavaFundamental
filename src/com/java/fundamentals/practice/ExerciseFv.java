package com.java.fundamentals.practice;

import java.util.Scanner;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  Practice Exercise
| Date     :  12-Dec-2022
=============================================================================*/

//   Print different pattern based on user input.

public class ExerciseFv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//-----------------------------------------------------------------------------------------------------        
        
        for (int i=1; i<=n; i++ ){
            for (int j=1; j<=i; j++){
                System.out.print(j);
                if(j<i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("********************************************************************");
//-----------------------------------------------------------------------------------------------------
        
        for (int i=n; i>0; i-- ){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("********************************************************************");
//-----------------------------------------------------------------------------------------------------
        
        for (int i=1; i<=n; i++ ){
            System.out.print("*");
            for (int j=1; j<=n-2; j++){
                System.out.print(" ");
                }
                System.out.print("*");
            System.out.println();
        } 
        System.out.println("********************************************************************");
//-----------------------------------------------------------------------------------------------------
        
        for (int i=0; i<n; i++ ){
            System.out.print("*");
        }
         System.out.println();
         for (int j=0; j<n-1; j++){
             for(int k=0; k<=j; k++){
                 System.out.print(" ");
             }
             for (int a=j; a<n-1; a++){
                 System.out.print("*");
             }
             System.out.println();
         }
         System.out.println("********************************************************************");
//-----------------------------------------------------------------------------------------------------
         
         for (int i=0; i<2*n; i++ ){
             System.out.print("*");
        }     
             System.out.println();
             
            for(int j=1; j<=n-1;j++){
                for(int b=0; b<n-j;b++){
                  System.out.print("*");
                }
               for(int z=0; z<2*j;z++){
                 System.out.print(" ");
                }
               for(int k=0; k<n-j;k++){
                 System.out.print("*");
                }
               System.out.println();
            }
        
	}

}
