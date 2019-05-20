package AssignmentsSession11_13thApril;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class WriteDataToParticularRowAndColumnNumber {
	public void WriteData(int row_num, int column_num, String data) throws IOException, WriteException 
	{
		File f=new File("C:\\Users\\echtsih\\Desktop\\KS\\Automation\\Deepak C\\Session 11 - 13th April,2019\\WriteData_output.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Sheet1", 0);
		Label l=new Label(column_num, row_num, data);
		ws.addCell(l);
		wk.write();
		wk.close();	
	}

	
	public static void main(String[] args) throws IOException, WriteException 
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter row");
		int r=S.nextInt();
		System.out.println("Enter column");
		int c=S.nextInt();
		System.out.println("Enter the Data to be inserted");
		String data=S.next();
		WriteDataToParticularRowAndColumnNumber obj=new WriteDataToParticularRowAndColumnNumber();
		obj.WriteData(r,c,data);
		System.out.println("Data has been inserted, please check the file");
	}
}
