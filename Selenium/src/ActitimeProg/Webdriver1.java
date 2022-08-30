package ActitimeProg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver1 {

	public static void main(String[] args) throws InterruptedException {
		String path="./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com");
		driver.findElement(By.xpath("//a[text()='Try Free']")).click();
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("moparinag");
		
		//driver.close();
	}

}
