package com.Agentsignuppage.end;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Agentsignuppage.base.Base;
import com.Agentsignuppage.pom.Agentsignuppage;

@Listeners(com.Agentsignuppage.itest.list.class)

public class end extends Base {

	@Test(priority = 0,  groups= {"sanity"},alwaysRun = true)

	public void intibase() throws Throwable {
		Base base = new Base();
		base.initialization();
	}

	@Test(priority = 1,  groups= {"sanity"})
	public void AddColumnui() throws Throwable {
		Agentsignuppage ac = new Agentsignuppage(driver);
		ac.CreateAgentLink();
		ac.ShiftingTab();
		ac.CreateAgentField();
		
	  
	}

}
