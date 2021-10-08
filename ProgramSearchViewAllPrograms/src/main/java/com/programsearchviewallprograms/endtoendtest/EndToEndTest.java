package com.programsearchviewallprograms.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.programsearchviewallprograms.base.Base;
import com.programsearchviewallprograms.pom.LogInPage;
import com.programsearchviewallprograms.pom.SelectGMOAbcodoViewPrograms;

@Listeners(com.programsearchviewallprograms.itestlistener.list.class)

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
	public void SelectGMOAbcodoViewAllPrograms() 
	{
		try 
		{
			SelectGMOAbcodoViewPrograms sn = new SelectGMOAbcodoViewPrograms(driver);
			sn.SelectGMOAbcodoViewProgramsField();
			
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
			
			
		}
	}	
	
}