package com.actitime.TestNG;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClassWithGroups;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportModule extends BaseClass {
	@Test 
	public void createReport() {
	 Reporter.log("Create Report",true);
	}
	@Test
	public void modifyReport() {
	 Reporter.log("Modify Report",true);
	}
	@Test
	public void deleteReport() {
	 Reporter.log("Delete Report",true);
	}
}
