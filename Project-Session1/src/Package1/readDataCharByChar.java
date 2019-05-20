package Package1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readDataCharByChar {

	public static void main(String[] args) throws IOException 
	{
		File f= new File("C:/Users/echtsih/Desktop/KS/Automation/testfile.txt");
		FileReader fr= new FileReader(f);
		
		int a;
		
		while((a=fr.read())!=-1) // -1 means while End Of File is not reached.
		{
			System.out.println((char)a);
		}
	}
}
