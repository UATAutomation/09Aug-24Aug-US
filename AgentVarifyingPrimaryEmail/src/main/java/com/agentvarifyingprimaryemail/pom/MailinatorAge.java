package com.agentvarifyingprimaryemail.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agentvarifyingprimaryemail.base.Base;
import com.agentvarifyingprimaryemail.utility.UtilityFile;

public class MailinatorAge extends Base
{
	WebDriver driver;
	JavascriptExecutor exi;
	Actions a;
	public  MailinatorAge(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@aria-label='Request a Free Trial Today'])[3]")
	WebElement trial;
	@FindBy(xpath = "(//button[@aria-label='Close'])[2]")
	WebElement close;
	@FindBy(xpath = "(//input[@class='primary-input'])[1]")
	WebElement input;
	@FindBy(xpath = "//button[@class='primary-btn']")
	WebElement go;
	@FindBy(xpath = "//tr[@ng-repeat='email in emails']")
	WebElement clickmail;
	@FindBy(xpath = "//a[@onclick='loadInboxFromUrlQuery();']")
	WebElement mailback;
	
	public void AgentGMOMail()
	{
		a=new Actions(driver);
		try {
			trial.click();
			Thread.sleep(2000);
			close.click();
			Thread.sleep(2000);
			input.sendKeys(prop.getProperty("input"));
			Thread.sleep(2000);
			go.click();
			Thread.sleep(2000);
			clickmail.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			driver.close();
			UtilityFile.Tab0(driver);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void AgentNonGMOMail()
	{
		a=new Actions(driver);
		try {
			
			
			trial.click();
			Thread.sleep(2000);
			close.click();
			Thread.sleep(2000);
			a.moveToElement(input).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(2000);
			input.sendKeys(prop.getProperty("binput"));
			Thread.sleep(2000);
			go.click();
			Thread.sleep(2000);
			clickmail.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			UtilityFile.Tab0(driver);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
			
}
