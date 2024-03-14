package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailWeb {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTesting\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.gmail.com/");
	
	driver.manage().window().maximize();
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
   String title = driver.getTitle();
   System.out.println(title);
   
 WebElement email = driver.findElement(By.id("identifierId"));
 
 email.sendKeys("priya.svkp");
 
 
 
	}
	
	

}
