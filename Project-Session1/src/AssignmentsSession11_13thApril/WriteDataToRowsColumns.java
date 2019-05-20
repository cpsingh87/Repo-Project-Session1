package AssignmentsSession11_13thApril;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class WriteDataToRowsColumns {
	public void WriteData(int row_num, int column_num,String data) throws IOException, WriteException 
	{
		File f=new File("C:\\Users\\echtsih\\Desktop\\KS\\Automation\\Deepak C\\Session 11 - 13th April,2019\\WriteDataToRowsColumns_Assignment2_output.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Sheet1", 0);
		Scanner S1=new Scanner(System.in);
		for(int i=0;i<row_num;i++)
		{
			for(int j=0;j<column_num;j++)
			{
			//	String data=S1.nextLine();
				Label l=new Label(j,i, data);
				ws.addCell(l);
			}
		}
		wk.write();
		wk.close();	
		S1.close();
	}

	
	public static void main(String[] args) throws IOException, WriteException 
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter rows");
		int r=S.nextInt();
		System.out.println("Enter columns");
		int c=S.nextInt();
		System.out.println("Enter the Data to be inserted");
		String data=S.next();
		WriteDataToRowsColumns obj=new WriteDataToRowsColumns();
		obj.WriteData(r,c,data);
		System.out.println("Data has been inserted, please check the file");
		S.close();
	}
}
