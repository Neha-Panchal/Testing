package com.neha.seleniumwebdriver.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Currencyconverter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www1.oanda.com/currency/converter/");
		driver.manage().window().maximize(); 
		
		//Click on Currency converter
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[2]/ul/li[5]/a")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.navigate().back();
		
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//Click on converter
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[2]/ul/li[1]/a")).click();
		driver.navigate().refresh();
		driver.navigate().back();
		
		//Click on Help
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[2]/ul/li[7]/a")).click();
		driver.navigate().back();
		
		//Click on Embed Converter
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[2]/ul/li[6]/a")).click();
		
	}

}
