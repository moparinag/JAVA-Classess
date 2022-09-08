package com.Action.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActions2 {

	public static void main(String[] args) {
		String path="./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/xyz13/login.do");
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("moparinag.b@gmail.com");
		WebElement pass = driver.findElement(By.name("pwd"));
		user.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		user.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		user.sendKeys(Keys.chord(Keys.ALT));
		pass.sendKeys(Keys.CONTROL,"V");
		
	}

}
