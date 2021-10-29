package excelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadClass {
	public static FileInputStream file ;
	public static XSSFWorkbook wrk;
	public static XSSFSheet sh;
	
	public static String  readString(int i, int j) throws IOException {
		file = new FileInputStream("C:\\Users\\Saritha\\Desktop\\ExcelRead.xlsx");
		wrk = new XSSFWorkbook(file);
		sh = wrk.getSheet("Sheet1");
		Row r= sh.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();
		
		
	}
	public static String  readIntData(int i, int j) throws IOException {
		file = new FileInputStream("C:\\Users\\Saritha\\Desktop\\ExcelRead.xlsx");
		wrk = new XSSFWorkbook(file);
		sh = wrk.getSheet("Sheet1");
		Row r= sh.getRow(i);
		Cell c = r.getCell(j);
		int a = (int) c.getNumericCellValue();
		return String.valueOf(a);
			
		
	}

}
