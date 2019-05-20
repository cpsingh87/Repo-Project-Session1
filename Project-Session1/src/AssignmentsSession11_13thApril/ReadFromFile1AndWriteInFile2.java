package AssignmentsSession11_13thApril;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ReadFromFile1AndWriteInFile2 {
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException 
	{
		File f1=new File("C:\\Users\\echtsih\\Desktop\\KS\\Automation\\Deepak C\\Session 11 - 13th April,2019\\Assignment4 - ReadFromFile-Input File.xls");
		File f2=new File("C:\\Users\\echtsih\\Desktop\\KS\\Automation\\Deepak C\\Session 11 - 13th April,2019\\Assignment4 - WriteToFile-Output File.xls");
		Workbook wk1=Workbook.getWorkbook(f1);
		Sheet ws1=wk1.getSheet(0);

		WritableWorkbook wk2=Workbook.createWorkbook(f2);
		WritableSheet ws2=wk2.createSheet("Sheet1", 0);
		
		String c2=null;
		int r=ws1.getRows();
		int c=ws1.getColumns();
		
		System.out.println("Starting Reading from File1 and then Writing to New File2....");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1=ws1.getCell(j,i);
				c2=c1.getContents();
				Label l=new Label(j,i, c2);
				ws2.addCell(l);
			}
		}
		wk2.write();
		wk2.close();
		System.out.println("All Data Written to New File");
	}
}
