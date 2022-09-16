package com.commonlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
public static	WebDriver driver;

public static void getBrowser()
{
	if(ProjectConstants.browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "");
		driver=new ChromeDriver();
	}else if(ProjectConstants.browser.equals("Firefox")){
		System.setProperty("webdriver.geckodriver.driver", "");
		driver=new FirefoxDriver();
	}
	
}
}
