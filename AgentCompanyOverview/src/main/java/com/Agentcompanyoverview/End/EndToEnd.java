 package com.Agentcompanyoverview.End;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Agentcompanyoverview.Base.Base;
import com.Agentcompanyoverview.pom.Companyoverview;
import com.Agentcompanyoverview.pom.LogInPage;

@Listeners(com.Agentcompanyoverview.Utility.list.class)
public class EndToEnd extends Base {
	
	@BeforeTest
	public void intibase() {
		try {
			

			Base base=new Base();
			base.initialization();
			
		} catch (Throwable e) {
			
		}
	}
	
	@Test(priority = 1)
	public void login() {
		
			
			LogInPage log = new LogInPage(driver);
			log.Logdata(prop.getProperty("em"), prop.getProperty("ps"));
		}
	
	@Test(priority = 2)
	public void fourthlinecompany() throws Throwable {
		Companyoverview co = new Companyoverview(driver);
		co.fourthoverview();
		
	}
		
	
	
	  @AfterTest public void quitmethod() { try {
	  
	  
	  driver.close();
	  
	  } catch (Throwable e) {
	  
	  } }
	 
	
}
