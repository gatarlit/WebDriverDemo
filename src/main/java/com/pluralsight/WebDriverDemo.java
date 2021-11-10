package com.pluralsight;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDemo {

    public static void main(String[] args) throws MalformedURLException {
        //System.setProperty("webdriver.chrome.driver","../chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        //driver.get("https://www.pluralsight.com");
    	
//    	ChromeOptions chromeOptions = new ChromeOptions();
//    	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4443/wd/hub"), chromeOptions);
    	
//    	DesiredCapabilities capability = DesiredCapabilities.chrome();
//    	capability.setBrowserName("chrome");
//    	capability.setPlatform(Platform.WINDOWS);
//    	WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.106:4444/wd/hub"), capability);
    	
        driver.get("http://www.google.com"); //update
        
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("pluralsight");
        searchField.sendKeys(Keys.ENTER);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
        
        //WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        imagesLink.click();
        
        WebElement imageElelment = driver.findElement(By.cssSelector("img[class='rg_i Q4LuWd']"));
        imageElelment.click();
        
        driver.getPageSource().contains("Some text");
        		
        //driver.quit();
    }
}
