package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreenTech {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTesting\\driver\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.greenstechnologies.in/");
        
        driver.manage().window().maximize();
        
        Actions w = new Actions(driver);
       WebElement mouceact = driver.findElement(By.xpath("//strong[text()='Courses']"));
       w.moveToElement(mouceact).perform();
          
	}

}
 