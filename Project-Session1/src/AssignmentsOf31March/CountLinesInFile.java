package AssignmentsOf31March;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesInFile {
	public static void main(String[] args) throws IOException 
	{
		File f1=new File("..\\Project-Session1\\ReadFromFile.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
				
		int line=0;
		
		while(br.readLine()!=null)
    		{
				line++;
			}
		System.out.println("Total number of lines in this file is "+line);;
	}

}
