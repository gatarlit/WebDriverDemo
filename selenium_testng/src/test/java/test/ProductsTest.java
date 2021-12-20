package test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageEvents.CartPage;
import pageEvents.LoginPage;
import pageEvents.MenuPage;
import pageEvents.ProductDetailPage;
import pageEvents.ProductsPage;
import pageObjects.CartPageObjects;
import pageObjects.ProductsPageObjects;
import utilities.UtilityClass;

public class ProductsTest extends BaseTest {
	
	LoginPage loginPage = new LoginPage();
	ProductsPage productsPage = new ProductsPage();
	ProductDetailPage productDetailPage = new ProductDetailPage();
	MenuPage menuPage = new MenuPage();
	UtilityClass util = new UtilityClass();
	CartPage cartPage = new CartPage();
	
	@Test
	public void loadProductsPageTest() {
		loginPage.validLogin();
		int productCount = productsPage.getProductCount();
		String filter = productsPage.getFilterText();
		List<String> productNameList = productsPage.getProductNameList();
		List<String> productDescList = productsPage.getProductDescList();
		List<String> productPriceList = productsPage.getProductPriceList();		
		
		Assert.assertEquals(productCount, 6);
		
		Assert.assertEquals(filter, ProductsPageObjects.filterAZ, "Filter mismatch");
		
		Assert.assertEquals(productNameList, ProductsPageObjects.productNameListExp);
		Assert.assertEquals(productDescList, ProductsPageObjects.productDescListExp);
		Assert.assertEquals(productPriceList, ProductsPageObjects.productPriceListExp);
		
		menuPage.logOut();
	}
	
	@Test
	public void sortProductsZATest() throws InterruptedException {
		loginPage.validLogin();
		
		productsPage.setFilter("Name (Z to A)");
		List<String> productNameList = productsPage.getProductNameList();
		Assert.assertEquals(productNameList, util.reverseSortList(ProductsPageObjects.productNameListExp));
	}

	@Test
	public void sortProductsLoHiTest() throws InterruptedException {
		loginPage.validLogin();

		productsPage.setFilter("Price (low to high)");
		List<String> productPriceList = productsPage.getProductPriceList();
		Assert.assertEquals(productPriceList, util.sortPriceAscList(ProductsPageObjects.productPriceListExp));
	}
	
	@Test
	public void sortProductsHiLoTest() throws InterruptedException {
		loginPage.validLogin();
		
		productsPage.setFilter("Price (high to low)");
		Thread.sleep(5000);
		List<String> productPriceListHiLo = productsPage.getProductPriceList();
		Assert.assertEquals(productPriceListHiLo, util.sortPriceDescList(ProductsPageObjects.productPriceListExp));
	}
	
	@Test
	public void clickProductImageTest() throws InterruptedException {
		loginPage.validLogin();
		
		productsPage.clickProductImage(ProductsPageObjects.imageSrc);
		Assert.assertEquals(true, productDetailPage.getBackToProductsButton());
	}
	
	@Test
	public void clickProductNameTest() throws InterruptedException {
		loginPage.validLogin();
		
		productsPage.clickProductName(ProductsPageObjects.sauceLabsBpID);
		Assert.assertEquals(true, productDetailPage.getBackToProductsButton());
	}
	
	@Test
	public void addToCartTest() throws InterruptedException {
		loginPage.validLogin();
		
		productsPage.addItemToCart(ProductsPageObjects.addSauceLabsBoltTshirtID);
		Assert.assertTrue(util.isDisplayed("id", ProductsPageObjects.removeSauceLabsBoltTshirtID));
		Assert.assertEquals(1, productsPage.getShoppingCartItemCount());
		
		productsPage.addItemToCart(ProductsPageObjects.addSauceLabsBikeLightID);
		Assert.assertTrue(util.isDisplayed("id", ProductsPageObjects.removeSauceLabsBikeLightID));

		Assert.assertEquals(2, productsPage.getShoppingCartItemCount());
	}
	
	@Test
	public void clickShoppingCartContainerTest() throws InterruptedException {
		loginPage.validLogin();
		
		productsPage.addItemToCart(ProductsPageObjects.addSauceLabsBoltTshirtID);
		productsPage.clickShoppingCartContainer();
		Assert.assertEquals(CartPageObjects.cartPageTitle, cartPage.getCartPageTitle());
	}
	
}
