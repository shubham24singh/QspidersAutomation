package com.actitime.TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CutomerModule1 {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open Browser",true);
	}
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("Close Browser",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
	}
	@Test(priority=1,invocationCount =2)
	public void editCustomer() {
	Reporter.log("Edit Customer",true);
	}
	@Test
	public void registerCustomer() {
	Reporter.log("Register Customer",true);
	}
	@Test
	public void deleteCustomer() {
	Reporter.log("Delete Customer",true);
	}
	}


