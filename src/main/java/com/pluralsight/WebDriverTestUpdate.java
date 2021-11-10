package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTestUpdate {

	String test = "abcdeasdsf";
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.name("test"));
		
		System.out.println("aaa");
		System.out.println("again");
		System.out.println("wer");
	}
}
