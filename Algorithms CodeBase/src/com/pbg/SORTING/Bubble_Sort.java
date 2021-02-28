package com.pbg.SORTING;

import java.util.Arrays;

/* --------- 2.	Bubble Sort --------- */

//	A Brute Force Strategy
//A Stable Sorting Algorithm if implemented properly (Stable means retains the previous sort order)

/*		Asymptotic Time Complexity
 * 
 *	Best Case		:	𝚯( n^2 )			| e.g. A sorted array
 *	Average Case	:	𝚯( n^2 )		
 *	Worst Case		:	𝚯( n^2 )		| e.g. A reverse sorted array
 */

public class Bubble_Sort {

	public static void main(String[] args) {
		//	Define an input array
		Integer[] input_Array = {7,2,5,3,9,6,8,1,4,10};
//		Integer[] input_Array = {10,9,8,7,6,5,4,3,2,1};
		
		//	Sort it using Selection Sort Algorithm
		Integer[] sorted_Array = bubble_Sort(input_Array);
		
		//	Display Results
		System.out.println("\n\nThe final sorted array using Bubble Sort is : " 
							+ Arrays.toString(sorted_Array));
		

	}

	private static Integer[] bubble_Sort(Integer[] int_Array) {
		//	Implement Bubble Sort Algorithm
		int swap_counter = 0;	//	Swap counter
		for (int i = 0 ; i < int_Array.length ; i++) {	// Iterate over 0 to n
			System.out.println("\nIteration " + (i+1));	// Diagnostic Prints - Iterations
			
			for (int j = 0 ; j < int_Array.length-i-1 ; j++) {	// Iterate over i+1 to n
				
				slowdown_forDiagnostics();	//	Slows down the runtime to view results
				
				if(int_Array[j] > int_Array[j+1]) {	
					int temp = int_Array[j+1];		// Swap logic
					int_Array[j+1] = int_Array[j];
					int_Array[j] = temp;
					
					System.out.println("Swapped!");	// Diagnostic Prints - Swapping
					swap_counter++;
				}
				//	Diagnostic Prints
				System.out.println("Selected index : [" + i + "] Element : " + int_Array[i] 
						+ " | Array : " + Arrays.toString(int_Array));
			}
		}
		System.out.println("\nTotal Swapps : " + swap_counter);	// Diagnostic Prints
		
		return int_Array;
	}
	
	private static void slowdown_forDiagnostics() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

/*
 * 	Algorithm :: Bubble Sort
 * 
 *  Step 1 - 
 * 	Step 2 - 
 * 	Step 3 - 
 * 	Step 4 - 
 * 
 */

/*
 * 	Pseudocode :: Bubble Sort
 *  	
 *  function BubbleSort(A) :
 *  	for i in 0 to length(A) :
 *  		for j in 0 down to length(A)-i-1 :
 *  			if A[j] > A[j+1] : 
 *  				swap (A[j] , A[j+1])
 *  
 *  	OR
 *  
 *  
 *  function BubbleSort(A) :
 *  	for i in 1 to length(A) :
 *  		for j in length(A) down to i :
 *  			if A[j-1] > A[j] : 
 *  				swap (A[j-1], A[j])
 * 
 */

/**
 * Note 1 : Jim Gray (Turing Awardee 1998)
 * 
 * 	Bubble sort is a good argument for analysing algorithm performance.
 * 	It is a perfectly correct algorithm.
 * 	But its performance is among the worst imaginable.
 * 
 * 	So it crisply shows the difference between correct algorithms and good algorithms.
 */
