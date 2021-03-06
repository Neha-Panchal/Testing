package com.neha.seleniumwebdriver.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  

public class RadioButtonTest {

	    public static void main(String[] args) {  
	          
	    	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe"); 
	        WebDriver driver = new ChromeDriver(); 
	        
			driver.get("https://www1.oanda.com/currency/converter/");
			driver.manage().window().maximize();
			
	        WebElement radio1 = driver.findElement(By.id("range30"));							
	        WebElement radio2 = driver.findElement(By.id("range60"));
	        WebElement radio3 = driver.findElement(By.id("range90"));
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver; 
	        //Radio Button1 is selected by default		
	        //radio1.click();			
	        //System.out.println("Radio Button Option 1 Selected");					
	        js.executeScript("arguments[0].scrollIntoView();", radio2);
	        //Radio Button1 is de-selected and Radio Button2 is selected		
	        radio2.click();			
	        //System.out.println("Radio Button Option 2 Selected");
	        boolean select = radio2.isSelected();
	        System.out.print(select);
	       
	        // performing click operation if element is not already selected
	        if (select == false) {
	        	radio2.click();
	        }
	        
	        //Radio Button2 is de-selected and Radio Button3 is selected		
	        radio3.click();			
	        System.out.println("Radio Button Option 3 Selected");	
	        	        
	        }  	  
}
