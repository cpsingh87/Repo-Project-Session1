package AssignmentsOf31March;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteToAnotherFile {
	public static void main(String[] args) throws IOException 
	{
		File f1=new File("..\\Project-Session1\\ReadFromFile.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		
		File f2=new File("..\\Project-Session1\\WriteToFile.txt");
		FileWriter fw=new FileWriter(f2,true);
		BufferedWriter bw=new BufferedWriter(fw);
		
		String s;
		while((s=br.readLine())!=null)
		{
			bw.write(s);
			bw.newLine();
		}
		bw.close();
	}

}
