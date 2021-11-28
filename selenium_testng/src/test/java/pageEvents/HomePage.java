package pageEvents;

import org.testng.Assert;

import pageObjects.HomePageObjects;
import utilities.ElementLocator;

public class HomePage {

	public void clickLoginButton() {
		ElementLocator elementLocator = new ElementLocator();

		elementLocator.getWebElement("id", HomePageObjects.signInButtonID).click();
		//Assert.assertTrue(true);

	}
	
	public void enterUsernamePassword(String username, String password) {
		ElementLocator elementLocator = new ElementLocator();
		elementLocator.getWebElement("id", HomePageObjects.usernameID).sendKeys(username);
		elementLocator.getWebElement("id", HomePageObjects.passwordID).sendKeys(password);	
	}
}
