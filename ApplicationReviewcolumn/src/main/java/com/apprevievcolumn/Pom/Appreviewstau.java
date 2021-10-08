package com.apprevievcolumn.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.apprevievcolumn.Base.Base;
import com.apprevievcolumn.Utility.UtilityFile;


public class Appreviewstau extends Base{

	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public Appreviewstau(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[@class='nav-link ng-star-inserted']//p[text()='Operation']")
	WebElement operation;
	@FindBy(xpath = "//a[@class='nav-link child-menu ng-star-inserted']//span[text()='Applications']")
	WebElement application;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button//span//*[text()='filter_list']")
	WebElement nexttab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[3]")
	WebElement searchtab;
	@FindBy(xpath = "//div[text()='Program']")
	WebElement program;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	WebElement editagent;
	public void Appreviewstatus() throws Throwable {
	
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;

			
			operation.click();
			Thread.sleep(3000); 
			Assert.assertEquals(true, application.isDisplayed());
			System.out.println("application Tab Is Visible");
			wait.until(ExpectedConditions.elementToBeClickable(application)).click();
			Thread.sleep(3000);
			 String expected1 = "Applications";
			 String actual1 = driver.findElement(By.
			 xpath("(//span[text()='Applications'])[2]")).getText();
			 Assert.assertEquals(actual1, expected1);
			 System.out.println("Enter in Application grid page");
				
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 nexttab.click();
			 Thread.sleep(3000);
				/*
				 * exi.executeScript("arguments[0].scrollIntoView();", program );
				 * Thread.sleep(3000);
				 */
			 
			 searchtab.sendKeys(prop.getProperty("nm"));
			 Thread.sleep(3000);
			 a.moveToElement(editagent).click(editagent).build().perform();
			 //editagent.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 nexttab.click();
			 Thread.sleep(3000);
				/*
				 * exi.executeScript("arguments[0].scrollIntoView();", program );
				 * Thread.sleep(3000);
				 */
			 
		 	 a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		 	Thread.sleep(3000);	
			 searchtab.sendKeys(prop.getProperty("dt"));
			 Thread.sleep(3000);
			 a.moveToElement(editagent).click(editagent).build().perform();
			 //editagent.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 
			 
			 
			 
			 
			 
			 
			 
}
}