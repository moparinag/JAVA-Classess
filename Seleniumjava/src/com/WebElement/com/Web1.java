package com.WebElement.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web1 {

	public static void main(String[] args) throws InterruptedException {
		String s="actiTIME - Enter Time-Track";
		String path="./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/xyz13/login.do");
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("moparinag.b@gmail.com");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("mona@2022");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
				loginButton.click();
		Thread.sleep(3000);
	}

}
