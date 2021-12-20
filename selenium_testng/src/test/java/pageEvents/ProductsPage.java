package pageEvents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.ProductsPageObjects;
import utilities.ElementLocator;
import utilities.UtilityClass;


public class ProductsPage {
	
//	public List sortProduct(List list, String sortType) {
//		List prodList = null;
//		if (sortType == "za") {
//			prodList = ProductsPageObjects.productListNameExp;
//			prodList.sort(Collections.reverseOrder());
//		} else if (sortType == "lohi") {
//			//TODO
//			prodList = ProductsPageObjects.productListPriceExp;
//			prodList.sort(Collections.reverseOrder());
//		} else if (sortType == "hilo") {
//			//TODO
//			prodList = ProductsPageObjects.productListPriceExp;
//			prodList.sort(Collections.reverseOrder());
//		}
//		return prodList;
//	}

	public String getFilterText() throws NullPointerException {
		ElementLocator eL = new ElementLocator();
		WebElement filter = eL.getWebElement("class", ProductsPageObjects.filterClassName);

		return filter.getText();
	}

	public String getProductTitle() {
		ElementLocator eL = new ElementLocator();
		WebElement prodTitleElement = eL.getWebElement("class",ProductsPageObjects.productTitleClassName);
		return prodTitleElement.getText();
	}

	public int getProductCount() {
		ElementLocator eL = new ElementLocator();
		List<WebElement> productList = eL.getListWebElement("class", "inventory_item");
		return productList.size();
	}

	public List<String> getProductNameList() {
		ElementLocator eL = new ElementLocator();
		List<WebElement> productList = eL.getListWebElement("class", "inventory_item_name");
		UtilityClass util = new UtilityClass();
		List<String> productNameList = util.webElementTextListToList(productList);
		return productNameList;
	}
	
	public List<String> getProductDescList() {
		ElementLocator eL = new ElementLocator();
		List<WebElement> productList = eL.getListWebElement("class", "inventory_item_desc");
		UtilityClass util = new UtilityClass();
		List<String> productDescList = util.webElementTextListToList(productList); 	 
		return productDescList;
	}
	
	public List<String> getProductPriceList() {
		ElementLocator eL = new ElementLocator();
		List<WebElement> productList = eL.getListWebElement("class", "inventory_item_price");
		UtilityClass util = new UtilityClass();
		List<String> productPriceList = util.webElementTextListToList(productList); 	 
		return productPriceList;
	}

	public void setFilter(String filter) {
		ElementLocator eL = new ElementLocator();
		WebElement sortElementContainer = eL.getWebElement("class", "product_sort_container");
		Select sortDropdown = new Select(sortElementContainer);
		sortDropdown.selectByVisibleText(filter);
	}

	public void addItemToCart(String addProductID) {
		ElementLocator eL = new ElementLocator();
		eL.getWebElement("id", addProductID).click();
	}

	public int getShoppingCartItemCount() {
		ElementLocator eL = new ElementLocator();	
		String count = eL.getWebElement("class", ProductsPageObjects.shoppingCartBadgeClass).getText();
		return Integer.parseInt(count);
	}

	public void clickProductImage(String imgSrc) {
		ElementLocator eL = new ElementLocator();
		eL.getWebElement("xpath", "//img[contains(@src,'"+ imgSrc +"')]").click();	
	}
	
	public void clickProductName(String productNameID) {
		ElementLocator eL = new ElementLocator();
		eL.getWebElement("id", ProductsPageObjects.sauceLabsBpID).click();
	}

	public void clickShoppingCartContainer() {
		ElementLocator eL = new ElementLocator();
		eL.getWebElement("id", ProductsPageObjects.shoppingCartContainerID).click();
	}

	

	

}
