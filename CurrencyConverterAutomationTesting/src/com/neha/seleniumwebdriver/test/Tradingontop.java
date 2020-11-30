package com.neha.seleniumwebdriver.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tradingontop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www1.oanda.com/currency/converter/");
		driver.manage().window().maximize(); 
		//driver.findElement(By.linkText("Trading")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/nav[2]/ul/li[1]/a")).click();
		
		
		//Verify Trading link on the top
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/nav[2]/ul/li[1]/ul/li[1]/a")).click();//click on trading link
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div[3]/a[1]"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.navigate().back();
		//driver.execute_script("window.history.go(-1)");
        //driver.navigate().to("https://www1.oanda.com/currency/converter/");
        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        
      
       driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/nav/div[4]/div[4]/span")).click();//Click on trading overview
       driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/nav/div[4]/div[4]/div/div/div/div[1]/a")).click();// Click on Learn
       driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/nav/div[4]/div[4]/div/div/div/div[1]/div/div[1]/ul/li[1]/a")).click();//Click on getting started
       
       driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/nav[2]/ul/li[1]/a")).click();//Click on new Oanda
       
        
	   //Back to previous page and again clicking on trading
       //driver.wait(100);
	   driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/nav[2]/ul/li[1]/a")).click();
	   //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	   
	   //Clicking on market
	   driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/nav[2]/ul/li[1]/ul/li[3]/a")).click();//click on market   
	   driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/nav/div[4]/div[4]/span")).click();// Click on Learn
       driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/nav/div[4]/div[4]/div/div/div/div[1]/a")).click();//Click on getting started
       driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/nav/div[4]/div[4]/div/div/div/div[1]/div/div[1]/ul/li[1]/a")).click();//Click on new Oanda
		

		//Clicking on why oanda     
       driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/nav[2]/ul/li[1]/a")).click();     
       driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/nav[2]/ul/li[1]/ul/li[2]/a")).click();     
       driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/nav/div[4]/div[4]/span")).click();// Click on Learn
       driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/nav/div[4]/div[4]/div/div/div/div[1]/a")).click();//Click on getting started    
       driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/nav/div[4]/div[4]/div/div/div/div[1]/div/div[1]/ul/li[1]/a")).click();//Click on new Oanda
     
     //Clicking on Platform
       
       driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[1]/a")).click();
       
       driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[1]/ul/li[4]/a")).click();
       
       
       driver.findElement(By.xpath("//*[@id=\"scroll-wrap\"]/div[4]/div/div[2]/nav/div[4]/div[4]/span/i")).click();
       
       driver.findElement(By.xpath("//*[@id=\"scroll-wrap\"]/div[4]/div/div[2]/nav/div[4]/div[4]/div/div/div/div[1]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"scroll-wrap\"]/div[4]/div/div[2]/nav/div[4]/div[4]/div/div/div/div[1]/div/div[1]/ul/li[1]/a")).click();
    
       //Clicking on Tools
       driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[1]/a")).click();   
       driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/nav[2]/ul/li[1]/ul/li[5]/a")).click();    
       driver.findElement(By.xpath("//*[@id=\"scroll-wrap\"]/div[4]/div/div[2]/nav/div[4]/div[4]/span/i")).click();    
       driver.findElement(By.xpath("//*[@id=\"scroll-wrap\"]/div[4]/div/div[2]/nav/div[4]/div[4]/div/div/div/div[1]/a")).click();     
       driver.findElement(By.xpath("//*[@id=\"scroll-wrap\"]/div[4]/div/div[2]/nav/div[4]/div[4]/div/div/div/div[1]/div/div[1]/ul/li[1]/a")).click();
  	
       //clicking on 
       driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[1]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[1]/ul/li[6]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"scroll-wrap\"]/div[4]/div/div[2]/nav/div[4]/div[4]/span/i")).click();     
       driver.findElement(By.xpath("//*[@id=\"scroll-wrap\"]/div[4]/div/div[2]/nav/div[4]/div[4]/div/div/div/div[1]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"scroll-wrap\"]/div[4]/div/div[2]/nav/div[4]/div[4]/div/div/div/div[1]/div/div[1]/ul/li[1]/a")).click();
       
       //clicking on Analysis
       driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[1]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[1]/ul/li[6]/a")).click();
       
       //driver.wait(50);
       driver.findElement(By.xpath("//*[@id=\"ia\"]/ul/li[1]/a")).click();
      
	}

}
