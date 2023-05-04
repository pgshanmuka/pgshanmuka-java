package pratice;

import java.util.Scanner;

public class Bitwiseoperator {
	
	  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  
	        System.out.print("Enter first number: ");
	        int n1 = input.nextInt();
	 
	        System.out.print("Enter second number: ");
	        int n2 = input.nextInt();
	 
	        System.out.println("Bitwise AND: " + (n1 & n2));
	        System.out.println("Bitwise OR: " + (n1 | n2));
	        System.out.println("Bitwise XOR: " + (n1 ^ n2));
	        System.out.println("Bitwise NOT: " + (~n1));
	        System.out.println("Bitwise Left Shift: " + (n1 << 2));
	        System.out.println("Bitwise Right Shift: " + (n1 >> 2));
	        System.out.println("Bitwise Unsigned Right Shift: " + (n1 >>> 2));
	
	       
	    }
		  
	  }


