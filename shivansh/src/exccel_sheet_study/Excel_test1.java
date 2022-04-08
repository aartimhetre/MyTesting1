package exccel_sheet_study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\Aarti Mhetre\\Desktop\\Real time project\\Book1.xlsx");
		String value = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println("the data from excel is "+value);
//double value1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
//System.out.println("the data from excel is "+value1);
	}

}
