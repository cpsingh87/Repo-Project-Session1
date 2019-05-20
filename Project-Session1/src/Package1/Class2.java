package Package1;

import java.util.Scanner;

public class Class2 {
	
	public int sum(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public int mul(int a,int b) 
	{
		return a*b;
	}
	
	public int div(int a, int b)
	{
		return a/b;
	}

	public static void main(String[] args) 
	{
		int a,b;
		int sum1,sum2;
		int sub1;
		int mul1;
		int div1;
		Scanner ScannerRefVar=new Scanner(System.in);
		Class2 SumRefVar= new Class2();
		System.out.println("Executing Expression ((((((a+b)-b)+b)*b)/b)");
		System.out.println("Enter Value of a for Expression 1");
		a=ScannerRefVar.nextInt();
		System.out.println("Enter Value of b for Expression 1");
		b=ScannerRefVar.nextInt();
		sum1=SumRefVar.sum(a, b);
		sub1=SumRefVar.sub(sum1, b);
		sum2=SumRefVar.sum(sub1, b);
		mul1=SumRefVar.mul(sum2, b);
		div1=SumRefVar.div(mul1, b);
		System.out.println("The Final Answer of Expression 1 is "+div1);
		
		System.out.println("Executing Expression ((((((a-b)+b)+b)/b)*b)");
		System.out.println("Enter Value of a for Expression 2");
		a=ScannerRefVar.nextInt();
		System.out.println("Enter Value of b for Expression 2");
		b=ScannerRefVar.nextInt();
		sub1=SumRefVar.sub(a, b);
		sum1=SumRefVar.sum(sub1, b);
		sum2=SumRefVar.sum(sum1, b);
		div1=SumRefVar.div(sum2, b);
		mul1=SumRefVar.mul(div1, b);
		System.out.println("The Final Answer of Expression 2 is "+mul1);
		
		System.out.println("Executing Expression ((((((a+b)-b)*b)+b)/b)");
		System.out.println("Enter Value of a for Expression 3");
		a=ScannerRefVar.nextInt();
		System.out.println("Enter Value of b for Expression 3");
		b=ScannerRefVar.nextInt();
		sum1=SumRefVar.sum(a, b);
		sub1=SumRefVar.sub(sum1, b);
		mul1=SumRefVar.mul(sub1, b);
		sum2=SumRefVar.sum(mul1, b);
		div1=SumRefVar.div(sum2, b);
		System.out.println("The Final Answer of Expression 3 is "+div1);		
		}
}
