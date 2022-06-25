package Academy;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		
	}
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String UserName , String Password) throws IOException
	{
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
	
		//l.clickOnPopup().click();
		l.signIn().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.enterEmail().sendKeys(UserName);
		lp.enterPassword().sendKeys(Password);
		lp.LoginClick().click();
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "nonRestrictedUser@gmail.com";
		data[0][1] = "23456yhgfdgh";
	//	data[0][2] = "Non restricted User";
		
		data[1][0] = "RestrictedUser@gmail.com";
		data[1][1] = "vbnju654ewsxcft678";
	//	data[1][2] = " Restricted User";
		
		return data;
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
