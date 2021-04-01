package cSW2;

import java.util.Scanner;

public class BubbleSort {
	public void BubbleSortSwap(int[] A) {
		int pass, i, temp; boolean swapped = true;
		
		/*
		 * Time Complexity of worst case will make the loops iterate length of the array number of times, i.e n^2
		 * So O(n^2)
		 */
		
		for(pass = A.length - 1; ((pass >= 0) && (swapped)); pass--) { // if no swapping takes place, iteration will be stopped, but in worst case iteration will continue n times
			swapped = false;
			for(i=0; i<= pass; i++) { // iteration will continue n more times for each n
				if(A[i] > A[i+1]) {
					temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
					swapped = true;
				}
			}
			
		}
		
		for(int j=0; j <= A.length - 1; j++)
			System.out.println(A[j]);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the size of the array");
			int s = sc.nextInt();
			
			System.out.println("Enter the array elements");
			int[] A = new int[s];
			for(int i=0; i<s; i++)
				A[i] = sc.nextInt();
			
			
			BubbleSort ob = new BubbleSort();			
			ob.BubbleSortSwap(A);
		}
		finally {
			sc.close();
		}		
	}
	

}
