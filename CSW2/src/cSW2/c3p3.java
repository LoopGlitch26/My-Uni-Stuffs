package cSW2;

import java.util.Scanner;

public class c3p3 {
	
	public int swapBits(int n, int p1, int p2)
	{
		
		n ^= 1 << p1;
		
		n ^= 1 << p2;
	
		return n;
	
	}
	
	public void swapNum(int a, int b) {
		
		a = a ^ b ^ (b = a);
		
		System.out.println("Swapped values are \r\n" + a  + "\r\n" + b );
		
	}
	
	public int reverseBits(int n) {
		
		int rev = 0;
		
		while(n > 0) {
			
			rev <<= 1;
			
			if((int)(n & 1) == 1)
				rev ^= 1;
			
			n >>>= 1;
		}
		
		return rev;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
						
			c3p3 ob = new c3p3();
			
			System.out.println("Enter two numbers to be swapped : ");
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			ob.swapNum(a, b);
			
			System.out.println("Enter the number whose bits are to be swapped ");
			
			int n = sc.nextInt();
			
			System.out.println("Enter the two positions in which the bits are to be swapped ");
			
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			
			System.out.print("Value after swapping bits is :  " + ob.swapBits(n, p1, p2) + "\r\n");
			
			System.out.println("Enter the number whose bits are to be reversed : ");
			
			int m = sc.nextInt();
			
			System.out.println("Value after bits are reversed : " + ob.reverseBits(m));
		
		}
		
		finally {
			sc.close();
		}
		
	
	}

}
