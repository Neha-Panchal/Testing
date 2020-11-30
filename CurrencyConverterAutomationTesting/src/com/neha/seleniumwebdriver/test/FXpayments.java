package com.neha.seleniumwebdriver.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FXpayments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www1.oanda.com/currency/converter/");
		driver.manage().window().maximize(); 
		
		//Click on FX payment>FX payments review
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[3]/ul/li[1]/a")).click();
		driver.navigate().back();
		
		//Click on Individual from FX payments
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[3]/ul/li[2]/a")).click();

	}

}
