package com.Agentcompanyoverview.pom;

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

import com.Agentcompanyoverview.Utility.UtilityFile;


public class Companyoverview {

	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public Companyoverview(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//div[text()='Company Overview']")
	  WebElement company;
	@FindBy(xpath = "//ng-select[@name='PrincipleCountries']/div[1]/span[1]")
	WebElement countrydropdown;
	@FindBy(xpath = "//div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")
	WebElement countrydropdown1;  
	@FindBy(xpath = "//div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[4]")
	WebElement countrydropdown2;  
	@FindBy(xpath = "//ng-select[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement dropdownsearch;
	@FindBy(xpath = "//div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")
	WebElement dropdownsearch1;
	@FindBy(xpath = "//div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[4]/input[1]")
	WebElement dropdownsearch2;
	
	
	@FindBy(xpath = "//ng-dropdown-panel/div/div/div")
	WebElement dropdownsearchclick;
	
	
	public void fourthoverview() throws Throwable {
		
		a = new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi = (JavascriptExecutor) driver;

		 
		a.moveToElement(company).build().perform();
		String expected="Company Overview";
		String actual=driver.findElement(By.xpath("//div[text()='Company Overview']")).getText();
		Assert.assertEquals(actual, expected);	
		System.out.println("Enter In Company Overview Page");
		Thread.sleep(3000);
		
	
		
		company.click();
		Thread.sleep(2000);
		UtilityFile.screenShot(driver);
		Thread.sleep(2000);
		countrydropdown.click();
		Thread.sleep(3000);
		dropdownsearch.sendKeys("algeria");
		Thread.sleep(2000);
		
		dropdownsearchclick.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		
		  Thread.sleep(3000);    
		  countrydropdown1.click(); 
		  Thread.sleep(3000);
		  dropdownsearch1.sendKeys("angola"); 
		  Thread.sleep(2000);
		  dropdownsearchclick.click();
		  Thread.sleep(3000);
		  UtilityFile.screenShot(driver);
		  Thread.sleep(2000); 
		  countrydropdown2.click(); 
		  Thread.sleep(3000);
		  dropdownsearch2.sendKeys("andorra"); 
		  Thread.sleep(2000);
		  dropdownsearchclick.click();
		  Thread.sleep(2000);
		  UtilityFile.screenShot(driver);
		 
	}	
}
