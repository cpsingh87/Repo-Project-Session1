package Assignments;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) 
	{
		int num,flag=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Number to be checked");
		num=s.nextInt();
		
		/* Logic here is that this loop will run unless Number/2. If the Number gets divided by any value of i in between,
		 then it is not a Prime Number. */
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("Number "+num+" is not Prime");
				flag=1; // We are using a Flag here.
				break;
			}
		}	
			if(flag==0)
				System.out.println(num+" is Prime");
	}

}
