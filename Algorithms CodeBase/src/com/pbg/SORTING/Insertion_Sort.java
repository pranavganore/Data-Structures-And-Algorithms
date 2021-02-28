package com.pbg.SORTING;

import java.util.Arrays;

/* --------- 3.	Insertion Sort  --------- */

//	A Decrease & Conquer Strategy	(A problem is divided into single sub-problem)
//A Stable Sorting Algorithm if implemented properly (Stable means retains the previous sort order)

/*		Asymptotic Time Complexity
 * 
 *	Best Case		:	𝚯( n )			| e.g. A sorted array
 *	Average Case	:	𝚯( n^2 )		
 *	Worst Case		:	𝚯( n^2 )		| e.g. A reverse sorted array
 */

//θ𝚯 𝐎𝒪

public class Insertion_Sort {
	
	//	Iterative way
	
	//	Recursive way

	public static void main(String[] args) {
		//	Define an input array
		Integer[] input_Array = {7,2,5,3,9,6,8,1,4,10};
//		Integer[] input_Array = {10,9,8,7,6,5,4,3,2,1};
		Integer[] sorted_Array = null;
		
		//	Sort it using Selection Sort Algorithm - Iterative Way
		sorted_Array = insertion_Sort_iterative(input_Array);
				
		//	Display Results
		System.out.println("\n\nThe final sorted array using Insertion Sort "
				+ "(Iterative Approach) is : " + Arrays.toString(sorted_Array));
		
		//	Sort it using Selection Sort Algorithm - Recursive Way
		sorted_Array = insertion_Sort_recursive(input_Array, input_Array.length);
		
		//	Display Results
		System.out.println("\n\nThe final sorted array using Insertion Sort "
				+ "(Recursive Approach) is : " + Arrays.toString(sorted_Array) + "\n\n");
		
	}

	private static Integer[] insertion_Sort_iterative(Integer[] int_Array) {
		if (int_Array.length <= 1) return int_Array;	// Base case - Check if array has single element or empty

		for (int i = 2 ; i < int_Array.length ; i++) {	// loop over from 2 to n
			// Now initialize & insert the ith(last) element into its rightful place
			int last = int_Array[i];
			int j = i - 1;
			
			while ((j >= 1) && (int_Array[j] > last)) {	//	Shift all elements to right
				int_Array[j+1] = int_Array[j];			//	until you find nth elements
				j--;									//	rightful place
				System.out.println("Right Shift !");	// Diagnostic Print
			}// Now an empty space is created where the nth element will go
			
			int_Array[j+1] = last;
			// Inserting the nth(last) element into its rightful place
//			Diagnostic Prints
			System.out.println("Element : " + last + " inserted at -> [" + (j+1) + "]");
			System.out.println("Array : " + Arrays.toString(int_Array));
		}
		return int_Array;
	}

	private static Integer[] insertion_Sort_recursive(Integer[] int_Array, int array_size) {
		if (array_size <= 1) return int_Array;	// Base case - Check if array has single element or empty
		insertion_Sort_recursive(int_Array, (array_size-1));	//	Recursion [break the problem down]
		
		// Now initialize & insert the nth(last) element into its rightful place
		int nth = int_Array[array_size-1];
		int j = array_size - 2 ;
		
		while((j >= 0) && (int_Array[j] > nth)){	//	Shift all elements to right 
			int_Array[j+1] = int_Array[j];			//	until you find nth elements 
			j = j - 1;								//	rightful place
			System.out.println("Right Shift !");
		}	// Now an empty space is created where the nth element will go
		
		int_Array[j+1] = nth;	// Inserting the nth(last) element into its rightful place
//		Diagnostic Prints
		System.out.println("Element : " + nth + " inserted at -> [" + (j+1) + "]");
		System.out.println("Array : " + Arrays.toString(int_Array));
		
		return int_Array;
	}

}

/**
 * 		Design Strategy 2 : Decrease And Conquer	(1 sub-problem)
 * 
 * 	-	Decrease the problem of size n to size (n-1).
 * 	-	Assume you have solved the problem of size (n-1).
 * 	-	Solve the problem of size n using the solution to the problem of size (n-1)
 * 	-	RECURSIVE (if TOP-DOWN) and ITERATIVE (if BOTTOM-UP)
 * 
 */

/*	Pseudocode :: 
 * 
 *	Recursive Version (Top-Down Approach) :	
 *	
 *	def insertionSort(A,n) : 	// array A[1...n]
 *		if(n <= 1) return;
 *		insertionSort(A,n-1);
 *		// Now insert the nth element into its place
 *		j = n-1
 *		while j >= 1 and A[j] > A[j+1] : 
 *			swap(A[j+1],A[j])
 *			j = j - 1
 *		return
 *
 *	++ Slightly better / optimized approach (instead of bubble swaps use shifting)
 *	def insertionSort(A,n) : 	// array A[1...n]
 *		if(n <= 1) return;
 *		insertionSort(A,n-1);
 *		// Now insert the nth element into its place
 *		nth = A[n-1];
 *		j = n-2
 *		while j >= 1 and A[j] > nth : 
 *			A[j+1] = A[j]		//	Shift operation (to right) [slightly more efficient]
 *			j = j - 1
 *		A[j+1] = nth			//	insert the nth element to its rightful place in array
 *		return
 *
 *	
 *	Iterative Version (Bottom-Up approach) :
 *
 *	def insertionSort(A) : 	// array A[1...n]
 *		if(n <= 1) return;
 *		for i = 2 to n :
 *			ith = A[i]
 *			j = i - 1
 *			while j >= 1 AND A[j] > ith :
 *				A[j+1] = A[j]
 *				j = j - 1
 *			A[j+1] = ith
 *		return
 */
