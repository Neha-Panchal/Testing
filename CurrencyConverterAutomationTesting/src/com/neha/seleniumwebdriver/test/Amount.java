package com.neha.seleniumwebdriver.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class Amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open WebSite
		driver.get("https://www1.oanda.com/currency/converter/");
		driver.manage().window().maximize(); 
		
		WebElement amount=driver.findElement(By.id("quote_amount_input"));
		amount.clear();//amountthatihave
		
		//Validate the currency conversion
		amount.sendKeys("23232");
		//amount.sendKeys("sfsdsf");
		
		System.out.println("Test Passed!");
	
	}

}
