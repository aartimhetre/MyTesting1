package exccel_sheet_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_sheet5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Aarti Mhetre\\Desktop\\Real time project\\Book1.xlsx");
Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
CellType celltype1 = Mysheet.getRow(0).getCell(0).getCellType();
CellType celltype2 = Mysheet.getRow(0).getCell(1).getCellType();
CellType celltype3 = Mysheet.getRow(0).getCell(2).getCellType();
CellType celltype4 = Mysheet.getRow(0).getCell(3).getCellType();
CellType celltype5 = Mysheet.getRow(1).getCell(0).getCellType();
CellType celltype6 = Mysheet.getRow(1).getCell(2).getCellType();
CellType celltype7 = Mysheet.getRow(1).getCell(4).getCellType();
System.out.println(celltype1);
System.out.println(celltype2);
System.out.println(celltype3);
System.out.println(celltype4);
System.out.println(celltype5);
System.out.println(celltype6);
System.out.println(celltype7);

String value1 = Mysheet.getRow(0).getCell(0).getStringCellValue();
System.out.println(value1);
String value2 = Mysheet.getRow(0).getCell(4).getStringCellValue();
System.out.println(value2);

	}

}
