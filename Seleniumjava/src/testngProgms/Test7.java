package testngProgms;

import javax.print.attribute.standard.RequestingUserName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test7 {
	@Test
	@Parameters({"username","password"})
	public void actitime(String username,String password) throws InterruptedException {
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
System.out.println(driver.getTitle());
	}
}
