package com.ctt.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ctt.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="(//div[@class='MuiTypography-root MuiTypography-subtitle2 MuiTypography-noWrap css-1dqgwp4'])[1]")
	WebElement loginPersonName;
	
	public String getUserNameText() {
		String displayName = loginPersonName.getText();
		System.out.println("Login Person Name: " + displayName);
		return displayName;
	}
	
}
