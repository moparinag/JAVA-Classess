package com.Action.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Frame1 {

	public static void main(String[] args) {
		String path="./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/");
		WebElement tutorials = driver.findElement(By.xpath("//li//a[text()='Selenium Practice']"));
		Actions act=new Actions(driver);
		act.moveToElement(tutorials).perform();
		WebElement java=driver.findElement(By.xpath("//li//a[text()='Frames Practice']"));
		act.moveToElement(java).click().perform();
	//	JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)", "");
		driver.switchTo().frame("frm3");
		WebElement dropdown1 = driver.findElement(By.id("selectnav1"));
		dropdown1.click();
		Select sec=new Select(dropdown1);
		sec.selectByValue("https://www.hyrtutorials.com/search/label/AutomationTesting");
		driver.switchTo().defaultContent();
		//JavascriptExecutor js1=(JavascriptExecutor) driver;
		//js1.executeScript("window.scrollBy(0,800)", "");
		driver.switchTo().frame("frm1");
		WebElement dropdown2 = driver.findElement(By.id("selectnav1"));
		dropdown2.click();
		Select sec1=new Select(dropdown2);
		sec1.selectByValue("https://www.hyrtutorials.com/search/label/SQL");
		
		
		}

}
