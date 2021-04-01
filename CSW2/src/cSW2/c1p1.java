package cSW2;

import java.util.Scanner;

public class c1p1 {
	
	/*
	 * I'm solving all three problems under one class
	 * Although it's not preferred during exams
	 */

	public void bitwise(int a, int b) {
		
		  /*
		   * As per question, we take a = 5 , b = 7
		   * a in binary, (5) base 10 = (0000 0101) base 2
		   * b in binary, (7) base 10 = (0000 0111) base 2
		   */
		
		  System.out.println("a & b = "+(a & b));
		  
		  /* 
		   * Bitwise AND (&) is true (returns 1) iff both operands are (1)
		   * It takes binary values
		   * 
		   * a & b
		   *   0000 0101
		   * & 0000 0111
		   *   ---------
		   *   0000 0101
		   *   
		   * so a & b = 5
		   */

	      System.out.println("a | b = "+(a | b));
	      
	      /* 
		   * Bitwise OR (|) is true (returns 1) if at-least one operand is (1)
		   * It takes binary values
		   * 
		   * a | b
		   *   0000 0101
		   * | 0000 0111
		   *   ---------
		   *   0000 0111
		   *   
		   * so a | b = 7
		   */
	      
	      System.out.println("a ^ b = "+(a ^ b));
	      
	      /* 
		   * Bitwise XOR (^) is true (returns 1) iff exactly one operand is (1)
		   * It takes binary values
		   * 
		   * a ^ b
		   *   0000 0101
		   * ^ 0000 0111
		   *   ---------
		   *   0000 0010
		   *   
		   * so a ^ b = 2
		   */
	      
	      System.out.println("Complement of a = "+(~a)); // ~a = -6
	      
	      // Binary 1 change to 0 and vice versa
	      
	      System.out.println("Complement of b = "+(~b)); // ~b = -8
	      
	      // Also for all n, ~n = - (n + 1)


	}
	
	/*
	 * 2's complement to find Binary Negative numbers
	 * 
	 * Eg: -10
	 * 
	 * 10 in Binary is 0000 1010
	 * 
	 * 1's complement changes 0 to 1 and 1 to 0
	 * 
	 * Adding 1 to 1's complement, we get 2's complement
	 * 
	 * 1's complement of 0000 1010 is 1111 0101 
	 * 
	 * So 2's complement is :
	 * 
	 *   1111 0101
	 * + 0000 0001
	 *   ---------
	 *   1111 0110  
	 *   
	 * So -10 in Binary is 1111 0110
	 */
	
	public void shift(int a, int b) { 
		
		  /* a = 8 , b = -10
		   * Binary a = 0000 1000 , b = 1111 0110
		   * 
		   * Signed Right Shift Operator
		   * All bits shifted towards right by the specified bits mentioned times
		   * Rightmost bits discarded and leftmost bits are replaced by sign bits
		   * 
		   * Class Qsn: -10 >> 2
		   * 
		   * 1111 0110 >> 2 = 1111 1101 
		   * 
		   *   1111 1101
		   * - 0000 0001
		   *   ---------
		   *   1111 1100
		   *   
		   * Which is 1's complement of 0000 0011 which is 3 in decimal
		   * 
		   * So -10 >> 2 = -3
		   *   
		   */
		
		  System.out.println("a >> 2 = "+(a >> 2)); // 0000 0010 i.e., 2
		  
		  /*
		   * Unsigned Right Shift Operator
		   * Vacant leftmost position is filled with 0 irrespective of sign
		   */

	      System.out.println("a >>> 2 = "+(a >>> 2)); // 0000 0010 i.e, 2
	      
	      /*
	       * Signed Left Shift Operator
	       * All bits shifted towards left by the specified bits mentioned times
	       * Leftmost bit discarded and rightmost vacancy replaced by 0
	       */

	      System.out.println("a << 1 = "+(a << 1)); // 0001 0000 i.e, 16
	      
	      System.out.println("a << 2 = "+(a << 2)); // 0010 0000 i.e, 32
	      
	      System.out.println("b >> 1 = "+(b >> 1)); // 1111 1011 i.e, -5

	      System.out.println("b >>> 1 = "+(b >>> 1)); 
	      
	      /* 0111 1111 1111 1111 1111 1111 1111 1011 
	       * i.e, (0 × 2³¹) + (1 × 2³⁰) + (1 × 2²⁹) + (1 × 2²⁸) + (1 × 2²⁷) + (1 × 2²⁶) + (1 × 2²⁵) + (1 × 2²⁴) + (1 × 2²³) + (1 × 2²²) + (1 × 2²¹) + (1 × 2²⁰) + (1 × 2¹⁹) + (1 × 2¹⁸) + (1 × 2¹⁷) + (1 × 2¹⁶) + (1 × 2¹⁵) + (1 × 2¹⁴) + (1 × 2¹³) + (1 × 2¹²) + (1 × 2¹¹) + (1 × 2¹⁰) + (1 × 2⁹) + (1 × 2⁸) + (1 × 2⁷) + (1 × 2⁶) + (1 × 2⁵) + (1 × 2⁴) + (1 × 2³) + (0 × 2²) + (1 × 2¹) + (1 × 2⁰) = (2147483643)₁₀
	       */
	      
	      System.out.println("b << 1 = "+(b << 1)); // 1110 1100 i.e, -20

	      System.out.println("b >> 2 = "+(b >> 2)); // 1111 1101 i.e, -3

	}
	
	public void bitCount(int n) {
		
		// Brute Force
		
		int count = 0; 
		
		while (n != 0) {
			
			count += (n & 1);
			
			n >>= 1; // worst case analysis: 32 bit so n -> kn -> O(n)
		}
		
		/*
		 * Brian Kernighan's algorithm
		 * 
		 * while (n != 0) {
		 * 
		 * 		n &= (n-1); 
		 * 		// worst case analysis: max 32 bit, integer n has log(n) bits, so n -> log(kn) -> O(log(n))
		 * 		
		 * 		count++;
		 * }
		 */
		
		System.out.println("Number of bits that are set to 1 in an Integer n is " + count);
		
		// Alternate method : n = n & ~(n & ~(n-1)); // worst case analysis: O(1)

	} 
	
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		
		  System.out.println("Enter the number who's set bits are to be counted : ");
		  
		  int n = sc.nextInt();
		
	      c1p1 ob = new c1p1();
	      
	      ob.bitwise(5, 7);
	      
	      ob.shift(8, -10);
	      
	      ob.bitCount(n);
	      
	   }
	}