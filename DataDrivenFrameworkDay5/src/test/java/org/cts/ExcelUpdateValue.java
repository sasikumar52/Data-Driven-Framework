package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdateValue {
	public static void main(String[] args) throws IOException {
		// mention the path of excel
				File file = new File("C:\\Users\\new\\eclipse-workspace\\FrameworkDay4\\Excel\\Login.xlsx");
				// Get the objects
				FileInputStream stream = new FileInputStream(file);
				// Mention the workbook
				Workbook workbook = new XSSFWorkbook(stream);
				// mention the sheet details
				Sheet sheet = workbook.getSheet("Login");
				//Replace/Modify Updata Data
				//Get the row
				Row row = sheet.getRow(3);
				//get the cell
				Cell cell = row.getCell(1);
				//get the cell value of String
				String value = cell.getStringCellValue();
				//Verify cell data is equal to value
				if(value.equals("Kumaran"))
				{
					//Insert Value
					cell.setCellValue("ArimaRaj");
				}
				//save--> convert object into file-->FileOutStream
				FileOutputStream out=new FileOutputStream(file);
				//write values in workbook
				workbook.write(out);
	}

}
