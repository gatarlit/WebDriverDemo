package com.pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/dev/workspace/WebDriverDemo/src/main/webapp/TableTest.html");
		
		WebElement outerTable = driver.findElement(By.tagName("table"));
		System.out.println((outerTable.findElement(By.tagName("td")).getText()));
		WebElement innerTable = outerTable.findElement(By.tagName("table"));
		List<WebElement> rows = innerTable.findElements(By.tagName("td"));
		System.out.println(rows.size());
		for(int i=0; i< rows.size(); i++) {
			System.out.println("text" + rows.get(i).getText());	
		}
		
		WebElement xrow = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
		System.out.println("xpath" + xrow.getText());	
	}

}
