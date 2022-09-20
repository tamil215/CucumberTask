package com.flipkart.stepdefinition;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.MobilePageValidation;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileValidationSteps extends Commonactions {
	static WebDriver driver;
	Commonactions c = new Commonactions();
	MobilePageValidation m = new MobilePageValidation();
	By search1 = By.name("q");
	
	
	@Given("User launches flipkart application")
	    public void user_launches_flipkart_application() throws Throwable {	    
		c.Launch();		    
	}

	@Given("User handles login")
	    public void user_handles_login() {
		try {
		
		m.getcloseIcon.isDisplayed();
		m.getcloseIcon. Xbutton.click();
		}catch (Exception e) {
			
	    System.out.println("Login is not required");
		}
	  
	}
	    String name = "";
	    @When("User search mobile ")
	    public void user_search_mobile() {
		name = "realme";
		
		c.inserttext(m.getSearch(), name);
		//search.sendKeys(name,Keys.ENTER);
	}	

	    @When("User search mobile {string}")
	    public void user_search_mobile(String mobile) {
		name = mobile;
		WebElement search = driver.findElement(By.name("q"));
		//search.sendKeys(name,Keys.ENTER);
		c.inserttext(m.getSearch(), mobile); 
	}
	    @When("User select the mobile and click add to cart")
	    public void user_select_the_mobile_and_click_add_to_cart()  throws Exception{
	  	
		String parent= driver.getWindowHandle();
		Set<String>child = driver.getWindowHandles();
		for (String x: child) {
		if(!parent.equals(x)) {
		driver.switchTo().window(x);
		 
	   
		}			
		}		
		WebElement mobileName = driver.findElement(By.xpath("//div[contains(text(),'"+name+"')])[2]"));
		mobileName.click();
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
		addtocart.click();		
		}
	    @When("User doing the payment") 
	//screenshot
	public void user_doing_the_payment()  throws Exception{
		TakesScreenshot tk =(TakesScreenshot)driver;
		File source =tk.getScreenshotAs(OutputType.FILE);
		File target= new File(":\\Users\\Admin\\eclipse-workspace\\Cucumber-Sep\\src\\test\\resources\\scrrenshot\\Addtocart.png");
		FileUtils.copyFile(source, target);
	    }

	    @Then("User receive the confirmation message")
 	public void user_receive_the_confirmation_message() {
	//scrolldown
		JavascriptExecutor j =(JavascriptExecutor)driver; 
		 WebElement down = driver.findElement(By.linkText("Security"));
		 j.executeScript("arguments[0].scrollIntoView(true)", down);
				 
}		
	
@When("User search mobile by using oneD list")
    public void user_search_mobile_by_using_oneD_list(DataTable dataTable) {
	List<String> datas = dataTable.asList();
	name= datas.get(1);
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys(name,Keys.ENTER);   
}
     @When("User search mobile by using oneD map")
    public void user_search_mobile_by_using_oneD_map(DataTable dataTable) {
     Map<String,String> datas= dataTable.asMap(String.class, String.class);
     name= datas.get('C');
	  WebElement search = driver.findElement(By.name("q"));
	  search.sendKeys(name,Keys.ENTER);
	  driver.quit();
}}
