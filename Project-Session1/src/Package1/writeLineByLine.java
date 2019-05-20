package Package1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeLineByLine {
	public static void main(String[] args) throws IOException 
	{
		File f=new File("..\\Project-Session1\\WriteLineByLine.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("This is first line");
		bw.newLine();
		bw.write("This is Second Line");
		bw.close();
	}

}
