package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ema = driver.findElement(By.id("email"));
		ema.sendKeys("dev");
		WebElement pas = driver.findElement(By.id("pass"));
		pas.sendKeys("Gop");
		
		
		
	}

}
