package com.ezetina;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int x;
        double y;
        String z;

        /* Read and save an integer, double, and String to your variables.*/
        x = scan.nextInt();
        y = scan.nextDouble();
        scan.nextLine();
        z = scan.nextLine();
        
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+x);

        /* Print the sum of the double variables on a new line. */
        System.out.println("\n" +(d+y));
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println("\n" + (s+z));
        scan.close();

	}

}
