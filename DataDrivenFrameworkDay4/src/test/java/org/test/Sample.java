package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//Data Driven Framework
public class Sample {
	public static void main(String[] args) throws IOException {
		// mention the path of excel
		File file = new File("C:\\Users\\new\\eclipse-workspace\\FrameworkDay3\\Excel Sheet\\OmrBranchLogin.xlsx");
		// Get the objects
		FileInputStream stream = new FileInputStream(file);
		// Mention the workbook
		Workbook workbook = new XSSFWorkbook(stream);
		// mention the sheet details
		Sheet sheet = workbook.getSheet("Login");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				// Cell Type STRING--->text NUMERIC---->num
				CellType cellType = cell.getCellType();
				// System.out.println(cellType);
				switch (cellType) {
				case STRING:
					String value = cell.getStringCellValue();
					System.out.println(value);
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
						String format = dateFormat.format(dateCellValue);
						System.out.println(format);
					} else {
						double d = cell.getNumericCellValue();
						long round = Math.round(d);
						if (d == round) {
							String valueOf = String.valueOf(round);
							System.out.println(valueOf);
						} else {
							String string = String.valueOf(d);
							System.out.println(string);
						}

					}
					break;

				default:
					break;
				}
			}
		}
	}

}
