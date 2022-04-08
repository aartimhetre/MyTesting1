package exccel_sheet_study;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_test3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\Aarti Mhetre\\Desktop\\Real time project\\Book1.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		//method for getting rows from excel
	for(int i=0;i<=1;i++)//outer for loop for row
	{
		for(int j=0;j<=3;j++)//inner for loop for column
		{
			String value = Mysheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
	}
	}

}
