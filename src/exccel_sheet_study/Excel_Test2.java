package exccel_sheet_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\Aarti Mhetre\\Desktop\\Real time project\\Book1.xlsx");
		//String value = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
Workbook test = WorkbookFactory.create(Myfile);
Sheet MySheet = test.getSheet("Sheet1");
Row MyRow = MySheet.getRow(0);
Cell MyCell = MyRow.getCell(0);
String MyValue = MyCell.getStringCellValue();
//System.out.println(MySheet.getRow(0).getCell(0).getStringCellValue());

for(int i=0;i<=3;i++)
{
	  String value1 = MySheet.getRow(0).getCell(i).getStringCellValue();
      System.out.println(value1);
}
	}

}
