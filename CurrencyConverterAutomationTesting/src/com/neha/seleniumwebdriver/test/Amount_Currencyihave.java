package com.neha.seleniumwebdriver.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Amount_Currencyihave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open WebSite
		driver.get("https://www1.oanda.com/currency/converter/");
		driver.manage().window().maximize(); 
		
		WebElement amountcurrencyiwant=driver.findElement(By.id("base_amount_input"));
		amountcurrencyiwant.clear();
		
		//amountcurrencyiwant.sendKeys("23232");
		//AmountCurrencyIWant field verification with characters
		//Verify whether the calculation is only done when numeric data is entered
		amountcurrencyiwant.sendKeys("sfsdsf");
		
		System.out.println("Test Passed!");
	}

}
