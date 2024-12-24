package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static void main(String[] args) throws IOException {
		//Mention the path of excel
		File file=new File("C:\\Users\\new\\eclipse-workspace\\FrameworkDay2\\Excel Sheet\\Login.xlsx"); 
		//Get the objects/bytes from file
		FileInputStream stream=new FileInputStream(file);
		//Mention the workbook
		Workbook workbook=new XSSFWorkbook(stream);
		//Mention the sheet details
		Sheet sheet = workbook.getSheet("Login");
		//Get the row details
		Row row = sheet.getRow(3);
		//Get the cell details
		Cell cell = row.getCell(1);
		System.out.println(cell);
		//cell count
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println("Number of Cells");
		System.out.println(physicalNumberOfCells);
		//row count
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows");
		System.out.println(physicalNumberOfRows);
		System.out.println("-----------------------------");
		//Iterate the cells
		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			Cell cell2 = row.getCell(i);
			System.out.println(cell2);
			
		}
		System.out.println("-----------------------------");
		//Iterate All rows and columns
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row2.getCell(j);
				System.out.println(cell2);
			}
		}
	}

}
