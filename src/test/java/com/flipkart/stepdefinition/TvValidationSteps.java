package com.flipkart.stepdefinition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.When;

public class TvValidationSteps extends Commonactions {
	Commonactions c = new Commonactions();
	
	String name = "";
    @When("User search Tv ")
    public void user_search_mobile() {
	name = "realme";
	WebElement search = MobileValidationSteps.driver.findElement(By.name("q"));
	c.inserttext(search, name);

	//search.sendKeys(name,Keys.ENTER);
}	
    @When("User search Tv {string}")
    public void user_search_mobile(String mobile) {
	name = mobile;
	WebElement search = MobileValidationSteps.driver.findElement(By.name("q"));
	search.sendKeys(name,Keys.ENTER);
	
}
    @When("User select the mobile and click add to cart")
    public void user_select_the_mobile_and_click_add_to_cart()  throws Exception{  	
    	c.windowshandling();
	WebElement mobileName = MobileValidationSteps.driver.findElement(By.xpath("//div[contains(text(),'"+name+"')])[2]"));
	mobileName.click();
	
	WebElement addtocart = MobileValidationSteps.driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
	addtocart.click();		
	}{
   
				    

}}
