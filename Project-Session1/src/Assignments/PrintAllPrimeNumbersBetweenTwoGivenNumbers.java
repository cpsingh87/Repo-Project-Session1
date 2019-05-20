package Assignments;

//import java.util.Scanner;

public class PrintAllPrimeNumbersBetweenTwoGivenNumbers {
	public static void main(String[] args) 
	{
		
		//int first,last;
		int flag=0;
		//Scanner s= new Scanner(System.in);
		//System.out.println("Enter the First & Last Number");
		//first=s.nextInt();
		//last=s.nextInt();
		
		for(int number=5;number<=100;number++)
		{
			int half=number/2;
			
			for(int j=2;j<=half;j++)
			{
				if(number%j==0)
				{
					//System.out.println("Number "+num+" is not Prime");
					flag=1; // We are using a Flag here.
					break;
				}
			}	
				if(flag==0)
				{
					System.out.println(""+ number);
				}
				flag=0;
		}
		
		
	}

}
