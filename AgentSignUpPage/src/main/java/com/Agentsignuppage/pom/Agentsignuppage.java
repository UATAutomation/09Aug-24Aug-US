package com.Agentsignuppage.pom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Agentsignuppage.base.Base;
import com.Agentsignuppage.utility.UtilityFile;




public class Agentsignuppage extends Base{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	
	public Agentsignuppage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='Register as an Agent']")
	WebElement registeragent;
	@FindBy(xpath = "//span[text()='MSM Staff']")
	WebElement howdiduhear;
	@FindBy(xpath ="//span[text()='Other social media']") 
	WebElement socialmedia;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]/ngx-mat-select-search[1]/div[1]/input[1]")
	WebElement msmsearch;
    @FindBy(xpath = "(//button[@type='button'][text()='I want to Signup for GMO'])[2]")
	WebElement agentGMO;
    @FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdown;
	@FindBy(xpath ="//input[@name='City']") 
	WebElement cityname;
	@FindBy(xpath = "//*[@name='Country']")
	WebElement country;
	@FindBy(xpath = "//*[@name='statusFilter']//input[@aria-label='dropdown search']")
	WebElement countrysearch;
	@FindBy(xpath = "//*[@name='Province']")
	WebElement province;
	@FindBy(xpath = "//*[@name='provinceFilter']//input[@aria-label='dropdown search']")
	WebElement provincesearch;
    @FindBy(xpath = "//input[@name='Email']")
	WebElement emailid;

	
	
	public void CreateAgentLink()
	{
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		try 
		{
			registeragent.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			exi.executeScript("arguments[0].scrollIntoView();",agentGMO );
			Thread.sleep(2000);
			agentGMO.click();
			Thread.sleep(2000);
			} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	List<WebElement> agbuttons;
	ArrayList<String> supbt;
	public void ShiftingTab() throws Throwable
	{
		a=new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi=(JavascriptExecutor)driver;
		
		String parent=driver.getWindowHandle();
	   	Set<String>s=driver.getWindowHandles();
        Iterator<String> I1= s.iterator();
            while(I1.hasNext())
	   		 {
           String child_window=I1.next();
           if(!parent.equals(child_window))
	   		 {
	   		 driver.switchTo().window(child_window);
	   		Thread.sleep(3000);
	   		 }	
	   		 } }
	   public void CreateAgentField() throws Throwable
	   		{   		
		    a=new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi=(JavascriptExecutor)driver;
			
		    exi.executeScript("arguments[0].scrollIntoView();",howdiduhear);
		    Thread.sleep(2000);
		    UtilityFile.screenShot(driver);
			Thread.sleep(3000);
		    howdiduhear.click();
		    Thread.sleep(3000);
		    System.out.println("---------");
			List<WebElement> agbuttons = driver.findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']"));
		  	ArrayList<String> supbt = new ArrayList<>();
		  		for(WebElement agbutton:agbuttons)
		  		 {
		  			 
		  			 supbt.add(agbutton.getText());
		  		 }
		   System.out.println(supbt);
		   System.out.println("---------");
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 
			 dropdown.sendKeys("other");
			 Thread.sleep(3000);
			 dropdown.sendKeys(Keys.ENTER);
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			}
	 
	   		
 				 
 			  
 		}
     
