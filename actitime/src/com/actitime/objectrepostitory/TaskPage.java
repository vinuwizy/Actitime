package com.actitime.objectrepostitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	//declaration
	@FindBy(id="container_tasks")
	private WebElement clicktask;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbutton;
	
	@FindBy(xpath ="//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement newname;
	
	@FindBy(xpath ="//textarea[@placeholder='Enter Customer Description']")
	private WebElement newdescription;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement newcreate;
	
	@FindBy(xpath ="//div[@class='greyButton cancelBtn']")
	private WebElement newcancel;
	
	//intialization
	public TaskPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	//utilization

	public WebElement getClicktask() {
		return clicktask;
	}

	public WebElement getAddnewbutton() {
		return addnewbutton;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getNewname() {
		return newname;
	}

	public WebElement getNewdescription() {
		return newdescription;
	}

	public WebElement getNewcreate() {
		return newcreate;
	}

	public WebElement getNewcancel() {
		return newcancel;
	}
}
	
	


