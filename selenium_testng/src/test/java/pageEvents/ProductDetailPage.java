package pageEvents;

import org.openqa.selenium.WebElement;

import pageObjects.ProductDetailPageObjects;
import utilities.ElementLocator;

public class ProductDetailPage {

	public boolean getBackToProductsButton() {
		ElementLocator eL = new ElementLocator();
		WebElement we = eL.getWebElement("id", ProductDetailPageObjects.backToProductsID);
		return null != we;
	}

}
