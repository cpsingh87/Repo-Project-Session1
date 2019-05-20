package AssignmentsOf31March;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class PassLineNumberAndReturnDataOfLineNumber {
	
	public String returnData(int line) throws IOException
	{
		File f=new File("..\\Project-Session1\\DataInMultipleLines.txt");
		FileReader fr=new FileReader(f);
		LineNumberReader lnr=new LineNumberReader(fr);
		
		String LineData = null;
		
		while(lnr.getLineNumber()!=line) // Comparing user input line and the linenumber that we get from inbuilt class which returns line number
    		{
				LineData=lnr.readLine();
			}
		return LineData;	
	}
	
	public static void main(String[] args) throws IOException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Line Number for which output is reqd.");
		int LineNumber=s.nextInt();
		PassLineNumberAndReturnDataOfLineNumber obj=new PassLineNumberAndReturnDataOfLineNumber();
		System.out.println(obj.returnData(LineNumber)); //Directly calling the METHOD of class.
		s.close();
	}
}
