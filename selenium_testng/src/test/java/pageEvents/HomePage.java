package pageEvents;

import org.testng.Assert;

import pageObjects.HomePageObjects;
import utilities.ElementLocator;

public class HomePage {

	public void clickLoginButton() {
		ElementLocator elementLocator = new ElementLocator();

		elementLocator.getWebElement("id", HomePageObjects.signInButton).click();
		Assert.assertTrue(true);

	}
}
