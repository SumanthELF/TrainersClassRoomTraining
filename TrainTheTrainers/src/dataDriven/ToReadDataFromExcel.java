package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		//Create object of IS/ FR
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		
		//Object of File type
		Workbook workbook = WorkbookFactory.create(fis);
		
		//read methods
		String testData1 = workbook.getSheet("Sheet1").getRow(0).getCell(9).toString();
		System.out.println(testData1);
		
		double testData2 = workbook.getSheet("Sheet2").getRow(16).getCell(13).getNumericCellValue();
		System.out.println(testData2);
	}

}
