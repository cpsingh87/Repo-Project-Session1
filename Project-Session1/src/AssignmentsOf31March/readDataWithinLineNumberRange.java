package AssignmentsOf31March;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readDataWithinLineNumberRange {
	public void dataRead(String path,int startLine,int endLine) throws IOException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		
		String s;
		int count=1;
		while((s=br.readLine())!=null)
		{
			if((count>=startLine) && (count<=endLine))
			{
				System.out.println(s);
			}
			count++;
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
		int R1,R2;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter start Line number");
		R1=S.nextInt();
		System.out.println("Enter end line number");
		R2=S.nextInt();
		if(R1>=0 && R1<R2)
		{
			readDataWithinLineNumberRange obj=new readDataWithinLineNumberRange();
			obj.dataRead("..\\Project-Session1\\ReadFromFile.txt",R1,R2);
		}
		else
		{
			System.out.println("Start Line should be less than End Line and Greater than 0");
		}
		S.close();
	}
}
