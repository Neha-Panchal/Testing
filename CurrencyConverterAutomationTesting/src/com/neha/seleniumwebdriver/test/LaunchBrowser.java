package com.neha.seleniumwebdriver.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open WebSite
		driver.get("https://www1.oanda.com/currency/converter/");
		driver.manage().window().maximize(); 
		
		String baseUrl = "https://www.oanda.com/currency/converter/ ";
        String expectedTitle ="Currency Converter | Foreign Exchange Rates | OANDA";
        String actualTitle = "";
        
        //get the actual value of the title
        actualTitle = driver.getTitle();
        
        //print test results
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

	      
	}
}


