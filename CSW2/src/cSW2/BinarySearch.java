package cSW2;

import java.util.Scanner;

public class BinarySearch {
	/*
	 * Sorted data method
	 * Formula: mid = low + (high - low)/2 or (low + high)/2
	 */
	
	// Iterative Binary Search Algorithm
	public int IterativeBinarySearch(int[] A, int data) {
		int low = 0, high = A.length-1, mid;
		while (low <= high) { // O(1)
			mid = low + (high - low)/2; // To avoid overflow
			
			if(A[mid] == data)
				return mid;
			else if(A[mid] < data)
				low = mid + 1; // T(n/2)
			else
				high = mid - 1; 
		}
		return -1;
		
		/*
		 * Time Complexity for worst case is O(log n)
		 * First iteration: n i.e length of array
		 * Second iteration: n/2
		 * Third iteration: (n/2)/2 = n/(2^2)
		 * m times iteration later length of array becomes 1: n/(2^m) = 1
		 * m = log n (base 2)
		 * And ignoring the less dominant terms and constants
		 * So time complexity of worst case is O(log n)
		 */
	}
	
	// Recursive Binary Search Algorithm
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the size of the array");
			int s = sc.nextInt();
			
			System.out.println("Enter the array elements");
			int[] A = new int[s];
			for(int i=0; i<s; i++)
				A[i] = sc.nextInt();
			
			System.out.println("Enter the element to be searched");
			int data = sc.nextInt();
			
			BinarySearch ob = new BinarySearch();			
			System.out.println(ob.IterativeBinarySearch(A, data));
		}
		finally {
			sc.close();
		}		
	}

}
