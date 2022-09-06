package com.select.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multab {

	public static void main(String[] args) throws InterruptedException {
		String path="./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement companies = driver.findElement(By.xpath("//div[text()='Companies']"));
		Actions act=new Actions(driver);
		act.moveToElement(companies).perform();
		Thread.sleep(2000);
		WebElement productbased = driver.findElement(By.linkText("Product based"));
		act.click(productbased).perform();
		Set<String> windows = driver.getWindowHandles();
		
	for(String window:windows)
		{
				driver.switchTo().window(window);
				
				WebElement Startup = driver.findElement(By.xpath("//span[text()='Startup (191)']"));
				if(Startup.isDisplayed())
				{
				Startup.click();
				Thread.sleep(3000);
				driver.close();
			
				}
			
		}
		
	}

}
