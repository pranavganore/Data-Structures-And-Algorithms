package com.pbg.RECURSION;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {


	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		Integer n = -1;
		
		while(n != 0) {
			System.out.println("\n\nWelcome to Fibonacci Program (Recursion) \n Enter 0 to exit");
			System.out.println("\nEnter the number(n) to calculate its Fibonacci Series :: ");
			n = scan.nextInt();
			
			
			System.out.println("Fibonacci of " + n + " is = " 
								+ fibonacci(n));
		}
		

	}

	private static Integer fibonacci(Integer n) {
		// Calculate the fibonacci series till n
		
		if (n == 0 || n == 1) {
			return n;
		}else
			return fibonacci(n-1)+fibonacci(n-2);
		
	}

}
