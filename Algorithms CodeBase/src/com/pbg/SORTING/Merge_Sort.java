package com.pbg.SORTING;

import java.util.Arrays;

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
        int arr[] = { 12, 8, 11, 13, 5, 2, 6, 10, 4, 7, 1, 3, 9 };
        
        System.out.println("Given Array : " + Arrays.toString(arr));

        Merge_Sort obj = new Merge_Sort();
        obj.merge_sort(arr, 0, arr.length - 1);
        
		//	Display Results
		System.out.println("\n\nThe final sorted array using MERGE Sort "
				+ "(Recursive Approach) is : " + Arrays.toString(arr) + "\n\n");
		

	}
	
    // Main function that sorts arr[l..r] using
    // merge()
    void merge_sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
 
            // Sort first and second halves
            merge_sort(arr, l, m);
            merge_sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
	// Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        
        //Diagnostic Prints
        System.out.println("\nIteraton :");
        System.out.println("L = " + Arrays.toString(L) + 
        					"\tR = " + Arrays.toString(R));
        
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        
        //Diagnostic Prints
        System.out.println("Merge : L+R = " + Arrays.toString(arr));
        slowdown_forDiagnostics();
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
 * 	Algorithm : Merge Sort
 * 
 */

/*
 * 	Pseudocode - MERGE SORT
 *
 *	MERGESORT(A):
 *		n = length(A)
 *		if n<=1:return A	// Base case : If A has length 1 its obvio already sorted
 *
 *	// First recursively breakup the array all the way down to the base cases
 *		L = MERGESORT(A[ 1 : n/2])		//	Sort the left half first
 *		R = MERGESORT(A[ n/2+1 : n])	//	Then sort the right half
 *		return MERGE(L,R)			//	Merge the two halves 
 *
 *
 *	++ Internal implementation using helper method
 *	function MERGESORT(A):
 *		mergeSortHelper(A,0,length(A)-1)
 *
 *	function mergeSortHelper(A, start_index, end_index):
 *		if start >= end return
 *		mid = (start + end)/2
 *		mergeSortHelper(A, start, mid)
 *		mergeSortHelper(A, mid+1, end)
 *		i = start
 *		j = mid + 1
 *		aux = an empty array of size [end - start + 1]
 *		while i<= mid AND j<= end:
 *			if A[i] <= A[j]
 *				aux.append(A[i])
 *				i++
 *			else	//i.e. if A[i]>A[j]
 *				aux.append(A[j])
 *				j++
 *		while i <= mid :
 *			aux.append(A[i])
 *			i++
 *		while j <= end:
 *			aux.append(A[j])
 *			j++
 *		A[start ... end] = aux
 *		return
 */

/**
 * 		Design Strategy 3 : Divide And Conquer	(Multiple sub-problems [>1])
 * 
 * 	-	'DIVIDE' the problem into several instances of the problem (most often two),
 * 		generally of same size
 * 	-	'SOLVE' the smaller instances (typically using recursion)
 * 	-	'COMBINE' the solutions to the smaller instances to get the solution to the 
 * 		original problem
 * 
 */

/**
 *	* Note 1 : Merge Sort is not an 'in place' sorting algorithm.
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

/**
 *	* Note 2 :	Hybrid Algorithm : Tim Sort (by - Tim Peters)
 * 
 * 		Combines merge sort and insertion sort for worst case 𝚯( n log n ) time
 * 			and best case 𝚯( n ) time.
 * 
 * 		Tim Sort has been Python's standard sorting algorithm since V 2.3
 * 		And java also uses this algorithm to sort its objects.
 * 
 * */
