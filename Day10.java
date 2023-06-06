package sample.testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String excelFilePath = "C:\\Users\\HP\\eclipse-workspace\\testing\\target\\Book1.xlsx";  
		
		try {
			FileInputStream inputStream = new FileInputStream(excelFilePath);
			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet sheet =workbook.getSheetAt(0);
			
			//Read data from excel
			readData(sheet);
			
			//write data from excel
			writeData(sheet);
			
			FileOutputStream outputStream = new FileOutputStream(excelFilePath);
			workbook.write(outputStream);
			workbook.close();
			outputStream.close();
			System.out.println("Your message is retrived and entered successfully");
			
			
		}
		 catch (IOException e)
		{
			 System.out.println(e);
		}
	}

	private static void writeData(Sheet sheet) {
		// TODO Auto-generated method stub
		Row newRow = sheet.createRow(sheet.getLastRowNum());
		Cell newcell_1 = newRow.createCell(1); 
		newcell_1.setCellValue("Second data Written");
	}

	private static void readData(Sheet sheet) {
		// TODO Auto-generated method stub
		for(Row row : sheet) {
			for(Cell cell : row) {
				CellType cellType = cell.getCellType();
				if(cellType == CellType.STRING) {
					System.out.println(cell.getStringCellValue());
				}
				else if(cellType == CellType.NUMERIC){
					System.out.println(cell.getNumericCellValue());
				}
			}
				
		}
		
	}

}