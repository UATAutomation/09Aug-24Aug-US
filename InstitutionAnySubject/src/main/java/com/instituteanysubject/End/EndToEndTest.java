package com.instituteanysubject.End;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.instituteanysubject.Base.Base;
import com.instituteanysubject.pom.LogInPage;
import com.instituteanysubject.pom.institutionsubject;

@Listeners(com.instituteanysubject.Utility.list.class)

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

	@Test(priority = 1, groups = { "smoke" })
	public void SubjectsField() throws Throwable {
		institutionsubject is = new institutionsubject(driver);
		is.Allsubjects();
		is.Anysubjects();
		
	
	}
}