package com.flipkart.stepdefinition;

import org.junit.After;
import org.junit.Before;

public class Hooks {
     @Before
	public  void beforeScenario() {
    	 System.out.println("Before Scenario");
	
	}
     @After
 	public  void AfterScenario() {
     	 System.out.println("After Scenario");
     	 driver.quit();
 	
 	}

}
