package com.pbg.SORTING;

/* --------- 4.	Merge Sort --------- */

//	A Divide & Conquer Strategy	(A problem is divided into multiple sub-problems)

/*		Asymptotic Time Complexity
 * 
 *	Best Case		:	𝚯( n log n )		| e.g. A sorted array
 *	Average Case	:	𝚯( n log n )		
 *	Worst Case		:	𝚯( n log n )		| e.g. A reverse sorted array
 */

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/**
 * Note : Merge Sort is not an 'in place' sorting algorithm.
 * 
 * ->	An algorithm is said to be in place, if it does not require extra memory,
 * 			except a constant amount of memory units. (i.e. it should not require 
 * 			any extra allocation space that is proportional to the input size or 
 * 			even a function of the input size. But the constant amount of extra space,
 * 			like few extra variables are ok.)
 * 		And since merge sort requires extra memory in the form of auxiliary array
 * 			to hold the merge, it is not an in place algorithm.
 *
 */