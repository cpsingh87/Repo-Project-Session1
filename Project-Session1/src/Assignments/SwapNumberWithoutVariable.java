package Assignments;

import java.util.Scanner;

public class SwapNumberWithoutVariable {
	
	public static void main(String[] args) 
	{
		// Swapping 2 numbers without using 3rd Variable
		int a,b;
		
		Scanner S=new Scanner(System.in);
		System.out.println("Input Value of a & b for Swapping ");
		a=S.nextInt();
		b=S.nextInt();
		
		System.out.println("Number a before Swap is " +a);
		System.out.println("Number b before Swap is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number a After Swap is " +a);
		System.out.println("Number b After Swap is "+b);
		
	}

}
