package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTesting\\driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/www.adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='New User Register Here']"));	
		element.click();
		
		WebElement element2 = driver.findElement(By.name("username"));
		element2.sendKeys("Priyas15");
		
		WebElement element3 = driver.findElement(By.id("password"));
		element3.sendKeys("Priya@15");
		
		WebElement element4 = driver.findElement(By.id("re_password"));
		element4.sendKeys("Priya@15");
		
		WebElement element5 = driver.findElement(By.id("full_name"));
		element5.sendKeys("PriyaRamkumar");
		
		WebElement element6 = driver.findElement(By.id("email_add"));
		element6.sendKeys("priyakirthi92@gmail.com");
				
	}

}
