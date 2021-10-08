package com.programsearchviewallprograms.pom;

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

import com.programsearchviewallprograms.base.Base;
import com.programsearchviewallprograms.utility.UtilityFile;

public class SelectGMOAbcodoViewPrograms extends Base 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	
	public SelectGMOAbcodoViewPrograms(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath ="//p[text()='Operation']")
	WebElement operation;
	@FindBy(xpath = "//span[text()='Program Search']")
	WebElement programsearch;
	@FindBy(xpath = "//*[@name='Nationality']//span[text()='Nationality']")
	WebElement nationality;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdownsearch;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement selctcountry;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement selctothercountry;
	@FindBy(xpath = "//*[@name='PartnerTypeId']//div[@class='mat-select-value']")
	WebElement partnertype;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement alltype;
	@FindBy(xpath = "//button//i[@class='fa fa-search']")
	WebElement search;
	@FindBy(xpath = "//input[@name='param2']")
	WebElement where;
	
	
	ArrayList<String> tab;
	public void SelectGMOAbcodoViewProgramsField() throws Throwable 
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
				programsearch.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				nationality.click();
				Thread.sleep(3000);
				dropdownsearch.sendKeys(prop.getProperty("cnt"));
				if(prop.getProperty("cnt").equals("India"))
				{
					selctothercountry.click();
				}
				else
				{
					selctcountry.click();
				}
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				partnertype.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				selctcountry.click(); 
				Thread.sleep(3000);
				search.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				partnertype.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				selctothercountry.click();
				Thread.sleep(3000);
				search.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				partnertype.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				alltype.click();
				Thread.sleep(3000);
				search.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				where.sendKeys(prop.getProperty("insti"));
				Thread.sleep(3000);
				alltype.click();
				Thread.sleep(3000);
				search.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				
				String ele=driver.findElement(By.xpath("//div[@class='mb-0 col-md-4']")).getText();
				System.out.println("Present Elements Is :- "+ele);	
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}			 
	}
}