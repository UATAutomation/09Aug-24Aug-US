package com.agentvarifyingprimaryemail.pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.agentvarifyingprimaryemail.utility.UtilityFile;


public class CreateGMOAgent 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public CreateGMOAgent(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Register as an Agent']")
	WebElement registeragent;
	@FindBy(xpath = "//input[@name='CompanyLegalName']")
	WebElement companyname;
	@FindBy(xpath ="//input[@name='City']") 
	WebElement cityname;
	@FindBy(xpath = "//*[@name='Country']")
	WebElement country;
	@FindBy(xpath = "//*[@name='statusFilter']//input[@aria-label='dropdown search']")
	WebElement countrysearch;
	@FindBy(xpath = "//*[@name='Province']")
	WebElement province;
	@FindBy(xpath = "//*[@name='provinceFilter']//input[@aria-label='dropdown search']")
	WebElement provincesearch;
	
	@FindBy(xpath = "//input[@name='Email']")
	WebElement emailid;
	@FindBy(xpath = "//input[@name='PhoneNo']")
	WebElement phoneno;
	
	@FindBy(xpath = "//input[@name='PrimContName']")
	WebElement contactname;
	@FindBy(xpath = "//input[@name='PrimContEmail']")
	WebElement contactemailid;
	@FindBy(xpath = "//input[@name='PrimContPhoneNo']")
	WebElement contactphonno;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement cheackbox;
	@FindBy(xpath = "//button[text()='Sign Up']")
	WebElement signup;
	
	@FindBy(xpath = "(//button[@type='button'][text()='I want to Signup for GMO'])[2]")
	WebElement agentGMO;
	
	
	public void SignUpPage()
	{
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try 
		{
			
			registeragent.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			exi.executeScript("arguments[0].scrollIntoView();",agentGMO );
			Thread.sleep(2000);
			agentGMO.click();
			Thread.sleep(2000);
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public String AgentField(String nm,String ct,String cnt,String pv,String ml,String ph,String cname,String cmail,String cph)
	{
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try
		{
			String parent=driver.getWindowHandle();
	   		 Set<String>s=driver.getWindowHandles();

	   		 
	   		 Iterator<String> I1= s.iterator();

	   		 while(I1.hasNext())
	   		 {

	   		 String child_window=I1.next();


	   		 if(!parent.equals(child_window))
	   		 {
	   		 driver.switchTo().window(child_window);
	   		Thread.sleep(3000);
	   		companyname.sendKeys(nm);
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			cityname.sendKeys(ct);
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			country.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			countrysearch.sendKeys(cnt);
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			countrysearch.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			province.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			provincesearch.sendKeys(pv);
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			provincesearch.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			emailid.sendKeys(ml);
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			phoneno.sendKeys(ph);
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			contactname.sendKeys(cname);
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			exi=(JavascriptExecutor)driver;
			exi.executeScript("arguments[0].scrollIntoView();",signup );
			Thread.sleep(2000);
			contactemailid.sendKeys(cmail);
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			contactphonno.sendKeys(cph);
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			cheackbox.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			signup.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			UtilityFile.Tab1(driver);
			Thread.sleep(3000);
	   		 System.out.println(driver.switchTo().window(child_window).getTitle());
	   		 driver.close();
	   		 driver.switchTo().window(parent);
	   		Thread.sleep(3000);
	   		UtilityFile.NewTab(driver);
	   		 }
	   		 }
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return cph;
		
	}
	
}
