package pageEvents;

import pageObjects.LoginPageObjects;
import pageObjects.LogoutObjects;
import utilities.ElementLocator;

public class LoginPage {
	
	public void enterUsernamePassword(String username, String password) {
		ElementLocator elementLocator = new ElementLocator();
		elementLocator.getWebElement("id", LoginPageObjects.usernameID).sendKeys(username);
		elementLocator.getWebElement("id", LoginPageObjects.passwordID).sendKeys(password);	
	}

	public void clickLoginButton() {
		ElementLocator elementLocator = new ElementLocator();
		elementLocator.getWebElement("id", LoginPageObjects.signInButtonID).click();
	}

	public void validLogin() {
		this.enterUsernamePassword(LoginPageObjects.validUsername, LoginPageObjects.validPassword);
		this.clickLoginButton();
	}
	
	public void invalidUnamePwLogin() {
		this.enterUsernamePassword(LoginPageObjects.invalidUsername, LoginPageObjects.invalidPassword);
		this.clickLoginButton();
	}

	public String getLoginErrorMessage() {
		String errMessage = "";
		ElementLocator elementLocator = new ElementLocator();
		errMessage = elementLocator.getWebElement("class", 
				LoginPageObjects.errorMessageLoginClassName).getText();
		
		return errMessage;
	}
}
