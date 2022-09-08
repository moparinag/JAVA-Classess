package com.WebElement.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
