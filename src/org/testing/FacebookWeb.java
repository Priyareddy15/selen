package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookWeb {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTesting\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Create new account']"));
		click.click();
		
		Thread.sleep(2000);
		
		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("Priya");
		
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("Ramkumar");
		
		Thread.sleep(2000);
		
	   WebElement num = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	   num.sendKeys("8220110996");
	   
	   WebElement pass = driver.findElement(By.id("password_step_input"));
	   pass.sendKeys("Priya@123");
	   
	   WebElement date = driver.findElement(By.id("day"));
	   
	   Select s = new Select(date);
	   s.selectByIndex(14);
	  
	   WebElement month = driver.findElement(By.id("month"));
	   
	   Select s1 = new Select(month);
	   s1.selectByVisibleText("Apr");
	   
	   WebElement year = driver.findElement(By.id("year"));
	   
	   Select s2 = new Select(year);
	   s2.selectByValue("1992");
	   
	   WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
	   gender.click();
	   
	   WebElement signup = driver.findElement(By.name("websubmit"));
	   signup.click();
		
	}
	

}
