package com.checkhintstudentnotessection.pom;

import java.util.ArrayList;
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

import com.checkhintstudentnotessection.base.Base;
import com.checkhintstudentnotessection.utility.UtilityFile;

public class CheckHintStudentNotes extends Base 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	
	public CheckHintStudentNotes(WebDriver driver) 
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
	@FindBy(xpath ="(//mat-expansion-panel//span[@class='mat-content']/div/h1)[9]")
	WebElement studentnots;
	
	@FindBy(xpath ="//*[@class='mat-hint ng-star-inserted']")
	WebElement hintnots;
	
	
	ArrayList<String> tab;
	public void CheckHintStudentNotesField() throws Throwable 
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			try 
			{
				Thread.sleep(3000); 
				operation.click();
				Thread.sleep(3000); 
				UtilityFile.screenShot(driver);
				application.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				nexttab.click();
				Thread.sleep(3000);
				searchapp.sendKeys(prop.getProperty("id"));
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				a.moveToElement(edit).click(edit).build().perform();
				Thread.sleep(3000);
				exi.executeScript("arguments[0].scrollIntoView();",studentnots);
				Thread.sleep(3000);
				studentnots.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				Thread.sleep(3000);
				String expected="Hint : Notes will be emailed to the agent"; 
				String actual=driver.findElement(By.xpath("//*[@class='mat-hint ng-star-inserted']")).getText();
				Assert.assertEquals(actual, expected);	 
				System.out.println("Hint : Notes will be emailed to the agent Present In Student Nots");
				
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}			 
	}
}