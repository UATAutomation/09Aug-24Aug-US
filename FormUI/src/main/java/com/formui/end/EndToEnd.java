package com.formui.end;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.formui.Base.Base;
import com.formui.pom.AppFormUi;
import com.formui.pom.LogInPage;



@Listeners(com.formui.utility.list.class)
public class EndToEnd extends Base {
	
	@BeforeTest(alwaysRun = true)

	public void intibase() throws Throwable {
		Base base=new Base();
		base.initialization();
		}

	@Test(priority = 0,  groups= {"sanity"})
	public void log() {
		
	         LogInPage log = new LogInPage(driver);
			log.Logdata(prop.getProperty("em"), prop.getProperty("ps"));	
	}

	@Test(priority = 1,  groups= {"sanity"})
	public void All() throws Throwable {
		AppFormUi af = new AppFormUi(driver);
		af.FormuiField();
		
		    
	}
	

	
	/*
	 * @AfterTest(alwaysRun = true) public void quit() {
	 * 
	 * driver.quit(); }
	 */
	
	
	
	

}
