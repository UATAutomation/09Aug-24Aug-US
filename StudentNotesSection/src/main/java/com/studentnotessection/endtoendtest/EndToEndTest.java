package com.studentnotessection.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.studentnotessection.base.Base;
import com.studentnotessection.pom.LogInPage;
import com.studentnotessection.pom.StudentNotesSection;

@Listeners(com.studentnotessection.itestlistener.list.class)

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
	public void CreateStudentNotes() 
	{
		try 
		{
			StudentNotesSection sn = new StudentNotesSection(driver);
			sn.StudentNotesSectionField();
			sn.NewTabShifting();
			sn.mailinator();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
			
			
		}
	}	
	
}