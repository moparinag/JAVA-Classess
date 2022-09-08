package ActitimeProg;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver2 {

	public static void main(String[] args) throws InterruptedException {
		String s="actiTIME - Enter Time-Track";
		String path="./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/xyz13/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("moparinag.b@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("mona@2022");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		if(s.equals(driver.getTitle()))
				{
			System.out.println("Login Successfull");
				}
		else
		{
			System.out.println("login unSuccessfull");
		}
		driver.close();
	}

}
