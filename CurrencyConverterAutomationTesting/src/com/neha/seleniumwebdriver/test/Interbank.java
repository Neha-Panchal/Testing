package com.neha.seleniumwebdriver.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www1.oanda.com/currency/converter/");
		driver.manage().window().maximize(); 
		
        //This field should not accept entered text values
		WebElement interbank1=driver.findElement(By.id("interbank_rates_input"));
		interbank1.clear();
		
		//interbank1.sendKeys("23232");
		interbank1.sendKeys("sfsdsf");
		
		Select interbank= new Select(driver.findElement(By.id("interbank_rates_input")));
		interbank.selectByVisibleText("+/- 2% (Typical ATM rate)");

		driver.findElement(By.xpath("//*[@id=\"end_date_input\"]")).sendKeys("656");
		
	}
	

}
