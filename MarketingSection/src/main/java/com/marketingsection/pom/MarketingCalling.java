package com.marketingsection.pom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.marketingsection.base.Base;
import com.marketingsection.utility.UtilityFile;


public class MarketingCalling extends Base
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public MarketingCalling(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//p[text()='Marketing']")
	WebElement marketing;
	@FindBy(xpath = "(//span[text()='Marketing Calling'])[1]")
	WebElement marketingcalling;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button//span//*[text()='filter_list']")
	WebElement nexttab;
	@FindBy(xpath ="(//input[@class='dx-texteditor-input'])[3]")
	WebElement searchapp;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[2]")
	WebElement edit;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement additional;
	@FindBy(xpath = "//input[@placeholder='Activity Date']")
	WebElement activitydate;
	
	@FindBy(xpath = "//*[@placeholder='Institution']//div[@class='ng-input']")
	WebElement institution;
	@FindBy(xpath ="(//input[@type='text'])[2]")
	WebElement select;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	WebElement selectclick;
	
	
	
	@FindBy(xpath ="//*[@name='ParentId']//div[@class='mat-select-value']")
	WebElement assignedagent;
	@FindBy(xpath ="//input[@aria-label='dropdown search']")
	WebElement dropdownsearch; 
	
	@FindBy(xpath ="//*[@name='ActivityResponse']//div[@class='mat-select-value']")
	WebElement activityresponse;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[3]")
	WebElement resposeclick;
	
	@FindBy(xpath ="//*[@name='Description']")
	WebElement remark;
	@FindBy(xpath ="//button[text()='Add']")
	WebElement add;
	
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[4]")
	WebElement checkallselctvalue;
	@FindBy(xpath ="//button[text()='Close']")
	WebElement closetab;
	
	
	
	public void MarketingCallingAdd()  
	{
			driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			try
			{
			 Thread.sleep(3000); 
			 String dexpected="Dashboard"; String
			 dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
			 Assert.assertEquals(dactual, dexpected);	 
			 System.out.println("Enter In Dashboard Page");
			 marketing.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 exi.executeScript("arguments[0].scrollIntoView();",marketingcalling);
			 Thread.sleep(3000);
			 marketingcalling.click();
			 Thread.sleep(3000);
			 String aexpected="Marketing Calling";
			 String aactual=driver.findElement(By.xpath("(//span[text()='Marketing Calling'])[2]")).getText();
			 Assert.assertEquals(aactual, aexpected);	
			 System.out.println("Enter In Marketing Calling Page");
			 UtilityFile.screenShot(driver);
			 additional.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 activitydate.sendKeys(prop.getProperty("date"));
			 Thread.sleep(3000);
			 institution.click(); 
			 Thread.sleep(2000);
			 UtilityFile.screenShot(driver);
			 select.sendKeys(prop.getProperty("instinm"));
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 select.sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(1000);
			 exi.executeScript("arguments[0].scrollIntoView();",assignedagent);
			 Thread.sleep(3000);
			 assignedagent.click();
			 Thread.sleep(3000);
			 dropdownsearch.sendKeys(prop.getProperty("assagent"));
			 Thread.sleep(3000);
			 selectclick.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 exi.executeScript("arguments[0].scrollIntoView();",activityresponse);
			 Thread.sleep(3000);
			 activityresponse.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 resposeclick.click();
			 Thread.sleep(3000);
			 remark.sendKeys(prop.getProperty("rea"));
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 add.click();
			 Thread.sleep(3000); 
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
	
	public void CheckedMarketingCallingField()  
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			try
			{
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000); 
			checkallselctvalue.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000); 
			closetab.click();
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
}