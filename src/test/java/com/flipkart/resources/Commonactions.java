package com.flipkart.resources;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.stepdefinition.MobileValidationSteps;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	public static WebDriver driver ;
	public void Launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}
	public void inserttext(WebElement ele , String value) {
		ele.sendKeys(value,Keys.ENTER);
		
		
	}
	
	public void windowshandling() {
		String parent= driver.getWindowHandle();
		Set<String>child = driver.getWindowHandles();
		for (String x: child) {
		if(!parent.equals(x)) {
	    driver.switchTo().window(x);
		
		
	}

}}}
