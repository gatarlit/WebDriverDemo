package test;

import org.testng.annotations.Test;

import pageEvents.HomePage;

public class LoginTest extends BaseTest{

	@Test
	public void ClickLoginButon() {
		HomePage homePage = new HomePage();

		homePage.clickLoginButton();

	}

}
