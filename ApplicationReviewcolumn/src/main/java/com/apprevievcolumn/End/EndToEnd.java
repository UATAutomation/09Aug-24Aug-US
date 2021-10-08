package com.apprevievcolumn.End;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.apprevievcolumn.Base.Base;
import com.apprevievcolumn.Pom.Appreviewstau;
import com.apprevievcolumn.Pom.LogInPage;


@Listeners(com.apprevievcolumn.Utility.list.class)
public class EndToEnd  extends Base{
	
	
	
	@BeforeTest(alwaysRun = true)
	public void intibase() throws Throwable {
	
			

			Base base=new Base();
			base.initialization();
			
		
	}
	
	@Test(priority = 1,  groups= {"sanity"})
	public void login() {
	
			
			LogInPage log = new LogInPage(driver);
			log.Logdata(prop.getProperty("em"), prop.getProperty("ps"));
			 
			
		
	}
	@Test(priority = 2,  groups= {"sanity"})
	public void AppliReviewdrop() throws Throwable 
	{
		Appreviewstau av= new Appreviewstau(driver);
		av.Appreviewstatus();
		
		}
	
		/*
		 * @AfterTest(alwaysRun = true) public void close() throws Throwable {
		 * 
		 * 
		 * 
		 * driver.close();
		 * 
		 * }
		 */
	}
