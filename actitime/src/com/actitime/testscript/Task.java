package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.genericlibrary.BaseClass;
import com.actitime.genericlibrary.FileLibrary;
import com.actitime.objectrepostitory.HomePage;
import com.actitime.objectrepostitory.TaskPage;

public class Task extends BaseClass{

	@Test
	public void Customer() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getTaskTab().click();
		TaskPage tp=new TaskPage(driver);
		tp.getAddnewbutton().click();
		tp.getNewcust().click();
FileLibrary f=new FileLibrary();
String value = f.ReadDataFromExcel("Sheet1", 1, 1);
tp.getNewname().sendKeys(value);

	}

}
