package com.changestudentEmailID.Pom;

import java.util.concurrent.TimeUnit;

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

import com.changestudentEmailID.Base.Base;
import com.changestudentEmailID.Utility.UtilityFile;

public class FromStudtEmlField extends Base {
	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public FromStudtEmlField(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//*[@class='nav-link']//p[text()='Operation']")
	  WebElement operation;
	@FindBy(xpath = "//a[@class='nav-link']//span[text()='Applications']")
	WebElement application;
	@FindBy(xpath = "//a[@class='nav-link']//span[text()='Students']")
	WebElement Students;
	@FindBy(xpath = "//mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/div[2]/button[1]")
	WebElement edit;
	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[1]")
	WebElement additional;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button//span//*[text()='filter_list']")
	WebElement nexttab;
	@FindBy(xpath ="//div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchapp;
	@FindBy(xpath ="//div[contains(text(),'MSM ID')]")
	WebElement MSM;
	@FindBy(xpath ="//div[contains(text(),'Last name')]")
	WebElement Lastname;
	@FindBy(xpath = "//div[1]/div[1]/dx-data-grid[1]/div[1]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[1]")
	WebElement edittab;
	@FindBy(xpath ="//*[@class='mat-form-field-infix']//input[@name='Email']")
	WebElement emailfield;
	@FindBy(xpath ="//button[text()='Update']")
	WebElement Update;
	@FindBy(xpath ="//i[@title='User Account']")
	WebElement acoount;
	@FindBy(xpath ="//a[text()='Log out']")
	WebElement Logout;
	@FindBy(xpath ="//button[text()='OK']")
	WebElement ok;
	public void StudentEmailinstu() throws Throwable {
		
		a = new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi = (JavascriptExecutor) driver;

		
		operation.click();
		Thread.sleep(3000); 
		Assert.assertEquals(true, Students.isDisplayed());
		System.out.println("Students Tab Is Visible");

		wait.until(ExpectedConditions.elementToBeClickable(Students)).click();
		Thread.sleep(3000);
		
			exi.executeScript("arguments[0].scrollIntoView();",MSM );
			 Thread.sleep(3000);
			 exi.executeScript("arguments[0].scrollIntoView();",Lastname );
			 Thread.sleep(3000);
		     nexttab.click();
			Thread.sleep(3000);
			searchapp.sendKeys(prop.getProperty("id1"));
			UtilityFile.screenShot(driver);
			a.moveToElement(edittab).click(edittab).build().perform();
			Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();",edit );
			Thread.sleep(3000);
			edit.click();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS );
			UtilityFile.screenShot(driver);
			exi.executeScript("arguments[0].scrollIntoView();",emailfield );
			Thread.sleep(3000);
		
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
			a.moveToElement(emailfield).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(3000);

			emailfield.sendKeys(prop.getProperty("emm"));
			Thread.sleep(3000);
			Update.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			
			/*
			 * Thread.sleep(3000); ok.click(); Thread.sleep(3000);
			 * exi.executeScript("arguments[0].scrollIntoView();",emailfield );
			 * Thread.sleep(3000);
			 * 
			 * a.moveToElement(emailfield).doubleClick().click().sendKeys(Keys.BACK_SPACE).
			 * build().perform(); Thread.sleep(3000);
			 * 
			 * emailfield.sendKeys("kip@mailinator.com"); Thread.sleep(3000);
			 * Update.click(); Thread.sleep(3000); UtilityFile.screenShot(driver);
			 * Thread.sleep(3000);
			 * 
			 * Thread.sleep(3000);
			 */
}
}


