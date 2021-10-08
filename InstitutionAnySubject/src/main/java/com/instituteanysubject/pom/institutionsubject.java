
package com.instituteanysubject.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.instituteanysubject.Utility.UtilityFile;


public class institutionsubject {
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public institutionsubject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//p[text()='Institution']")
	WebElement institution;
	@FindBy(xpath = "(//a[@data-toggle='collapse'])[2]")
	WebElement list;
	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[1]")
	WebElement additional;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button[2]/span/mat-icon")
	WebElement nexttab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[1]")
	WebElement searchtab;
	@FindBy(xpath ="//div//table//tbody//tr[2]//td[5]//div//button//span//*[text()='keyboard_arrow_down']")
	WebElement supporttab;
	@FindBy(xpath ="//div[@class='mat-menu-content']//button[text()='Program ']")
	WebElement programtab;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	WebElement editprogram;
	@FindBy(xpath ="//*[text()='Requirement']")
	WebElement rwequirement;
	@FindBy(xpath ="//*[text()='Subject']")
	WebElement subject;
	
	@FindBy(xpath ="//*[@aria-label='Region']//span[text()='Region']")
	WebElement region;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	WebElement regionclick; 

	@FindBy(xpath ="//*[@aria-label='Subject']//span[text()='Subject']")
	WebElement subjectall;
	@FindBy(xpath ="//*[@aria-label='dropdown search']")
	WebElement subjectsearch;
	
	@FindBy(xpath ="(//span[@class='mat-option-text'])[3]")
	WebElement subjectsearchclick; 


	@FindBy(xpath ="//div[3]/div[1]/div/button[2]/span/mat-icon")
	WebElement next;
	@FindBy(xpath ="//div[1]/table/tbody/tr[2]/td[2]/div/div[2]/div/div/div[1]/input")
	WebElement search;
	
	@FindBy(xpath ="//*[@aria-label='Grade']//span[text()='Grade']")
	WebElement grade;
	@FindBy(xpath ="//*[@aria-label='Grading Scheme']//span[text()='Grading Scheme']")
	WebElement gradingsceme;
	
	@FindBy(xpath ="//input[@name='Score']")
	WebElement score;
	
	@FindBy(xpath ="//button[text()='Add']")
	WebElement add;
	@FindBy(xpath ="//input[@placeholder='Number of additional subjects']")
	WebElement numberofadd;
	
	public void Allsubjects() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		exi=(JavascriptExecutor)driver;
		wait = new WebDriverWait(driver, 30);
		a=new Actions(driver);

		 institution.click();
         Thread.sleep(3000);
         list.click();
          Thread.sleep(3000);
     
		 UtilityFile.screenShot(driver);
	     Thread.sleep(3000);
	     next.click();
	     Thread.sleep(3000);
	     search.sendKeys("bajaj");
	     Thread.sleep(3000);
          supporttab.click();
          Thread.sleep(3000);
          programtab.click();
          Thread.sleep(3000);
          nexttab.click();
          Thread.sleep(3000);
          searchtab.sendKeys("pulsar");
          Thread.sleep(3000);
          a.moveToElement(editprogram).click(editprogram).build().perform();
          //editprogram.click();
          Thread.sleep(3000);
          UtilityFile.screenShot(driver);
          Thread.sleep(3000);
          rwequirement.click();
          Thread.sleep(3000);
         
          UtilityFile.screenShot(driver);
          Thread.sleep(3000);
          subject.click();
          Thread.sleep(3000);
          additional.click();
          Thread.sleep(3000);
          UtilityFile.screenShot(driver);
          Thread.sleep(3000);
          region.click();
         
          Thread.sleep(3000);
          regionclick.click();
          Thread.sleep(3000);
          subjectall.click();
          Thread.sleep(3000);
          UtilityFile.screenShot(driver);
          Thread.sleep(3000);
          subjectsearch.sendKeys("total/grand total/overall");
          Thread.sleep(3000);
          subjectsearchclick.click();
          Thread.sleep(3000);
          grade.click();
          Thread.sleep(3000);
          UtilityFile.screenShot(driver);
          Thread.sleep(3000);
          subjectsearch.sendKeys("advanced");
          Thread.sleep(3000);
          subjectsearch.sendKeys(Keys.ENTER);
          
          
          gradingsceme.click();
          Thread.sleep(3000);
          UtilityFile.screenShot(driver);
          Thread.sleep(3000);
          subjectsearch.sendKeys("division");
          Thread.sleep(3000);
          subjectsearch.sendKeys(Keys.ENTER);
          Thread.sleep(3000);
          
          score.sendKeys("I");
          Thread.sleep(3000);
          add.click();
          
}
	public void Anysubjects() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		exi=(JavascriptExecutor)driver;
		wait = new WebDriverWait(driver, 30);
		a=new Actions(driver);
		
		 additional.click();
         Thread.sleep(3000);
         region.click();
         
         Thread.sleep(3000);
         regionclick.click();
         Thread.sleep(3000);
     
         UtilityFile.screenShot(driver);
         Thread.sleep(3000);
         subjectall.click();
         Thread.sleep(3000);
         UtilityFile.screenShot(driver);
         Thread.sleep(3000);
         subjectsearch.sendKeys("anysubject");
         Thread.sleep(3000);
        
         regionclick.click();
         Thread.sleep(3000);
         
         grade.click();
         Thread.sleep(3000);
         UtilityFile.screenShot(driver);
         Thread.sleep(3000);
         subjectsearch.sendKeys("advanced");
         Thread.sleep(3000);
         subjectsearch.sendKeys(Keys.ENTER);
         
         UtilityFile.screenShot(driver);
         Thread.sleep(3000);
         gradingsceme.click();
         Thread.sleep(3000);
         UtilityFile.screenShot(driver);
         Thread.sleep(3000);
         subjectsearch.sendKeys("division");
         Thread.sleep(3000);
         subjectsearch.sendKeys(Keys.ENTER);
         Thread.sleep(3000);
         UtilityFile.screenShot(driver);
         Thread.sleep(3000);
         score.sendKeys("I");
         Thread.sleep(3000);
         UtilityFile.screenShot(driver);
         Thread.sleep(3000);
         numberofadd.sendKeys("5");
         Thread.sleep(3000);
         add.click();
         
	}      
         
}
