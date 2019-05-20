package AssignmentsSession11_13thApril;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ReadDataFromParticularRowAndColumn {
	public void ReadData(int row_num, int column_num) throws BiffException, IOException
	{
		File f=new File("C:\\Users\\echtsih\\Desktop\\KS\\Automation\\Deepak C\\Session 11 - 13th April,2019\\ReadData_Assignment3_InputFile.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		String c2=null;
		int j=0;
		int i=0;
		
		for(i=0;i<row_num;i++)
		{
			for(j=0;j<column_num;j++)
			{
				Cell c1=ws.getCell(j, i);
				c2=c1.getContents();
			}
		}
		System.out.println(c2);
	}
	
	public static void main(String[] args) throws BiffException, IOException 
	{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter rownum");
	int r=S.nextInt();
	System.out.println("Enter Column num");
	int c=S.nextInt();
	ReadDataFromParticularRowAndColumn obj=new ReadDataFromParticularRowAndColumn();
	obj.ReadData(r, c);
	S.close();
	}
}
