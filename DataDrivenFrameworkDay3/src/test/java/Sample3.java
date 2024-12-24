
//If excel has some decimal values to be round of we use roundOf method

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

public class Sample3 {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\new\\eclipse-workspace\\FrameworkDay3\\Excel Sheet\\Login.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Login2");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				//Cell Type STRING---->Text   NUMERIC----->Num     Date--->Correct Format   Decimal--->RoundOf
				CellType cellType = cell.getCellType();
				switch(cellType)
				{
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-YY");
						String format = dateFormat.format(dateCellValue);
						System.out.println(format);
					}
					else {
					double d = cell.getNumericCellValue();
					long round = Math.round(d);
					if(d==round)
					{
						String valueOf = String.valueOf(round);
						System.out.println(valueOf);
					}
					else {
						String string = String.valueOf(d);
						System.out.println(string);
					}
					break;
					}
				default:
					break;
				
				}
			}
		}
	}

}
