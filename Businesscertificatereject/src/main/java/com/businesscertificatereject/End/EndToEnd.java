package com.businesscertificatereject.End;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.businesscertificatereject.Base.Base;
import com.businesscertificatereject.pom.Bussinesscertificate;
import com.businesscertificatereject.pom.LogInPage;

@Listeners(com.businesscertificatereject.Utility.list.class)
public class EndToEnd extends com.businesscertificatereject.Base.Base {

	@BeforeTest(alwaysRun = true)
	public void intibase() throws Throwable {

		Base base = new Base();
		base.initialization();

	}

	@Test(priority = 1, groups = { "sanity" })
	public void AddPartnertype() {

		LogInPage log = new LogInPage(driver);
		log.Logdata(prop.getProperty("em"), prop.getProperty("ps"));

	}

	@Test(priority = 2, groups = { "sanity" })
	public void AddPartnertype1() throws Throwable {
		Bussinesscertificate bc = new Bussinesscertificate(driver);
		bc.AgentEditField();
		bc.NewTabShifting();
		bc.mailinator();
		bc.rejeccttab();
	}

	/*
	 * @AfterTest public void quitmethod() {
	 * 
	 * driver.close();
	 * 
	 * 
	 * }
	 */

}
