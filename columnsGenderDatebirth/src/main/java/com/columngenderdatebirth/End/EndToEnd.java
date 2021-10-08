package com.columngenderdatebirth.End;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.columngenderdatebirth.Base.Base;
import com.columngenderdatebirth.pom.AgentGnderdtbrh;
import com.columngenderdatebirth.pom.GenderDatebirth;
import com.columngenderdatebirth.pom.LogInPage;


@Listeners(com.columngenderdatebirth.Utility.list.class)
public class EndToEnd  extends Base{
	
	
	
	@BeforeTest(alwaysRun = true)
	public void intibase() throws Throwable {
	
			

			Base base=new Base();
			base.initialization();
			
		
	}
	
	@Test(priority = 0,  groups= {"sanity"})
	public void loginn() {
	
			
			LogInPage log = new LogInPage(driver);
			log.Logdata(prop.getProperty("em"), prop.getProperty("ps"));
			 
			
		
	}
	@Test(priority = 1,  groups= {"sanity"})
	public void ColumnDate() throws Throwable 
	{
		GenderDatebirth gd = new GenderDatebirth(driver);
		gd.columngendr();
			
		
		}

	@Test(priority = 2,  groups= {"smoke"})
	public void logi() {
	
			
			LogInPage log = new LogInPage(driver);
			log.Logdata(prop.getProperty("email"), prop.getProperty("pass"));
			 
	}
	@Test(priority = 3,  groups= {"smoke"})
	public void AgentColumnDate() throws Throwable 
	{
		AgentGnderdtbrh agd = new AgentGnderdtbrh(driver);
		agd.Agentcolumngendr();
			
		
		}
		/*
		 * @AfterTest(alwaysRun = true) public void close() throws Throwable {
		 * 
		 * driver.close(); }
		 */
	}
