package com.changestudentEmailID.end;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.changestudentEmailID.Base.Base;
import com.changestudentEmailID.Pom.FromStudtEmlField;
import com.changestudentEmailID.Pom.LogInPage;
import com.changestudentEmailID.Pom.StudentEmail;

@Listeners(com.changestudentEmailID.Utility.list.class)
public class EndToEnd extends Base {

	@BeforeTest(alwaysRun = true)
	public void intibase() throws Throwable {

		Base base = new Base();
		base.initialization();

	}

	@Test(priority = 0 , groups= {"sanity"})
	public void login() {

		LogInPage log = new LogInPage(driver);
		log.Logdata(prop.getProperty("em"), prop.getProperty("ps"));

	}

	@Test(priority = 1 , groups= {"sanity"})
	public void StudtEml() throws Throwable {

		StudentEmail se = new StudentEmail(driver);
		se.StudentEmailinstu();

	}

	
	  @Test(priority = 2 , groups= {"smoke"}) public void log() {
	  
	  
	  LogInPage log1 = new LogInPage(driver);
	  log1.Logdata(prop.getProperty("em"),prop.getProperty("ps"));
	  
	  
	  }
	  
	  
	  @Test(priority = 3 , groups= {"smoke"}) public void FromStudtEmlFi() throws Throwable {
	  
	  FromStudtEmlField saw = new FromStudtEmlField(driver);
	  saw.StudentEmailinstu();
	  
	  
	  
	  }
	 
	

	/*
	 * @AfterTest public void quitmethod() {
	 * 
	 * 
	 * 
	 * driver.close();
	 * 
	 * 
	 * }
	 */

}
