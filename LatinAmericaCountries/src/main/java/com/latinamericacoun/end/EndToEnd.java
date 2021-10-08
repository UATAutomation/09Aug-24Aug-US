package com.latinamericacoun.end;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.latinamericacoun.Base.Base;
import com.latinamericacoun.pom.LogInPage;
import com.latinamericacoun.pom.latincount;

@Listeners(com.latinamericacoun.utility.list.class)

public class EndToEnd extends Base{
	
	
	
@BeforeTest(alwaysRun = true)

public void intibase() throws Throwable {
	Base base=new Base();
	base.initialization();
	}

@Test(priority = 0,  groups= {"sanity"})
public void log() {
	
         LogInPage log = new LogInPage(driver);
         log.Logdata(prop.getProperty("email"), prop.getProperty("pass"));	
}	

@Test(priority = 1,  groups= {"sanity"})
public void latincnt() throws Throwable 
{
	  latincount lc = new latincount(driver);
	   lc.assignaplicanumber();
	   lc.NewTabShifting();
			
}	

@Test(priority = 2,  groups= {"smoke"})
public void login() {
	
         LogInPage log1 = new LogInPage(driver);
         log1.Logdata(prop.getProperty("em"), prop.getProperty("ps")); 
}		
	

@Test(priority = 3,  groups= {"smoke"})
public void assapplinumbr() {
	
	  latincount lc1 = new latincount(driver);
	   lc1.assignaplicanumberAgent();
}		
				




			
		}
