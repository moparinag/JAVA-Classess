package DataUsage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("C:\\Users\\VEGI\\JAVA-Classess\\Seleniumjava\\data\\Data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		//Cell cell = row.getCell(2);
		Cell cell = row.createCell(2);
		cell.setCellType(CellType.STRING);
		FileOutputStream out=new FileOutputStream(file);
		cell.setCellValue("hello mona");
		wb.write(out);
		wb.close();
		
		
	}

}
