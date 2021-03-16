package com.pbg.RECURSION;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Integer n = -1;
		
		while(n != 0) {
			System.out.println("\n\nWelcome to Factorial Program (Recursion) \n Enter 0 to exit");
			System.out.println("\nEnter the number(n) to calculate its factorial :: ");
			n = scan.nextInt();
			
			Integer result = factorial(n);

			Integer result_itr = fact_iterative(n);
			
			System.out.println("Factorial of " + n + " is = " + result + " " +result_itr);
		}
		
	}

	private static Integer factorial(Integer n) {
		// Recursively calculate the Factorial of n
		
		if( n == 0) return 1;
		else
			return n * factorial(n-1);
	}
	
	private static Integer fact_iterative(Integer n) {
		Integer result = 1;
		
		for(int i = 1; i <= n; i++) {
			result = result * i ;
			
		}
		
		return result;
		
	}

}
