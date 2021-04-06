package cSW2;

import java.util.Scanner;

public class c2p2 {
	
	/*
	 * Bit manipulation
	 * 
	 * April 1
	 */
	
	public void bitCount(int n) {
		
		int count = 0;
		
		while (n != 0) {
			
			n &= n-1; // worst case analysis: max 32 bit, integer n has log(n) bits, so n -> log(kn) -> O(log(n))
			
			count ++;
			
		} // Brian Kernighan's algorithm
		
		System.out.println("Number of bits that are set to 1 in the Integer in O(log n) time is " + count);
	}
	
	public void checkSign(int x, int y) {
		
		/*
		 * Bit operation explanation:
		 * 
		 * For signed binary numbers the most significant bit (MSB) is used as the sign bit. 
		 * If the sign bit is “0”, this means the number is positive in value. 
		 * If the sign bit is “1”, then the number is negative in value.
		 * 
		 * Let's take 3 and -2 which have opposite signs
		 * 
		 * In binary, 3 is 0011
		 * 
		 * In binary, -2 is:
		 * 
		 * 2:   0010
		 * 1's: 1101
		 * 	   +0001
		 * 		----
		 * 		1110
		 * 
		 * So 3 ^ -2 will be :
		 * 
		 * 		0011
		 * 	   ^1110
		 * 		----
		 * 		1111  
		 * 
		 * 1111 is negative (<0) because the sign bit is 1
		 * 
		 * Let's take 3 and 2 which have same signs
		 * 
		 * In binary, 3 is 0011, and 2 is 0010
		 * 
		 * 	0011
		 * ^0010
		 * 	----
		 *  0011
		 *  
		 *  0011 is positive (>=0) because the sign bit is 0
		 *  
		 */
		
		if ((x ^ y) < 0)
			System.out.println("Two integers have opposite signs");
		
		else
			System.out.println("Two integers have same signs");
		
	}
	
	public void turnOffRightmostSetBit(int n) {
		
		/*
		 * Bit operation explanation:
		 * 
		 *   10110011	N
		 *   01001100	1's complement (0 to 1, and 1 to 0)
		 *  +00000001	
		 *   --------
		 *   01001101	2's complement (-N)
		 *  &10110011   & operator 
		 *   --------
		 *   00000001   (-N & N)
		 *   
		 *   10110011	N
		 *  -00000001	(-N & N)
		 *   --------
		 *   10110010	N - (-N & N)
		 *   
		 * Therefore, the rightmost set bit is gone 
		 */
		
		System.out.println("The number n in binary is "+Integer.toBinaryString(n));
		
		System.out.println("The number after the rightmost set bit is turned off is "+Integer.toBinaryString(n-(-n & n)));
		
	}
	
	public void checkPow2(int n) {
		
		/*
		 * Bit operation explanation:
		 * 
		 * Condition 1: n > 0, because power can't be negative
		 * 
		 * Condition 2: (n & (n-1)) == 0
		 * 
		 * 1) Let's take 4, a power of 2
		 * 
		 * 4 in binary is 0100
		 * 
		 *  0100	n
		 * -0001
		 *  ----
		 *  0011	n-1
		 * &0100
		 *  ----
		 *  0000	n & (n-1)
		 *  
		 * 2) Let's take 6, even but not a power of 2
		 * 
		 *  0110	n
		 * -0001
		 *  ----
		 *  0101	n-1
		 * &0110
		 *  ----
		 *  0100	n & (n-1)
		 *  
		 * 3) Let's take 7, an odd number
		 * 
		 *  0111	n
		 * -0001
		 *  ----
		 *  0110	n-1
		 * &0111
		 *  ----
		 *  0110	n & (n-1)
		 * 
		 */
		
		if (n > 0 && (n & (n - 1)) == 0)
			System.out.println("Yes, the number is a power of 2");
		
		else
			System.out.println("No, the number is not a power of 2");
	}
	
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		
		  try {
			  
		      c2p2 ob = new c2p2();
			  
			  System.out.println("Enter the number who's set bits are to be counted in O(log n) time : ");
			  
			  int n = sc.nextInt();
					      
		      ob.bitCount(n);
		      
			  System.out.println("Enter two integers to detect if they have opposite signs : ");	
			  
			  int x = sc.nextInt();
			  int y = sc.nextInt();
		      
		      ob.checkSign(x, y);
		      
		      System.out.println("Enter the integer whose rightmost set bit is to be turned off : ");
		      
		      int m = sc.nextInt();
		      
		      ob.turnOffRightmostSetBit(m);
		      
		      System.out.println("Enter the number to be checked for power of 2 : ");
		      
		      int p = sc.nextInt();
		      
		      ob.checkPow2(p);
		      
		  }
		  
		  finally {
			  sc.close();
		  }
	      
	   }

}
