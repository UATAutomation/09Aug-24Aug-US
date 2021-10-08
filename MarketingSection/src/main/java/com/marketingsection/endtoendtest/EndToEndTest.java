package com.marketingsection.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.marketingsection.base.Base;
import com.marketingsection.pom.LogInPage;
import com.marketingsection.pom.MarketingCalling;

@Listeners(com.marketingsection.itestlistener.list.class)

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
	public void AddingMarketingCalling() 
	{
		try 
		{
			MarketingCalling cc = new MarketingCalling(driver);
			cc.MarketingCallingAdd();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 2, groups = { "regration" })
	public void CheckedMarketingCallingData() 
	{
		try 
		{
			MarketingCalling ecc = new MarketingCalling(driver);
			ecc.CheckedMarketingCallingField();	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}