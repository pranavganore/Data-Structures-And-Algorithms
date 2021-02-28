package com.pbg.SORTING;

import java.util.Arrays;
import java.util.Random;

/* --------- 5.	Quick Sort --------- */

//	A Divide & Conquer Strategy	(A problem is divided into multiple sub-problems)
//	V IMP - Not stable like Merge Sort but 'in place' unlike Merge sort.
//	Little more faster than Merge sort but Worst case is slower than Merge Sort
//	Quick sort runs faster in empirical analysis.

/*		Asymptotic Time Complexity
 * 
 *	Best Case		:	𝚯( n log n )		| e.g. A sorted array
 *	Average Case	:	𝚯( n log n )		
 *	Worst Case		:	𝚯( n^2 )			| e.g. A reverse sorted array
 */

public class Quick_Sort {

	public static void main(String[] args) {
		Integer[] input_Array = { 12, 8, 11, 13, 5, 2, 6, 10, 4, 7, 1, 3, 9 };
//		Integer[] input_Array = {10,9,8,7,6,5,4,3,2,1};
		
		
		//	Sort it using Selection Sort Algorithm - Iterative Way
		quick_Sort(input_Array);
				
		//	Display Results
		System.out.println("\n\nThe final sorted array using Qick Sort is : " 
							+ Arrays.toString(input_Array));
		

	}

	private static void quick_Sort(Integer[] input_Array) {
		quickSort_Helper(input_Array, 0, input_Array.length-1);
		
	}

	private static void quickSort_Helper(Integer[] int_Array, int start, int end) {
		if (start >= end) return;	//	Base Case
		
		//	Pick a random index for choosing a PIVOT
		int random_index = new Random().nextInt(int_Array.length);
//		int random_index = int_Array[(int) (Math.random()*(int_Array.length-1))];

		int temp = int_Array[random_index];
		int_Array[random_index] = int_Array[start];
		int_Array[start] = temp;
		
		int PIVOT = int_Array[start];
		int smaller = start;
		int bigger = start;
		
		System.out.println("PIVOT : " + PIVOT);		// Diagnostic Prints
		
		for (bigger = start+1 ; bigger < (end) ; bigger++ ) {
			if(int_Array[bigger] < PIVOT) {
				smaller++;
				// Now Swap smaller and bigger indexes
				int temp2 = int_Array[bigger];
				int_Array[bigger] = int_Array[smaller];
				int_Array[smaller] = temp2;	
			}
		}
		
		//	Diagnostic Prints 
		System.out.println("Array after Lomuto's Partitioning: " 
							+ Arrays.toString(int_Array));
		
		// Now swap start and smaller indexes
		temp = int_Array[start];
		int_Array[start] = int_Array[smaller];
		int_Array[smaller] = temp;	
		
		//	Now recursively Divide (Partition)
		quickSort_Helper(int_Array, start, smaller-1);
		quickSort_Helper(int_Array, smaller+1, bigger);
		
	}

}

/*
 * 	Algorithm : Merge Sort
 * 
 */

/*
 * 	Pseudocode - MERGE SORT
 * 
 *	QuickSort(A) :
 *		if length(A)<=1 : return	//	Base case
 *		Pick some x = A[i] at random & call this as a PIVOT element
 *		PARTITION the rest of the A into :					//	Divide step
 *			L (all elements must be less than X(pivot))
 *			R (all elements must be greater than X(pivot))
 *			// We can observe that by this step the X is already in its right spot
 *		Replace A with [L, X, R] (i.e. rearrange A in this order)
 *		QuickSort(L)										//	Solve step - recursion
 *		QuickSort(R)										//	Combine not required
 *
 *	?-Choosing the pivot ?
 *	->	1. First / Last / Middle element OR
 *		2. Element at some random index
 *
 *======================================================================
 *	Pseudocode wireframing  :
 *
 *	function quicksort(A):
 *		if length(A) <= 1, return	// Base case
 *		
 *		PARTITIONING code here 		//	Divide 
 *		
 *		quicksort_helper(A, start_index , end_index)	//	Solve
 *		quicksort_helper(A, start_index , end_index)
 *		
 *----------------------------------------------------
 *	Pseudocode for coding : 
 *
 *	function quicksort(A):
 *		quicksort_helper(A,O,length(A)-1)
 *
 *	function quicksort_helper(A,start,end):
 *		if start >= end , return
 *		// Pick a random index for choosing pivot
 *		random_index = randominteger(start,end)	//	Selecting a random element 
 *		swap(A[random_index],A[start])			// put the random element at the beginning
 *		pivot = A[start]						// Setting the pivot at start element
 *		smaller = start
 *		bigger = start
 *	
 *		for bigger in (start+1) to end:
 *			if A[bigger] < pivot:
 *				smaller++
 *				swap(A[smaller],A[bigger])
 *			swap(A[start],A[smaller])
 *
 *		quicksort_helper(A,start,smaller-1)		//	recursively call the left partition
 *		quicksort_helper(A,smaller+1,bigger)	//	recursively call the right partition
 *
 */

/*
 * Lomuto's Partitioning : 𝐎(n) time, in place
 * 		
 * Hoare's Partitioning
 * 
 * QuickSort is not a Stable Sorting Algorithm no matter which partition type you use
 * (See meaning of stable in UpLevel 'Stability in Sorting')
 * 
 * Thus Merge Sort(Stable) is preferred over Quicksort in case Stability is an important factor
 */
