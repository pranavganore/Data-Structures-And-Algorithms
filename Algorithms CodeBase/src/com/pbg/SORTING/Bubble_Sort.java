package com.pbg.SORTING;

import java.util.Arrays;

/* --------- 2.	Bubble Sort --------- */

//	A Brute Force Strategy

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
		
		//	Sort it using Selection Sort Algorithm
		Integer[] sorted_Array = bubble_Sort(input_Array);
		
		//	Display Results
		System.out.println("\n\nThe final sorted array using Bubble Sort is : " 
							+ Arrays.toString(sorted_Array));
		

	}

	private static Integer[] bubble_Sort(Integer[] int_Array) {
		
		for (int i = 0 ; i < int_Array.length ; i++) {	// Iterate over 0 to n
			System.out.println("Iteration " + (i+1));	// Diagnostic Prints - Iterations
			
			for (int j = i+1 ; j < int_Array.length ; j++) {	// Iterate over i+1 to n
				
				slowdown_forDiagnostics();	//	Slows down the runtime to view results
				
				if(int_Array[j] < int_Array[i]) {	
					int temp = int_Array[i];		// Swap logic
					int_Array[i] = int_Array[j];
					int_Array[j] = temp;
				}
				//	Diagnostic Prints
				System.out.println("Selected index : [" + i + "] Element : " + int_Array[i] 
						+ " | Array : " + Arrays.toString(int_Array));
			}
		}
		return int_Array;
	}
	
	private static void slowdown_forDiagnostics() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

/*
 * 	Algorithm :: Bubble Sort
 * 
 *  Step 1 - Locate the smallest item and put it in the first place.
 * 	Step 2 - Then select the next smallest item and put it in the second place. And so on...
 * 	Step 3 - Sorting by repeated selection : "Selection Sort"
 * 	Step 4 - Final output ordering generated one by one in sequence.
 * 
 */

/*
 * 	Pseudocode :: Bubble Sort
 *  	
 * 
 */