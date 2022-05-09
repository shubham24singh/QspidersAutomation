package com.actitime.TestNG;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClassWithGroups;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule extends BaseClass {
	@Test
	public void createProject() {
	 Reporter.log("Create Project",true);
	}
	@Test
	public void modifyProject() {
	 Reporter.log("Modify Project",true);
	}
	@Test
	public void deleteProject() {
	 Reporter.log("Delete Project",true);
	}
}
