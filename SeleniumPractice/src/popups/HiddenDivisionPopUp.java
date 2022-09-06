package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		String path="./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Beng");
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("New");
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		WebElement month = driver.findElement(By.xpath("//div[@ class='DayPicker-Caption']//div"));
		String monthexpected=month.getText();
	System.out.println(monthexpected);
		while(!monthexpected.equals("March 2023"))
		{
			System.out.println(monthexpected);
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			month =driver.findElement(By.xpath("//div[@ class='DayPicker-Caption']//div"));
		monthexpected=month.getText();
		if(monthexpected.equals("March 2023"))
		{
			driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
			
			WebElement date = driver.findElement(By.xpath("//div[@aria-label='Fri Mar 17 2023']//div//p[text()='17']"));
			
			System.out.println("date==="+date.getText());
			Actions act=new Actions(driver);
			act.click(date).perform();
			
			WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
			act.click(search).perform();
			WebElement closepopup = driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']"));
			act.click(closepopup).perform();
		}
				}
	
	driver.close();

	}

}
