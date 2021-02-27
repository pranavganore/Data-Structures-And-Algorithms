package com.pbg.SORTING;

import java.util.Arrays;

/* --------- 1.	Selection Sort --------- */

//	A Brute Force Strategy

/*		Asymptotic Time Complexity
 * 
 *	Best Case		:	𝚯( n )			| e.g. A sorted array
 *	Average Case	:	𝚯( n^2 )		
 *	Worst Case		:	𝚯( n^2 )		| e.g. A reverse sorted array
 */

public class Selection_Sort {

	public static void main(String[] args) {
		//	Define an input array
		Integer[] input_Array = {7,2,5,3,9,6,8,1,4,10};

		//	Sort it using Selection Sort Algorithm
		Integer[] sorted_Array = selection_Sort(input_Array);
		
		//	Display Results
		System.out.println("\n\nThe final sorted array using Selection Sort is : " 
							+ Arrays.toString(sorted_Array));
		
		
	}
	
	public static Integer[] selection_Sort(Integer[] int_Array){
		//	Implement Selection Sort Algorithm
		int swap_counter = 0;	//	Swap counter
		for(int i = 0; i < int_Array.length-1 ; i++) {		// Iterate over 0 to n
			System.out.println("Iteration " + (i+1));	// Diagnostic Prints - Iterations
			
			int min_idx = i;		//	Select the first index as minimum
			int j = i+1;
			while( j < int_Array.length) {

				slowdown_forDiagnostics();	//	Slows down the runtime to view results
				
				if( int_Array[j] < int_Array[min_idx]  ) {
					min_idx = j;	//	Update the minimum_index	
				} j++;
				
				//	Diagnostic Prints
				System.out.println("Selected index : [" + i + "] Element : " + int_Array[i] 
						+ " | Array : " + Arrays.toString(int_Array));
			}
			
			//	Now swap the new minimum found with the selected i.e. i'th position
			int temp = int_Array[i];
			int_Array[i] = int_Array[min_idx];
			int_Array[min_idx] = temp;
			//	To optimize it more , 
			//	we can check here if - min_idx and i are same and perform swap 
			//	only if they are not equal
			
			System.out.println("Swapped!\n");	// Diagnostic Prints - Swapping
			swap_counter++;
			
		}
		System.out.println("\nTotal Swapps : " + swap_counter);	// Diagnostic Prints
		return int_Array;
	}

	private static void slowdown_forDiagnostics() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

/*
 * 	Algorithm :: Selection Sort
 * 
 *  Step 1 - Locate the smallest item and put it in the first place.
 * 	Step 2 - Then select the next smallest item and put it in the second place. And so on...
 * 	Step 3 - Sorting by repeated selection : "Selection Sort"
 * 	Step 4 - Final output ordering generated one by one in sequence.
 * 
 */

/*
 * 	Pseudocode :: Selection Sort
 *  	
 *  function selectionSort(A) :		//array A[1...n]
 *		for i in 1 to n :
 *			#Find the ith smallest element and swap it with A[i]
 *			min = i
 *			During a linear scan of A[i...n] : 
 *				if you find a smaller element than A[min] :
 *					update the index of the min element
 *			Swap the min element with A[i]
 * 
 */

/*
 * 	Selection Sort using FOR while loop


*/