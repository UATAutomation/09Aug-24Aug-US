package com.institutionpartnertypecolumn.pom;

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

import com.institutionpartnertypecolumn.base.Base;
import com.institutionpartnertypecolumn.utility.UtilityFile;


public class InstitutionPartnerTypeColumn extends Base 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	
	public InstitutionPartnerTypeColumn(WebDriver driver) 
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
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[18]")
	WebElement partnertype;
	
	
	
	public void InstitutionPartnerTypeColumnField() throws Throwable 
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
				exi.executeScript("arguments[0].scrollIntoView();",partnertype);
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				Thread.sleep(3000);
				String iexpected="Institution"; 
				String iactual=driver.findElement(By.xpath("//td[@aria-label='Column Institution']//div[text()='Institution']")).getText();
				Assert.assertEquals(iactual, iexpected);	 
				System.out.println("Institution Column Is Present");
				 
				String pexpected="Institution partner type"; String
				pactual=driver.findElement(By.xpath("//td[@aria-label='Column Institution partner type']//div[text()='Institution partner type']")).getText();
				Assert.assertEquals(pactual, pexpected);	 
				System.out.println("Institution partner type Column Is Present");
	
				String iname=driver.findElement(By.xpath("//*[@id='screenshot']/div[2]/app-show-application-detailed/div/div/div/div/dx-data-grid/div/div[6]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[16]")).getText();
				System.out.println("Institution Name is : "+iname);
				
				String value=driver.findElement(By.xpath("//*[@id='screenshot']/div[2]/app-show-application-detailed/div/div/div/div/dx-data-grid/div/div[6]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[17]")).getText();
				System.out.println("Institution Partner Type Value is : "+value);
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}			 
	}
}