package com.select.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select1 {

	public static void main(String[] args) throws InterruptedException {
		String path="./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		String expected="2018";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement CreateNewAccount = driver.findElement(By.linkText("Create New Account"));
		CreateNewAccount.click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		Select select=new Select(day);
		select.selectByValue("10");
		WebElement month = driver.findElement(By.id("month"));
		Select select1=new Select(month);
		select1.selectByIndex(10);
		WebElement year=driver.findElement(By.id("year"));
		Select select2=new Select(year);
		//select2.selectByVisibleText("1988");
	List<WebElement> AllYears = select2.getOptions();
	for(WebElement year1:AllYears) {
		String s=year1.getText();
		System.out.println("list of Years="+s);
		if(expected.equals(s))
		{
			select2.selectByVisibleText(expected);
		}
			}
	
	}

}
