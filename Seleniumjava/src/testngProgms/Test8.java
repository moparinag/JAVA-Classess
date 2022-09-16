package testngProgms;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataUsage.ReadData1;

public class Test8 {
	@Test(dataProvider = "dataProvider")
	public void actitime(String username,String password,String titleExpected) throws InterruptedException{
	String path="./drivers/chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://online.actitime.com/xyz13/login.do");
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	Thread.sleep(1000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(3000);
	String titleActual = driver.getTitle();
	if(titleActual.equals(titleExpected))
	{
		Assert.assertEquals(titleActual, titleExpected);
		
	}
	else
	{
		Assert.assertFalse(titleActual.equals(titleExpected));
	}
	
}
	@DataProvider(name="dataProvider")
	public Object[][] data() throws IOException 
	{
		String[][] obj=new String[3][3];
		obj[0][0]=ReadData1.data(3, 0);
		obj[0][1]=ReadData1.data(3, 1);
		obj[0][2]=ReadData1.data(3, 2);
		obj[1][0]=ReadData1.data(1, 0);
		obj[1][1]=ReadData1.data(1, 1);
		obj[1][2]=ReadData1.data(1, 2);
		obj[2][0]=ReadData1.data(2, 0);
		obj[2][1]=ReadData1.data(2, 1);
		obj[2][2]=ReadData1.data(2, 2);
return obj;
	}
}