package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By signIn = By.xpath("//span[.='Login']");
	By popUp = By.xpath("//button[.='NO THANKS']"); //
	By title = By.xpath(" //h2[.='Featured Courses']");
	By navBar = By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement signIn()
	{
		return driver.findElement(signIn);
	}
	
	public WebElement clickOnPopup()
	{
	return	driver.findElement(popUp);
	}
	
	public WebElement getTitle()
	{
	return	driver.findElement(title);
	}
	
	public WebElement getNavBar()
	{
	return	driver.findElement(navBar);
	}

}
