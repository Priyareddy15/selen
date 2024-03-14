package org.testing;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AutoTesting {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTesting\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.whatsapp.com/");
		
//		driver.manage().window().maximize();
			
//		TakesScreenshot s = (TakesScreenshot)driver;
	     
//		File sourcefile = s.getScreenshotAs(OutputType.FILE);
		
//		File targetfile = new File("C:\\Users\\Lenovo\\Pictures\\Saved Pictures\\whatsapp.jpeg");
		
//        FileHandler.copy(sourcefile, targetfile);
		
		
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement alertok = driver.findElement(By.xpath("//a[@class='analystic'][1]"));
		
		alertok.click();
		
		WebElement alert1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		
		alert1.click();
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		
		WebElement alertokandcancle = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
		alertokandcancle.click();
		
		WebElement alert2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		alert2.click();
		
	   Alert b = driver.switchTo().alert();
	   
	   b.dismiss();
	   
	   WebElement alerttext = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	   
	   alerttext.click();
	   
	   WebElement alert3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	    
		alert3.click();
		
		Alert c = driver.switchTo().alert();
		
		c.sendKeys("text");
		
		c.accept();

		
		
	}
	
	
	
	
	
	
	
	
	
	
}