package cSW2;

import java.util.Scanner;

public class LinearSearch {
	
	// Unsorted elements
	public int UnsortedLinearSearch(int[] A, int data) {
		for (int i = 0; i < A.length; i++) { // Time complexity of worst case is O(n) because in worst case we need to scan the complete array
			if (A[i] == data)
				return i;
		}
		return -1;
	}
	
	// Sorted elements
/*	public int SortedLinearSearch(int[] A, int data) {
		for (int i = 0; i < A.length; i++) { // Time complexity of worst case is O(n) because in worst case we need to scan the complete array
			if (A[i] == data)
				return i;
			else 
				if(A[i] > data) // Sorted data position check
					return -1;			
		}
		return -1;
	}*/
	
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
			
			LinearSearch ob = new LinearSearch();			
			System.out.println(ob.UnsortedLinearSearch(A, data));
//			System.out.println(ob.SortedLinearSearch(A, data));
		}
		finally {
			sc.close();
		}
		
	}

}
