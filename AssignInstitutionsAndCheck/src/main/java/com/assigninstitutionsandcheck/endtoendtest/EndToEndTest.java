package com.assigninstitutionsandcheck.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.assigninstitutionsandcheck.base.Base;
import com.assigninstitutionsandcheck.pom.AssignInstitutions;
import com.assigninstitutionsandcheck.pom.LogInPage;

@Listeners(com.assigninstitutionsandcheck.itestlistener.list.class)

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
	public void AssignGMOInstitutionsField() 
	{
		try 
		{
			AssignInstitutions agi = new AssignInstitutions(driver);
			agi.AssignGMOInstitutions();	
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();	
		}
	}	
	@Test(priority = 2, groups = { "regration" })
	public void AssignAbcodoInstitutionsField() 
	{
		try 
		{
			AssignInstitutions aabi = new AssignInstitutions(driver);
			aabi.AssignAbcodoInstitutions();	
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();	
		}
	}	
	@Test(priority = 3, groups = { "regration" })
	public void CheckPartnertypeColumnField() 
	{
		try 
		{
			AssignInstitutions cpc = new AssignInstitutions(driver);
			cpc.CheckPartnertypeColumn();	
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();	
		}
	}	
	@Test(priority = 4, groups = { "regration" })
	public void CheckedCheckboxAndDeleteInstitutionsField() 
	{
		try 
		{
			AssignInstitutions cbd = new AssignInstitutions(driver);
			cbd.CheckedCheckboxAndDeleteInstitutions();	
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();	
		}
	}	
	
}