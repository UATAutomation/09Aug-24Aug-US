package com.Reviewstatusdropdown.end;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Reviewstatusdropdown.base.Base;
import com.Reviewstatusdropdown.pom.LogInPage;
import com.Reviewstatusdropdown.pom.Reviewstatusdropdown;



@Listeners(com.Reviewstatusdropdown.itest.list.class)

public class end extends Base {

	@Test(priority = -1,  groups= {"sanity"},alwaysRun = true)

	public void intibase() throws Throwable {
		Base base = new Base();
		base.initialization();
	}
	@Test(priority = 0,  groups= {"sanity"})
	public void log() {
		
	         LogInPage log = new LogInPage(driver);
			log.Logdata(prop.getProperty("email"), prop.getProperty("pass"));	
	}
	@Test(priority = 1,  groups= {"sanity"})
	public void Unifyusageui() throws Throwable {
		Reviewstatusdropdown rsd = new Reviewstatusdropdown(driver);
		rsd.UnifyusageField();
		   
	}

}
