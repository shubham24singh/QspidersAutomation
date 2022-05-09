package com.actitime.TestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;

@Listeners(com.actitime.generic.ListenersImplementation.class)
public class CustomerModule extends BaseClass {
@Test
public void createCustomer() throws InterruptedException {
 Reporter.log("Create Customer",true);
 Thread.sleep(2000);
 Assert.fail();
}

}
