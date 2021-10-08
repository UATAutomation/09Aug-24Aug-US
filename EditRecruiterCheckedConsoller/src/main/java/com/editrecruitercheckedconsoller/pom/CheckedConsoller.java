package com.editrecruitercheckedconsoller.pom;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.editrecruitercheckedconsoller.base.Base;
import com.editrecruitercheckedconsoller.utility.UtilityFile;


public class CheckedConsoller extends Base
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public CheckedConsoller(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//p[text()='Operation']")
	WebElement operation;
	@FindBy(xpath = "//span[text()='Applications']")
	WebElement application;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button//span//*[text()='filter_list']")
	WebElement nexttab;
	@FindBy(xpath ="(//input[@class='dx-texteditor-input'])[3]")
	WebElement searchapp;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[2]")
	WebElement edit;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement additional;
	@FindBy(xpath = "(//input[@name='keyword'])[2]")
	WebElement search;
	@FindBy(xpath = "//span[text()='Search']")
	WebElement searchclick;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[4]/tr[1]/td[1]")
	WebElement editapplication;
	@FindBy(xpath = "//*[@name='InstitutionId']//span[text()='Institution']")
	WebElement institutionselect;
	@FindBy(xpath ="//*[@name='instFilter']//input[@aria-label='dropdown search']")
	WebElement instFilter;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	WebElement selectclickclick;
	@FindBy(xpath ="(//*[@name='ProgramId']//div/div)[1]")
	WebElement selectprogram;
	@FindBy(xpath ="//*[@class='mat-form-field-infix']//mat-select[@name='IntekId']")
	WebElement intake;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	WebElement intakeclick;
	@FindBy(xpath ="//*[@aria-label='Student Presence']//span[text()='Student Presence']")
	WebElement studentpre; 
	@FindBy(xpath ="//span[text()='OnShore']")
	WebElement studentpreclick;
	@FindBy(xpath ="//button[text()='Continue']")
	WebElement continuetab; 
	@FindBy(xpath ="//*[@name='AgentId']//div[@class='mat-select-value']")
	WebElement assignedagent;
	@FindBy(xpath ="//input[@aria-label='dropdown search']")
	WebElement dropdownsearch; 
	@FindBy(xpath ="(//span[@class='mat-option-text'])[3]")
	WebElement agentclick;
	@FindBy(xpath ="//*[@name='AssignedTo']//div[@class='mat-select-value']")
	WebElement conssoller;
	@FindBy(xpath ="(//button[@type='button']//i[@class='fa fa-edit'])[3]")
	WebElement editagent;
	@FindBy(xpath ="//h1[text()='Recruiter/Agent']")
	WebElement recruiter;
	
	
	public void CheckedConsollerField()  
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
			 operation.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 String aexpected="Applications";
			 String aactual=driver.findElement(By.xpath("//span[text()='Applications']")).getText();
			 Assert.assertEquals(aactual, aexpected);	
			 System.out.println("Enter In Applications Page");
			 Thread.sleep(3000);
			 application.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 additional.click();
			 Thread.sleep(3000);
			 String dcexpected="NEW STUDENT";
			 String dcactual=driver.findElement(By.xpath("//button[text()='New Student']")).getText();
			 Assert.assertEquals(dcactual, dcexpected);	
			 System.out.println("Enter In Select Student Page");
			 UtilityFile.screenShot(driver);
			 search.sendKeys(prop.getProperty("name"));
			 Thread.sleep(3000);
			 searchclick.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 editapplication.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 String ncexpected="New Application";
			 String ncactual=driver.findElement(By.xpath("//span[text()='New Application']")).getText();
			 Assert.assertEquals(ncactual, ncexpected);	
			 System.out.println("Enter In New Application Page");
			 institutionselect.click();
			 Thread.sleep(3000);
			 instFilter.sendKeys(prop.getProperty("intinm"));
			 Thread.sleep(3000);
			 selectclickclick.click();
			 Thread.sleep(3000);
			 selectprogram.click();
			 Thread.sleep(3000);
			 selectclickclick.click();
			 Thread.sleep(3000);
			 intake.click();
			 Thread.sleep(3000);
			 intakeclick.click();	
			 Thread.sleep(3000);
			 studentpre.click();
			 Thread.sleep(3000);
			 studentpreclick.click();
			 Thread.sleep(3000);
			 exi.executeScript("arguments[0].scrollIntoView();",continuetab);
			 continuetab.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 exi.executeScript("arguments[0].scrollIntoView();",assignedagent);
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 assignedagent.click();
			 Thread.sleep(3000);
			 dropdownsearch.sendKeys(prop.getProperty("assignage"));
			 Thread.sleep(3000);
			 agentclick.click();
			 Thread.sleep(3000);
			 conssoller.click();
			 Thread.sleep(3000);
			 String element=driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).getText();
			 System.out.println("In New Application Below The Counsellor Name, Email ID, City & Country :-");
			 System.out.println(element);
			 agentclick.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
	
	public void EditCheckedConsollerField()  
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			try
			{
			Thread.sleep(3000); 
			UtilityFile.screenShot(driver);
			application.click();
			Thread.sleep(3000);
			String eexpected="Applications";
			String eactual=driver.findElement(By.xpath("//span[text()='Applications']")).getText();
			Assert.assertEquals(eactual, eexpected);	
			System.out.println("Enter In Applications Page");
			UtilityFile.screenShot(driver);
			nexttab.click();
			Thread.sleep(3000);
			searchapp.sendKeys(prop.getProperty("msmid"));
			Thread.sleep(3000);
			a.moveToElement(edit).click(edit).build().perform();
			//edit.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			String expected="Application";
			String actual=driver.findElement(By.xpath("//span[text()='Application']")).getText();
			Assert.assertEquals(actual, expected);
			System.out.println("Enter In Edit Application Page");
			exi.executeScript("arguments[0].scrollIntoView();",editagent);
			Thread.sleep(3000);
			editagent.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			conssoller.click();
			Thread.sleep(3000);
			String el=driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).getText();
			System.out.println("In Recruiter/Agent Below The Counsellor Name, Email ID, City & Country :-");
			System.out.println(el);
			agentclick.click();
			 
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
}