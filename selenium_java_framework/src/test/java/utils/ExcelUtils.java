package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		
		try {
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		getRowCount();
		getCellData_string(0,0);
		getCellData_numbers(1,1);
	}
	
	
	public static void getRowCount() {
		
		try {
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of row: " + rowcount);
		}
		catch(Exception exp) {
			
		System.out.println(exp.getMessage());  
		System.out.println(exp.getCause());	
		exp.getStackTrace();
		}
		
		}
	
	
	public static void getCellData_string(int rowNum, int colNum) {
		
		try {
		
		String CellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(CellData);
		}
		catch(Exception exp) {
			
		System.out.println(exp.getMessage());  
		System.out.println(exp.getCause());	
		exp.getStackTrace();
		}
		
		
	}
	
	
public static void getCellData_numbers(int rowNum, int colNum) {
		
		try {
		
		double CellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(CellData);
		}
		catch(Exception exp) {
			
		System.out.println(exp.getMessage());  
		System.out.println(exp.getCause());	
		exp.getStackTrace();
		}
		
		
	}


}
