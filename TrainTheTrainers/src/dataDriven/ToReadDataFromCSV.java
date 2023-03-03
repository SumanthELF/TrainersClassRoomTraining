package dataDriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ToReadDataFromCSV {

	public static void main(String[] args) throws IOException, CsvException {
		
		//Creation of FIS/FR
		FileReader fr = new FileReader("./testData/testData.csv");
		
		//Creation of file type obj
		CSVReader reader = new CSVReader(fr);
		
		//read methods
//		String[] firstLineData = reader.readNext();
//		for(String data : firstLineData) {
//			System.out.print(data+" ,");
//		}
//		
//		String[] secondLineData = reader.readNext();
//		for(String data : secondLineData) {
//			System.out.print(data+" ,"); 
//		}
		List<String[]> allData = reader.readAll();
		for(String [] sarr : allData) {
			for(String arr : sarr) {
				System.out.print(arr+" ,");
			}
			System.out.println();
		}
	}

}
