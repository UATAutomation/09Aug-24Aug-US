package com.agentvarifyingprimaryemail.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.agentvarifyingprimaryemail.base.Base;
import com.agentvarifyingprimaryemail.pom.CreateAbcodoAgent;
import com.agentvarifyingprimaryemail.pom.CreateGMOAgent;
import com.agentvarifyingprimaryemail.pom.MailinatorAge;
import com.agentvarifyingprimaryemail.utility.ConfigFile;


@Listeners(com.agentvarifyingprimaryemail.utility.ListenerClass.class)
public class EndToEndTest extends Base
{
	@BeforeTest(alwaysRun = true)
	public void BrowserFirst() throws Throwable
	{
		try 
		{
		Base base=new Base();
		base.initialization();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 0, groups = { "smoke" })
	public void CreateGMOAgentsInUAT() 
	{
		ConfigFile file = new ConfigFile();
		String[] agent2 = file.getValue("Sheet2", 1);
		CreateGMOAgent cag=new CreateGMOAgent(driver); cag.SignUpPage();
		cag.AgentField(agent2[0],agent2[1],agent2[2],agent2[3],agent2[4],agent2[5],agent2[6],agent2[7],agent2[8]);
	}
	@Test(priority = 1, groups = { "smoke" })
	public void VarifyGMOAgentsEmailInMailinator() 
	{
		MailinatorAge	agmn=new MailinatorAge(driver); 
		agmn.AgentGMOMail();
	}
	@Test(priority = 2, groups = { "regration" })
	public void CreateNONGMOAgentsInUAT()
	{
		ConfigFile file = new ConfigFile();
		String[] agent1 = file.getValue("Sheet3", 1);
		CreateAbcodoAgent caa=new CreateAbcodoAgent(driver);
		caa.SignUpAbcodoPage();
		caa.AgentAbcodoField(agent1[0],agent1[1],agent1[2],agent1[3],agent1[4],agent1[5],agent1[6],agent1[7],agent1[8]);	 
	}
	@Test(priority = 3, groups = { "regration" })
	public void VarifyNONGMOAgentsEmailInMailinator() 
	{
		MailinatorAge	agmn=new MailinatorAge(driver);
		agmn.AgentNonGMOMail();
	}

}
