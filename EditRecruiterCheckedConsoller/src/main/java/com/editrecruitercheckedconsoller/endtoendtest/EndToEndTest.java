package com.editrecruitercheckedconsoller.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.editrecruitercheckedconsoller.base.Base;
import com.editrecruitercheckedconsoller.pom.CheckedConsoller;
import com.editrecruitercheckedconsoller.pom.LogInPage;

@Listeners(com.editrecruitercheckedconsoller.itestlistener.list.class)

public class EndToEndTest extends Base 
{
	@BeforeTest(alwaysRun = true)
	public void intibase() 
	{
		try 
		{
			Base base = new Base();
			base.initialization();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 0, groups = { "smoke" })
	public void login()
	{
		try 
		{
			LogInPage log1 = new LogInPage(driver);
			log1.Logdata(prop.getProperty("email"), prop.getProperty("pass"));
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 1, groups = { "regration" })
	public void CheckedConsollerData() 
	{
		try 
		{
			CheckedConsoller cc = new CheckedConsoller(driver);
			cc.CheckedConsollerField();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 2, groups = { "regration" })
	public void EditCheckedConsollerData() 
	{
		try 
		{
			CheckedConsoller ecc = new CheckedConsoller(driver);
			ecc.EditCheckedConsollerField();	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}