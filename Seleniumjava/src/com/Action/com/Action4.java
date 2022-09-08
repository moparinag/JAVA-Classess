package com.Action.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action4 {

	public static void main(String[] args) {
		String path="./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions act=new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		act.dragAndDrop(drag, drop).perform();
	}

}
