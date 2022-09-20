package testngProgms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Actitime_Test {
	WebDriver driver;
	
	@BeforeClass
	public void LaunchBrowser()
	{
		String path="./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/xyz13/login.do");

		
	}
	
	@BeforeMethod
	public void ActiTimeLogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("moparinag.b@gmail.com");
		driver.findElement(By.name("pwd")).clear();
		driver.findElement(By.name("pwd")).sendKeys("mona@2022");
		driver.findElement(By.id("loginButton")).click();
			}
	@Test
	public void ActiTimeTitleVerify() throws InterruptedException
	{
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Title="+title);
	
	}
	
	@Test
	public void ActiTimeTaskTitleVerify() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Title="+title);
	}
	
	@AfterMethod
	public void LogOut()
	{
		driver.findElement(By.id("logoutLink")).click();
		
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
}
