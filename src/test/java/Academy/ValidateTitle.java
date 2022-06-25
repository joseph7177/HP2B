package Academy;


import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateTitle extends base{
	public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		log.info("Driver is initialised");
	}
	
	@Test
	public void basePageNavigation() 
	{
		driver.get(prop.getProperty("url"));
		log.info("Navigated to HomePage");
		LandingPage l = new LandingPage(driver);
		l.clickOnPopup().click();
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		Assert.assertTrue(l.getNavBar().isDisplayed());
		log.info("Sucessfully checked whether displayed or not");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}
