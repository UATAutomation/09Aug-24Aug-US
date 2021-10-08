package com.findmanagercolumnInevents.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.findmanagercolumnInevents.base.Base;
import com.findmanagercolumnInevents.utility.UtilityFile;


public class FindManagerColumn extends Base
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public FindManagerColumn(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//p[text()='Marketing']")
	WebElement Marketing;
	@FindBy(xpath = "(//span[text()='Events'])[1]")
	WebElement Events;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button[2]/span/mat-icon")
	WebElement nexttab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[1]")
	WebElement searchmsmid;
	@FindBy(xpath = "(//td[@aria-label='Column Manager']//span)[2]")
	WebElement mngcolmn;
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[1]")
	WebElement additional;
	@FindBy(xpath = "//*[@name='EventOwner']//div[@class='mat-select-value']")
	WebElement EventOwner;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement searchEventOwner;
	@FindBy(xpath = "//input[@name='EventTitle']")
	WebElement EventTitle;
	
	@FindBy(xpath = "//*[@name='EventCategoryId']//span[text()='Category']")
	WebElement Category;
	@FindBy(xpath = "//input[@placeholder='Start Date']")
	WebElement Date;
	
	@FindBy(xpath = "//*[@name='InstitutionId']//span[text()='Institution']")
	WebElement institutionselect;
	
	@FindBy(xpath = "//span[text()='ADD']")
	WebElement ADD;
	@FindBy(xpath = "//button[text()=' Add ']")
	WebElement submit;
	
	@FindBy(xpath = "//input[@aria-label='Search']")
	WebElement searchmnger;
	@FindBy(xpath = "//span[text()='OK']")
	WebElement OK;
	
	public void FindManagerColumnFields()
	{
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	 	wait=new WebDriverWait(driver,60);
		exi=(JavascriptExecutor)driver;
		 try 
		 {
			 String dexpected="Dashboard";
			 String dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
			 Assert.assertEquals(dactual, dexpected);	
			 System.out.println("Enter In Dashboard Page");
			 Marketing.click();
			 Thread.sleep(2000);
			 UtilityFile.screenShot(driver);
			 exi.executeScript("arguments[0].scrollIntoView();",Events );
			 Thread.sleep(3000);
			 Events.click();
			 Thread.sleep(2000);
			 UtilityFile.screenShot(driver);
			 String aexpected="Events";
			 String aactual=driver.findElement(By.xpath("(//span[text()='Events'])[2]")).getText();
			 Assert.assertEquals(aactual, aexpected);	
			 System.out.println("Enter In Events Page");
			 Thread.sleep(2000);
			 additional.click();
			 Thread.sleep(2000);
			 UtilityFile.screenShot(driver);
			 EventOwner.click();
			 Thread.sleep(2000);
			 searchEventOwner.sendKeys(prop.getProperty("ownr"));
			 Thread.sleep(2000);
			 searchEventOwner.sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 EventTitle.sendKeys(prop.getProperty("ttl"));
			 Thread.sleep(2000);
			 Category.click();
			 Thread.sleep(2000);
			 searchEventOwner.sendKeys(prop.getProperty("cat"));
			 Thread.sleep(2000);
			 searchEventOwner.sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 Date.sendKeys(prop.getProperty("date"));
			 Thread.sleep(2000);
			 institutionselect.click();
			 Thread.sleep(2000);
			 searchEventOwner.sendKeys(prop.getProperty("inst"));
			 Thread.sleep(2000);
			 searchEventOwner.sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 ADD.click();
			 Thread.sleep(2000);
			 exi.executeScript("arguments[0].scrollIntoView();",submit );
			 Thread.sleep(2000);
			 UtilityFile.screenShot(driver);
			 submit.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 nexttab.click();
			 Thread.sleep(2000);
			 searchmsmid.sendKeys(prop.getProperty("ownr"));
			 Thread.sleep(2000);
			 UtilityFile.screenShot(driver);
			 String mexpected="Manager";
			 String mactual=driver.findElement(By.xpath("(//td[@aria-label='Column Manager'])[1]")).getText();
			 Assert.assertEquals(mactual, mexpected);	
			 System.out.println("Matching Column Manager ");
			 mngcolmn.click();
			 Thread.sleep(2000);
			 UtilityFile.screenShot(driver);
			 searchmnger.sendKeys(prop.getProperty("ownr"));
			 Thread.sleep(2000);
			 UtilityFile.screenShot(driver);
			 OK.click(); 
	 } 
	 catch (Exception e) 
	 {
		e.printStackTrace();	
	 }
		
	}
}
