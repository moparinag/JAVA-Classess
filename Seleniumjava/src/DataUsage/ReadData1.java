package DataUsage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1 {
	public static String data(int Row,int Col) throws IOException{
		File file=new File("C:\\Users\\VEGI\\JAVA-Classess\\Seleniumjava\\data\\Data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		Row row = sheet.getRow(Row);
		Cell cell = row.getCell(Col);
		String value = cell.getStringCellValue();
		return value;
	}
}
