package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWeb {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTesting\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("nav-link-accountList"));
		
		element.click();
		
		WebElement newacc = driver.findElement(By.id("createAccountSubmit"));
		
		newacc.click();
	
		WebElement name = driver.findElement(By.name("customerName"));
	
		name.sendKeys("Priya");
		
		WebElement email = driver.findElement(By.name("email"));
	
		email.sendKeys("priya.svkp@gmail.com");
		
		WebElement pass = driver.findElement(By.name("password"));
		
		pass.sendKeys("priyaram");
		
	    WebElement check = driver.findElement(By.name("passwordCheck"));
		
		check.sendKeys("priyaram");
		
		WebElement click = driver.findElement(By.id("continue"));
			
		click.click();
		

	
		
	}

}
