package AssignmentsOf31March;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TakeInputsAndWriteInFile {
	
	public void dataReadWrite() throws IOException
	{
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter "+i+" data");
			String data=s.next();
			File f=new File("..\\Project-Session1\\UserInputAndWriteInFile.txt");
			FileWriter fw=new FileWriter(f,true);
			BufferedWriter b=new BufferedWriter(fw);
			b.write(data);
			b.newLine();
			b.close();
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
		TakeInputsAndWriteInFile obj=new TakeInputsAndWriteInFile();
		obj.dataReadWrite();
	}

}
