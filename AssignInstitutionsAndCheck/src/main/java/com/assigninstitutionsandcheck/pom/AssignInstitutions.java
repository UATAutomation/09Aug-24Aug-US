package com.assigninstitutionsandcheck.pom;

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
import com.assigninstitutionsandcheck.base.Base;
import com.assigninstitutionsandcheck.utility.UtilityFile;

public class AssignInstitutions extends Base 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	
	public AssignInstitutions(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath ="//i[@title='User Account']")
	WebElement acoount;
	@FindBy(xpath ="//a[text()='Users']")
	WebElement user;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button//span//*[text()='filter_list']")
	WebElement nexttab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[1]")
	WebElement searchtab;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	WebElement editagent;
	@FindBy(xpath = "//div[text()='Institutions']")
	WebElement institutions;
	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[2]")
	WebElement additional;
	@FindBy(xpath = "//*[@name='InstitutionId']//div[@class='mat-select-value']")
	WebElement selectinstitution;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdownsearch;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement gmotype;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
	WebElement abcodotype;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement alltype;
	@FindBy(xpath = "//button[text()='Add']")
	WebElement add;
	@FindBy(xpath = "//td[@aria-label='Column Partner type']//div[@class='dx-column-indicators']")
	WebElement PartnertypeColumn;
	@FindBy(xpath = "//input[@aria-label='Search']")
	WebElement Searchtype;
	@FindBy(xpath = "//div[@class='dx-item dx-list-item']//span[@class='dx-checkbox-icon']")
	WebElement checkboxtype;
	@FindBy(xpath = "//div[@class='dx-scrollview-content']//span[@class='dx-checkbox-icon']")
	WebElement uncheckboxtype;
	@FindBy(xpath = "//span[text()='OK']")
	WebElement ok;
	@FindBy(xpath = "(//span[@class='dx-checkbox-icon'])[2]")
	WebElement singlecheck;
	@FindBy(xpath = "(//span[@class='dx-checkbox-icon'])[1]")
	WebElement multicheck;
	@FindBy(xpath = "//*[text()='delete']")
	WebElement delete;
	@FindBy(xpath = "//*[text()=' Yes']")
	WebElement yes;
	
	public void AssignGMOInstitutions() throws Throwable 
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			try 
			{
				Thread.sleep(3000); 
				String dexpected="Dashboard"; 
				String dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
				Assert.assertEquals(dactual, dexpected);	 
				System.out.println("Enter In Dashboard Page");
				
				wait.until(ExpectedConditions.elementToBeClickable(acoount)).click();
				Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(user)).click();
				Thread.sleep(3000);
				
				String uexpected="Users"; 
				String uactual=driver.findElement(By.xpath("//span[text()='Users']")).getText();
				Assert.assertEquals(uactual, uexpected);	 
				System.out.println("Enter In Users Page");
				
				UtilityFile.screenShot(driver);
				nexttab.click();
				Thread.sleep(3000);
				searchtab.sendKeys(prop.getProperty("nm"));
				Thread.sleep(3000);
				a.moveToElement(editagent).click(editagent).build().perform();
				Thread.sleep(3000);
				
				String eexpected="Edit User"; 
				String eactual=driver.findElement(By.xpath("//span[text()='Edit User']")).getText();
				Assert.assertEquals(eactual, eexpected);	 
				System.out.println("Enter In Edit User Page");
				
				UtilityFile.screenShot(driver);
				institutions.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				additional.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				selectinstitution.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				gmotype.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				add.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				PartnertypeColumn.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				ok.click();
				Thread.sleep(3000);	
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}			 
	}
	public void AssignAbcodoInstitutions() throws Throwable 
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			try 
			{
				additional.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				selectinstitution.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				abcodotype.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				add.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				PartnertypeColumn.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				ok.click();
				Thread.sleep(3000);	
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}			 
	}
	public void CheckPartnertypeColumn() throws Throwable 
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			try 
			{
				PartnertypeColumn.click();
				Thread.sleep(3000);
				Searchtype.sendKeys(prop.getProperty("gmtp"));
				Thread.sleep(3000);
				checkboxtype.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				Thread.sleep(3000);
				ok.click();
				Thread.sleep(3000);	
				UtilityFile.screenShot(driver);
				Thread.sleep(3000);
				PartnertypeColumn.click();
				Thread.sleep(3000);
				Searchtype.sendKeys(prop.getProperty("gmtp"));
				Thread.sleep(3000);
				uncheckboxtype.click();
				Thread.sleep(3000);
				a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
				Thread.sleep(3000);
				Searchtype.sendKeys(prop.getProperty("abtype"));
				Thread.sleep(3000);
				checkboxtype.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				Thread.sleep(3000);
				ok.click();
				Thread.sleep(3000);	
				UtilityFile.screenShot(driver);
				Thread.sleep(3000);	
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}			 
	}
	public void CheckedCheckboxAndDeleteInstitutions() throws Throwable 
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			try 
			{
				Thread.sleep(3000);
				singlecheck.click();
				Thread.sleep(3000);	
				UtilityFile.screenShot(driver);
				delete.click();
				Thread.sleep(3000);	
				UtilityFile.screenShot(driver);
				yes.click();
				Thread.sleep(3000);
				multicheck.click();
				Thread.sleep(3000);	
				UtilityFile.screenShot(driver);
				delete.click();
				Thread.sleep(3000);	
				UtilityFile.screenShot(driver);
				yes.click();
				Thread.sleep(3000);	
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}			 
	}
}