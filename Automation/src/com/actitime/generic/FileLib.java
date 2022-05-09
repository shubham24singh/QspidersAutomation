package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	/**
	 * This is generic method to read the data from Property File
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String getPropertyData(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/common.property");
	Properties p=new Properties();
	p.load(fis);
	String data=p.getProperty(key);
	return data;	
}
/**
 * This is a generic method to read the data from Excel file
 * @param path
 * @param sheetname
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String getExcelData(String path,String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
/**
 * This is a generic method to write the data to excel file
 * @param path
 * @param sheetname
 * @param row
 * @param cell
 * @param Value
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void setExcelData(String path,String sheetname,int row,int cell,String Value) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(Value);
	FileOutputStream fos=new FileOutputStream(path);
	wb.write(fos);
	wb.close();	
}
}
