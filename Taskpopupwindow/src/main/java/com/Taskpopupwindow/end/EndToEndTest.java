package com.Taskpopupwindow.end;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Taskpopupwindow.base.Base;
import com.Taskpopupwindow.pom.LogInPage;
import com.Taskpopupwindow.pom.Taskui;


@Listeners(com.Taskpopupwindow.utility.list.class)

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
	public void Tasksui() throws Throwable {

		Taskui tu = new Taskui(driver);
		tu.Taskkfield();

	}
}