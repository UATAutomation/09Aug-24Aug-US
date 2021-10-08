package com.institutionpartnertypecolumn.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.institutionpartnertypecolumn.base.Base;
import com.institutionpartnertypecolumn.pom.InstitutionPartnerTypeColumn;
import com.institutionpartnertypecolumn.pom.LogInPage;


@Listeners(com.institutionpartnertypecolumn.itestlistener.list.class)

public class EndToEndTest extends Base {

	@BeforeTest(alwaysRun = true)

	public void intibase() throws Throwable {
		Base base = new Base();
		base.initialization();
	}


	@Test(priority = 0, groups = { "smoke" })
	public void login() throws Throwable {

		LogInPage log1 = new LogInPage(driver);
		log1.Logdata(prop.getProperty("email"), prop.getProperty("pass"));

	}

	@Test(priority = 1, groups = { "regration" })
	public void CheckInstitutionPartnerTypeColumn() 
	{
		try 
		{
			InstitutionPartnerTypeColumn ipc = new InstitutionPartnerTypeColumn(driver);
			ipc.InstitutionPartnerTypeColumnField();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
}