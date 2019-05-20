package Package1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeDataInFile {
	public static void main(String[] args) throws IOException 
	{
		File f= new File("..\\Project-Session1\\WriteFile.txt");
		FileWriter fw= new FileWriter(f);
		fw.write("My name is Charan");
		fw.close();
	}

}
