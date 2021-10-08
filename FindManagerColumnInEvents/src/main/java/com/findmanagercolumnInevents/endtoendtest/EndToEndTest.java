package com.findmanagercolumnInevents.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.findmanagercolumnInevents.base.Base;
import com.findmanagercolumnInevents.pom.FindManagerColumn;
import com.findmanagercolumnInevents.pom.LogInPage;


@Listeners(com.findmanagercolumnInevents.itestlistener.ListenerClass.class)
public class EndToEndTest extends Base
{
	@BeforeTest(alwaysRun = true)
	public void BrowserFirst() throws Throwable
	{
		try 
		{
		Base base=new Base();
		base.initialization();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 0, groups = { "smoke" })
	public void LoginMSMUnifyTeam() 
	{
		LogInPage log=new LogInPage(driver);
		log.Logdata(prop.getProperty("email"), prop.getProperty("pass"));
		
	}
	@Test(priority = 1, groups = { "regration" })
	public void FindManagerColumnInEvents() 
	{
		FindManagerColumn fmcln=new FindManagerColumn(driver);
		fmcln.FindManagerColumnFields();
	}
}
