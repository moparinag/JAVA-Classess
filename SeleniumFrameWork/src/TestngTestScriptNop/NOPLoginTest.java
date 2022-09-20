package TestngTestScriptNop;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.com.nopCommerceLogin;
import com.commonlib.Browser;
import com.commonlib.ExcelLibraries;
import com.commonlib.ProjectConstants;

public class NOPLoginTest {
	
	nopCommerceLogin LoginPage;
	ExcelLibraries excel;
@BeforeClass
public void LaunchBrowser()
{
	Browser.getBrowser();
	Browser.driver.get(ProjectConstants.url);
	Browser.driver.manage().window().maximize();
	LoginPage = PageFactory.initElements(Browser.driver,nopCommerceLogin.class);
	}
@BeforeMethod
public void LoginNopECommerce()
{
	LoginPage.getUsername().clear();
	LoginPage.getPassword().clear();
	LoginPage.EnterUsername(ProjectConstants.Username);
	LoginPage.EnterPassword(ProjectConstants.Password);
	LoginPage.ClickLoginBtn();
}
@Test
public void VerifyTitle() throws InterruptedException, EncryptedDocumentException, IOException
{
	Thread.sleep(3000);
	String Actualtitle = Browser.driver.getTitle();
	System.out.println(Actualtitle);
	Thread.sleep(3000);
	excel=new ExcelLibraries();
	String ExpectedTitle = excel.ReadData("Sheet1", 1, 1);
	System.out.println(ExpectedTitle);
	Assert.assertEquals(Actualtitle, ExpectedTitle,"Verify Title Passed");
}
@AfterMethod
public void LogoutNopECommerce()
{
	
}

@AfterClass
public void CloseBrowser()
{
	Browser.driver.close();
}
}
