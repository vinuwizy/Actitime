package com.actitime.genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic library class which contains all the generic methods.
 * @author Vinayak
 *
 */
public class FileLibrary {
	/**
	 * This is a generic method which is used to read the data from property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String ReadDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * This method is a generic method which is used to read the data from excel sheet.
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
public String ReadDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis1=new FileInputStream("./TestData/Test Data.xlsx.xlsx");
     	Workbook wb = WorkbookFactory.create(fis1);
     	String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
     	return value;
}

}
