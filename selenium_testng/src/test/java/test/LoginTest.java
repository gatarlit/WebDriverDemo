package test;

import org.testng.annotations.Test;

import pageEvents.HomePage;

public class LoginTest extends BaseTest{

	@Test
	public void Login() {
		HomePage homePage = new HomePage();
		
		homePage.enterUsernamePassword("standard_user", "secret_sauce1");
		homePage.clickLoginButton();
		
		//Assert.ass

	}

}
