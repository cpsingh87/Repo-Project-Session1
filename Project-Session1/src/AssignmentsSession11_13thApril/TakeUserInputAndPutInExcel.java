package AssignmentsSession11_13thApril;

//To take 9 inputs from User and write them in XLS File using JXL API
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class TakeUserInputAndPutInExcel {
	public static void main(String[] args) throws IOException, WriteException 
	{
		File f=new File("C:\\Users\\echtsih\\Desktop\\KS\\Automation\\Deepak C\\Session 11 - 13th April,2019\\TakeUserInputAndPutInExcel_Output.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Sheet1", 0);
		Scanner s=new Scanner(System.in);	
		for (int j=0;j<3;j++) //row number
			{
				for(int k=0;k<3;k++) //column number
				{
					System.out.println("Enter input "+k+j);
					String data=s.nextLine();
					Label l=new Label(k, j, data);
					ws.addCell(l);					
				}
			}
			wk.write();
			wk.close();	
			s.close();
	}
}
