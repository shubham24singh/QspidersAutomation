package com.actitime.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule  {
	@Test(groups= {"smoke test","regression test"})
	public void createTask() {
	 Reporter.log("Create Task",true);
	}
	@Test(groups="regression test")
	public void modifyTask() {
	 Reporter.log("Modify Task",true);
	}
	@Test(groups="regression test")
	public void deleteTask() {
	 Reporter.log("Delete Task",true);
	}
}
