package AssignmentsOf_6thApril;

import java.util.Scanner;

public class StringIsPalindromeOrNot {
	public static void main(String[] args) 
	{
		
		System.out.println("Enter String to check palindrome");
		Scanner S=new Scanner(System.in);
		String S1=S.nextLine();
		String S2="";
		
		int strlen=S1.length();
		for(int i=strlen-1;i>=0;i--)
		{
			S2=S2+S1.charAt(i);
		}
		if(S2.equalsIgnoreCase(S1))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is Not Palindrome");
		}
	}
}
