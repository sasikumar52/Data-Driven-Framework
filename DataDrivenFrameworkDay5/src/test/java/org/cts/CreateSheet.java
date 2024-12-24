package org.cts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheet {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\new\\eclipse-workspace\\FrameworkDay4\\Excel\\text.xlsx");
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Login");
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(1);
		cell.setCellValue("JavaSelenium");
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);


	}

}
