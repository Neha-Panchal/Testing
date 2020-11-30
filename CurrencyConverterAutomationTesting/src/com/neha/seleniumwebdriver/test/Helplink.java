package com.neha.seleniumwebdriver.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helplink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
			
		driver.get("https://www1.oanda.com/currency/converter/");
		driver.manage().window().maximize(); 
			
		WebElement Element = driver.findElement(By.linkText("HELP"));
	
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		//driver.findElement(By.xpath("//a[@href='/help/how-to-use-currency-converter']")).click();
		//driver.findElement(By.linkText("HELP")).click();
		//new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("HELP"))).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[2]/div[2]/div/div[1]/div[3]/span[2]/a/span[1]")).click();
	
	}
	
}


