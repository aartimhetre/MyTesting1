package exccel_sheet_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_sheet6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\Aarti Mhetre\\Desktop\\Real time project\\Book1.xlsx");
		 Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
		int totalrowcount = Mysheet.getLastRowNum();
		 int totalnoofcolumn = Mysheet.getRow(0).getLastCellNum()-1;
		 
		 for(int i=0;i<=totalrowcount;i++)//for outer row
		 {
			 for(int j=0;j<=totalnoofcolumn;j++)//for inner column
			 {
				 Cell cellinfo = Mysheet.getRow(i).getCell(j);
				 CellType type = cellinfo.getCellType();
				 if(type==CellType.STRING)
				 {
					String value = cellinfo.getStringCellValue();
					System.out.print(value+" ");
				 }
				 else if(type==CellType.BOOLEAN)
				 {
					 boolean value = cellinfo.getBooleanCellValue();
					 System.out.print(value+" ");
				 }
				 else if(type==CellType.NUMERIC)
				 {
					 double value = cellinfo.getNumericCellValue();
					 System.out.print(value+" ");
				 }
				 
			 }
			 System.out.println();
		 }

		
	}

}
