package com.pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/dev/workspace/WebDriverDemo/src/main/webapp/CheckboxTest.html");
		
		WebElement checkbox = driver.findElement(By.id("lettuceCb"));
		checkbox.click();
		
//		for(WebElement checkbox : checkboxes) {
//			if(radioButton.isSelected()) {
//				System.out.println(radioButton.getAttribute("value"));
//			}
//		}
	}

}
