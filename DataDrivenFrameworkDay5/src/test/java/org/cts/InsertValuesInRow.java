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

public class InsertValuesInRow {

	public static void main(String[] args) throws IOException {
		// mention the path of excel
				File file = new File("C:\\Users\\new\\eclipse-workspace\\FrameworkDay4\\Excel\\Login.xlsx");
				// Get the objects
				FileInputStream stream = new FileInputStream(file);
				// Mention the workbook
				Workbook workbook = new XSSFWorkbook(stream);
				// mention the sheet details
				Sheet sheet = workbook.getSheet("Login");
				//create row
				Row row = sheet.createRow(11);
				//create cell
				Cell cell = row.createCell(1);
				//insert value
				cell.setCellValue("Selenium");
				FileOutputStream out=new FileOutputStream(file);
				workbook.write(out);
	}
}
