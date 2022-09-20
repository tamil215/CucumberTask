package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.Commonactions;

public class MobilePageValidation extends Commonactions {

	public MobilePageValidation() {
		PageFactory.initElements(driver	, this);
	}
	@FindBy(name="q")
	private WebElement search;
	@FindBy(xpath="//button[text()='✕']")
	private WebElement closeIcon;
		

}
