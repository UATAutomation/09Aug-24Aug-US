package com.Reviewstatusdropdown.pom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Reviewstatusdropdown.utility.UtilityFile;


public class Reviewstatusdropdown {
	
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	
	public Reviewstatusdropdown(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
   
	@FindBy(xpath ="//a[@data-toggle='collapse']//p[text()='Operation']")
	WebElement operation;
	@FindBy(xpath ="//span[text()='Applications']")
	WebElement applications;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button//span//*[text()='filter_list']")
	WebElement nexttab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[3]")
	WebElement searchtab;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	WebElement editapp;
	@FindBy(xpath ="//button[text()='Submit Application']")
	WebElement submittab;
	@FindBy(xpath ="//button[@type='button'][text()=' Yes']")
	WebElement yestab;
	@FindBy(xpath ="//button[text()='Submit To Institute']") 
	WebElement submitinstitute;
	@FindBy(xpath ="//button[@type='button'][text()=' Yes']")
	WebElement yes;
	@FindBy(xpath ="//button[text()='RESUBMIT TO INSTITUTE']") 
	WebElement resubmit;
	@FindBy(xpath ="//*[@placeholder='Review']//div[@class='mat-select-value']") 
	WebElement review;
	@FindBy(xpath ="//input[@aria-label='dropdown search']") 
	WebElement reviewsearch;
	
	
	
	public void UnifyusageField() throws Throwable {
		

		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		
		String dexpected="Dashboard";
		String dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
		Assert.assertEquals(dactual, dexpected);	
		System.out.println("Enter In Dashboard Page");
		UtilityFile.screenShot(driver);
		 
		operation.click();
		Thread.sleep(2000);
		applications.click();
		UtilityFile.screenShot(driver);
		
		String aexpected="Applications";
		String aactual=driver.findElement(By.xpath("//span[text()='Applications']")).getText();
		Assert.assertEquals(aactual, aexpected);	
		System.out.println("Enter In Applications Page");
		 
		Thread.sleep(3000);
		nexttab.click();
		Thread.sleep(3000);
		searchtab.sendKeys("74877");
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		a.moveToElement(editapp).click(editapp).build().perform();
		
		Thread.sleep(3000);
		String eexpected="Application";
		String eactual=driver.findElement(By.xpath("//span[text()='Application']")).getText();
		Assert.assertEquals(eactual, eexpected);	
		System.out.println("Enter In Edit Applications Page");
	
		 
		Thread.sleep(3000);
		review.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		
		 System.out.println("---------");
		List<WebElement> agbuttons = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
	  	ArrayList<String> supbt = new ArrayList<>();
	  		for(WebElement agbutton:agbuttons)
	  		 {
	  			 
	  			 supbt.add(agbutton.getText());
	  		 }
	   System.out.println(supbt);
	   System.out.println("---------");
		Thread.sleep(3000); 
		UtilityFile.screenShot(driver); 
				   
	       }
}