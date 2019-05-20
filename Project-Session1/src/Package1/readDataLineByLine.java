package Package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readDataLineByLine {
	public static void main(String[] args) throws IOException 
	{
		File f=new File("..\\Project-Session1\\testfile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String s;
		
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
	}
}
