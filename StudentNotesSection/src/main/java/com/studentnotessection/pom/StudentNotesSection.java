package com.studentnotessection.pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import com.studentnotessection.base.Base;
import com.studentnotessection.utility.UtilityFile;
public class StudentNotesSection extends Base 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	
	public StudentNotesSection(WebDriver driver) 
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
	@FindBy(xpath ="//*[@name='Remark']")
	WebElement remark;
	@FindBy(xpath ="//b[text()='market']")
	WebElement text;
	@FindBy(xpath ="//button//span[text()='Add']")
	WebElement add;
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement cross;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	WebElement mail1;
	@FindBy(xpath = "/html/body/div/p[3]/a")
	WebElement clickhere;

	ArrayList<String> tab;
	public void StudentNotesSectionField() throws Throwable 
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
				remark.sendKeys(prop.getProperty("rmk"));
				Thread.sleep(3000);
				exi.executeScript("arguments[0].scrollIntoView();",add);
				a.moveToElement(add).click(add).build().perform();
				//add.click();	
				Thread.sleep(3000);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}			 
	}
	public void NewTabShifting() throws Throwable   
	{
		try
		{
			Robot b = new Robot();
			b.keyPress(KeyEvent.VK_CONTROL);
			b.keyPress(KeyEvent.VK_SHIFT);
			b.keyPress(KeyEvent.VK_N);
			b.keyRelease(KeyEvent.VK_CONTROL);
			b.keyRelease(KeyEvent.VK_SHIFT);
			b.keyRelease(KeyEvent.VK_N);
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
			driver.get(prop.getProperty("mailurl"));
			Thread.sleep(5000);
		} 
		catch (IndexOutOfBoundsException e) 
		{
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get(prop.getProperty("mailurl"));
		} 
	}
	public void mailinator() 
	{
		a = new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi = (JavascriptExecutor) driver;
		try 
		{
			Thread.sleep(3000);
			cross.click();
			Thread.sleep(3000);
			mail1.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
		    int size = driver.findElements(By.tagName("iframe")).size();
		    System.out.println("Total Frames --" + size);
		    
			// prints the total number of frames 
			driver.switchTo().frame(0); // Switching the Outer Frame    		
			System.out.println (driver.findElement(By.xpath("//b[text()='market']")).getText());
			exi.executeScript("arguments[0].scrollIntoView();",text);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
		    System.out.println (driver.findElement(By.xpath("/html/body/div/p[3]/a")).getText());
		    clickhere.click();
		    UtilityFile.screenShot(driver);
			Thread.sleep(3000);	
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(2));
			Thread.sleep(6000);
			UtilityFile.screenShot(driver);
			Thread.sleep(6000);	
			
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}			
	}
}