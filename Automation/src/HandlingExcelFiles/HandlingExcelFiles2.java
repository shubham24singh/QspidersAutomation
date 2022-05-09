package HandlingExcelFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.PageFactory;

public class HandlingExcelFiles2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	  Sheet s = wb.getSheet("Create Customer");
	  Row r=s.getRow(1);
	  Cell c= r.getCell(1);
	  String data=c.getStringCellValue();
	  System.out.println(data);
	  
	
	

	}

}
