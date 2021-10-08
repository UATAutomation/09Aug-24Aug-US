package com.businesscertificatereject.pom;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.businesscertificatereject.Base.Base;
import com.businesscertificatereject.Utility.UtilityFile;


public class Bussinesscertificate extends Base {
	WebDriver driver;
	JavascriptExecutor exi;
	Actions a;
	WebDriverWait wait;
	
	public Bussinesscertificate(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@class='nav-link']//p[text()='Agent']")
	WebElement agent;
	@FindBy(xpath = "//span[text()='Agent List']")
	WebElement agentlist;
	
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button[2]/span/mat-icon")
	WebElement nexttab;
	@FindBy(xpath = "//tbody/tr[2]/td[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchtab;
	 @FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	  WebElement editagent;  
	
	 @FindBy(xpath = "//div[@class='mat-tab-label-content'][text()='Document']")
		WebElement agentdocument;
	 @FindBy(xpath = "//div[1]/div[5]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
		WebElement searchtab2;
		
		
		@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon[text()='keyboard_arrow_down'])[2]")
		WebElement actiontab;
	
		@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon[text()='keyboard_arrow_down'])[2]")
		WebElement actiontab2;
		@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon[text()='keyboard_arrow_down'])[2]")
		WebElement actiontab3;
 
		@FindBy(xpath = "(//*[@class='cdk-overlay-pane']/div/div/button)[1]")
		WebElement uploadtab;
		@FindBy(xpath = "//input[@accept='.jpg,.png,.pdf']")
		WebElement choosefile2;
		@FindBy(xpath = "//button[text()='Upload']")
		WebElement uploadfile;
		@FindBy(xpath = "//button[@type='button'][text()='Reject ']")
		WebElement agentreject;
		
		@FindBy(xpath = "//input[@name='inputText']")
		WebElement rejectsearch;
		@FindBy(xpath = "//button[2]//span[text()=' OK ']")
		WebElement ok;
		@FindBy(xpath = "//button[@type='button'][text()='Approve ']")
		WebElement agentapprove;
		@FindBy(xpath = "//button[@type='button'][text()=' Yes']")
		WebElement yestab;
		
		@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
		WebElement cross;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
		WebElement mail1;
		@FindBy(xpath = "//a[contains(text(),'Click here')]")
		WebElement clickhere;
	 
		ArrayList<String> tab;
		
	 public void AgentEditField() throws Throwable
	 {
		 a=new Actions(driver);
		 wait=new WebDriverWait(driver, 30);
		 exi=(JavascriptExecutor)driver;
		
			agent.click();
			Thread.sleep(2000);
			agentlist.click();
			Thread.sleep(2000);
		    String expected = "Agents";
			String actual = driver.findElement(By.xpath("//span[text()='Agents']")).getText();
			Assert.assertEquals(actual, expected);
			System.out.println("Enter in agent page");
			nexttab.click();
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.elementToBeClickable(searchtab));
			searchtab.sendKeys("bobby");
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.elementToBeClickable(editagent));
			a.moveToElement(editagent).click(editagent).build().perform();
			exi.executeScript("arguments[0].click()", agentdocument);
			a.moveToElement(agentdocument).click(agentdocument).build().perform();
			Thread.sleep(4000);
			nexttab.click();
			Thread.sleep(3000);
			searchtab2.sendKeys(prop.getProperty("bs"));
			Thread.sleep(3000);
			actiontab.click();
			Thread.sleep(5000);
		
			wait.until(ExpectedConditions.elementToBeClickable(uploadtab));
			a.moveToElement(uploadtab).build().perform();
			uploadtab.click();
			Thread.sleep(3000);
			choosefile2.sendKeys(prop.getProperty("pt"));
			Thread.sleep(3000);
			uploadfile.click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(actiontab2));
			Thread.sleep(3000);
			a.moveToElement(actiontab2).build().perform();
			Thread.sleep(3000);
			actiontab2.click();
			//a.moveToElement(actiontab2).click(actiontab2).build().perform();
			//actiontab.click();
			Thread.sleep(3000);
			agentapprove.click();
			Thread.sleep(3000);
			yestab.click();
			Thread.sleep(5000);
	 }
			public void NewTabShifting() throws Throwable   
			{
				
				try {

					Robot b = new Robot();
					b.keyPress(KeyEvent.VK_CONTROL);
					b.keyPress(KeyEvent.VK_SHIFT);
					b.keyPress(KeyEvent.VK_N);
					b.keyRelease(KeyEvent.VK_CONTROL);
					b.keyRelease(KeyEvent.VK_SHIFT);
					b.keyRelease(KeyEvent.VK_N);
					tab = new ArrayList<>(driver.getWindowHandles());
					driver.switchTo().window(tab.get(1));
					driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?trialshow=true&to=bobby");

					 Thread.sleep(5000);
				} catch (IndexOutOfBoundsException e) {
					
					tab = new ArrayList<>(driver.getWindowHandles());
					driver.switchTo().window(tab.get(1));
					driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

					driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?trialshow=true&to=bobby");

				}
				 
			}
			
			
			public void mailinator() throws Throwable {
				Thread.sleep(3000);
				 cross.click();
				 Thread.sleep(3000);
				 mail1.click();
				 Thread.sleep(3000);
				 UtilityFile.screenShot(driver);
				 Thread.sleep(3000);
				 tab = new ArrayList<>(driver.getWindowHandles());
				 driver.switchTo().window(tab.get(0));
						
			}
  public void rejeccttab() throws Throwable {
			
			a.moveToElement(actiontab3).click(actiontab3).build().perform();
			//actiontab.click();
			Thread.sleep(3000);
			agentreject.click();
			
			Thread.sleep(3000);
			rejectsearch.sendKeys("bad");
			Thread.sleep(3000);
			ok.click();
			 tab = new ArrayList<>(driver.getWindowHandles());
			 driver.switchTo().window(tab.get(1));
			 driver.navigate().back();
			 Thread.sleep(3000);
			 mail1.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 clickhere.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 
}
}