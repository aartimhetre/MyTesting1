package exccel_sheet_study;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_test4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\Aarti Mhetre\\Desktop\\Real time project\\Book1.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		//method for getting rows from excel
		int lastRowNum = Mysheet.getLastRowNum();
		System.out.println("Last row num is "+lastRowNum);
		int Totalnumofrows = lastRowNum;
		//method for getting cells from excel
		short lastCellNum = Mysheet.getRow(0).getLastCellNum();
		System.out.println("Last cell num is "+lastCellNum);
		 int Totalnumofcell = lastCellNum-1;
		
		for(int i=0;i<=Totalnumofrows;i++)//for the rows
		{
			for(int j=0;j<=Totalnumofcell;j++)
			{
				String value = Mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value+" ");
			}
			System.out.println();
		}
	}

}
