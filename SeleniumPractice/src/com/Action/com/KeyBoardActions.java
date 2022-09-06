package com.Action.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		String path="./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/xyz13/login.do");
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("moparinag.b@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("mona@2022",Keys.ENTER);
		//WebElement loginButton = driver.findElement(By.id("loginButton"));
		//Actions act=new Actions(driver);
		//act.doubleClick(user).perform();
	}

}
