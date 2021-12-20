package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.BaseTest;

public class ElementLocator {

	//get single web element
	public WebElement getWebElement(String type, String value) {
		WebElement element = null;
		switch (type) {
			
		case "id":
			element = BaseTest.driver.findElement(By.id(value));
			break;
		case "className":
		case "class":
			element = BaseTest.driver.findElement(By.className(value));
			break;
		case "xpath":
			element = BaseTest.driver.findElement(By.xpath(value));
			break;
		case "css":
			element = BaseTest.driver.findElement(By.cssSelector(value));
			break;
		}
		return element;
	}
	
	//get list or group of elements
	public List<WebElement> getListWebElement(String type, String value) {
		
		List<WebElement> webElementList = null;
		switch (type) {
			
		case "id":
			webElementList = BaseTest.driver.findElements(By.id(value));
			break;
		case "className":
		case "class":
			webElementList = BaseTest.driver.findElements(By.className(value));
			break;
		case "xpath":
			webElementList = BaseTest.driver.findElements(By.xpath(value));
			break;
		case "css":
			webElementList = BaseTest.driver.findElements(By.cssSelector(value));
			break;
		}
		return webElementList;
	}
}
