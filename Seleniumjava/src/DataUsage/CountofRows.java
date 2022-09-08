package DataUsage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CountofRows {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("C:\\Users\\VEGI\\JAVA-Classess\\Seleniumjava\\data\\Data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int num=sheet.getLastRowNum();
		System.out.println("total testcase=="+num);
	}

}
