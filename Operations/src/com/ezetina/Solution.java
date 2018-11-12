package com.ezetina;

import java.util.Scanner;

public class Solution {
   
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        
        solve(meal_cost, tip_percent, tax_percent);

       scanner.close();
        
    }
      
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
    	double tip_p = (double) tip_percent/100;
    	double tip = meal_cost * tip_p;
    	double tax_p = (double) tax_percent/100;
    	double tax = meal_cost * tax_p;
    	int totalCost = (int)Math.round(meal_cost+tip + tax);
    	System.out.println(totalCost);
    	
    }

}
