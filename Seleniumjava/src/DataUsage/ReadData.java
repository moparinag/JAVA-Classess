package DataUsage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("C:\\Users\\VEGI\\JAVA-Classess\\Seleniumjava\\data\\Data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		Cell cell1 = row.getCell(1);
		String value = cell.getStringCellValue();
		System.out.println("value="+value);
		String value1=cell1.getStringCellValue();
		System.out.println("value1="+value1);
		Cell cell2=row.getCell(2);
		String value2=cell2.getStringCellValue();
		System.out.println("value2="+value2);
	}

}
