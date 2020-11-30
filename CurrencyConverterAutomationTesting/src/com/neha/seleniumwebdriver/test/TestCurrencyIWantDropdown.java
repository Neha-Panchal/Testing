package com.neha.seleniumwebdriver.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCurrencyIWantDropdown {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open Google
		driver.get("https://www1.oanda.com/currency/converter/");
		driver.manage().window().maximize(); 
//		driver.wait(100);
//		Select drpCurrencyiwant=new Select(driver.findElement(By.xpath("//*[@id=\"base_currency\"]")));
//		driver.wait(100);
//		drpCurrencyiwant.selectByVisibleText("British Pound");
		
		WebElement selectMyElement = driver.findElement(By.id("base_currency_input")); 
		selectMyElement.getAttribute("British Pound");

		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		
		//Select dropdown = new Select(testDropDown);
	}
	
}
