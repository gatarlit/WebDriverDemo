package test;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageEvents.LoginPage;
import pageEvents.ProductsPage;
import pageObjects.LoginPageObjects;
import pageObjects.ProductsPageObjects;
import utilities.ElementLocator;

public class LoginTest extends BaseTest {
	
	LoginPage loginPage = new LoginPage();
	ProductsPage productsPage = new ProductsPage();

	@Test
	public  void loginSuccessfulTest() {		
		loginPage.validLogin();
		String actProductTitle = productsPage.getProductTitle();
		Assert.assertEquals(actProductTitle, ProductsPageObjects.productTitle);
	}

	@Test
	public  void loginFailTest() {		
		loginPage.invalidUnamePwLogin();
		String actLoginErrorMessage = loginPage.getLoginErrorMessage();
		Assert.assertEquals(actLoginErrorMessage, LoginPageObjects.ERROR_LOGIN);
	}
}
