import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	
	public static void main(String[] args) throws IOException {

		File file=new File("C:\\Users\\new\\eclipse-workspace\\FrameworkDay3\\Excel Sheet\\Login.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Login2");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				//Cell Type STRING---->Text   NUMERIC----->Num
				CellType cellType = cell.getCellType();
				switch(cellType)
				{
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					break;
				case NUMERIC:
					double d = cell.getNumericCellValue();
					BigDecimal valueOf = BigDecimal.valueOf(d);
					String num = String.valueOf(valueOf);
					System.out.println(num);
					break;
				default:
					break;
				
				}
			}
		}
	}
}
