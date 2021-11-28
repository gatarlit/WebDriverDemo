package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.BaseTest;

public class ElementLocator {

	//get single web element
	public WebElement getWebElement(String type, String value) {
		switch (type) {
			
		case "id":
			return BaseTest.driver.findElement(By.id(value));
		//testRyan
		case "class":
			return BaseTest.driver.findElement(By.className(value));
		case "xpath":
			return BaseTest.driver.findElement(By.xpath(value));
		case "css":
			return BaseTest.driver.findElement(By.cssSelector(value));
		default:
			return null;
		}
	}
	
	//get list or group of elements
	public List<WebElement> getListWebElement(String type, String value) {
		switch (type) {
			
		case "id":
			return BaseTest.driver.findElements(By.id(value));
		case "class":
			return BaseTest.driver.findElements(By.className(value));
		case "xpath":
			return BaseTest.driver.findElements(By.xpath(value));
		case "css":
			return BaseTest.driver.findElements(By.cssSelector(value));
		default:
			return null;
		}
	}
}
