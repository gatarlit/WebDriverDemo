package pageEvents;

import org.openqa.selenium.WebElement;

import pageObjects.CartPageObjects;
import utilities.ElementLocator;

public class CartPage {

	public String getCartPageTitle() {
		ElementLocator eL = new ElementLocator();
		WebElement we = eL.getWebElement("class", CartPageObjects.cartPageTitleClass);
		return we.getText();
	}

}
