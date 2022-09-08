package com.Action.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
			Actions Act=new Actions(driver);
			Act.moveToElement(electronics).perform();
			WebElement gaming = driver.findElement(By.linkText("Gaming"));
			String text=gaming.getText();
			System.out.println("text="+text);
			gaming.click();
	}

}
