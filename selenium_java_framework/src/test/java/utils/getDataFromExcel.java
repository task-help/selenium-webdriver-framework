package utils;

public class getDataFromExcel {
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		
		
		
		ExcelUtils excel = new ExcelUtils(projectPath + "/data_source/data.xlsx", "Sheet1");
		
		System.out.println(projectPath);
		
		excel.getRowCount();
		excel.getCellData_string(0, 0);
		excel.getCellData_numbers(1, 1);
	}

}
