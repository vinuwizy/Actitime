package com.actitime.objectrepostitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
	@FindBy(id="container_tasks")
	private WebElement taskTab;
	
	@FindBy(id="container_reports")
	private WebElement reportTab;
	
	@FindBy(id="conatiner_users")
	private WebElement usertab;
	
	@FindBy(id="logoutLink")
	private WebElement logoutTab;
	
	//intialization
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	
	public WebElement getTaskTab() {
		return taskTab;
	}

	public WebElement getReportTab() {
		return reportTab;
	}

	public WebElement getUsertab() {
		return usertab;
	}

	public WebElement getLogoutTab() {
		return logoutTab;
	}
	
	
	

}
