package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	By emailId = By.id("user_email"); // //
	By password = By.id("user_password");
	By loginBtn = By.xpath("//input[@name='commit']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement enterEmail() {
		return driver.findElement(emailId);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement LoginClick() {
		return driver.findElement(loginBtn);
	}

}
