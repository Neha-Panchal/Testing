package com.neha.seleniumwebdriver.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCurrencyIHaveDropdown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www1.oanda.com/currency/converter/");
		driver.manage().window().maximize(); 
		
//		Select drpCurrencyihave=new Select(driver.findElement(By.className("currency_selector")));
//		drpCurrencyihave.selectByVisibleText("Euro");
		
		WebElement selectMyElement = driver.findElement(By.id("quote_currency_input")); 
		selectMyElement.click();

		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
	}
	

}
