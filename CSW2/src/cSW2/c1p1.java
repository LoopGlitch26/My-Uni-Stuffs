package cSW2;

import java.util.Scanner;

public class c1p1 {

	public void bitwise(int a, int b) {
		
		  System.out.println("a & b = "+(a & b));

	      System.out.println("a | b = "+(a | b));

	      System.out.println("a ^ b = "+(a ^ b));
	      
	      System.out.println("Complement of a = "+(~a));
	      
	      System.out.println("Complement of b = "+(~b));


	}
	
	public void shift(int a, int b) {
		
		  System.out.println("a >> 2 = "+(a >> 2));

	      System.out.println("a >>> 2 = "+(a >>> 2));

	      System.out.println("a << 1 = "+(a << 1));
	      
	      System.out.println("a << 2 = "+(a << 2));
	      
	      System.out.println("b >> 1 = "+(b >> 1));

	      System.out.println("b >>> 1 = "+(b >>> 1));
	      
	      System.out.println("b << 1 = "+(b << 1));

	      System.out.println("b >> 2 = "+(b >> 2));

	}
	
	public void bitCount(int n) {
		
		int count = 0; 
		
		for(int i =0; i<32; i++) { 
			
			if( (n & 1) == 1) { 
				
				count++; 
				
				} 
			
			n = n >>> 1; 
	      
	      }
		
		System.out.println("Number of bits that are set to 1 in an Integer n is " + count);

	} 
	
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		
		  int n = sc.nextInt();
		
	      c1p1 ob = new c1p1();
	      
	      ob.bitwise(5, 7);
	      
	      ob.shift(8, -10);
	      
	      ob.bitCount(n);
	      
	   }
	}