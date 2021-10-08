package com.columngenderdatebirth.pom;

import java.util.List;

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

import com.columngenderdatebirth.Utility.UtilityFile;

public class AgentGnderdtbrh {
	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public AgentGnderdtbrh(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[@class='nav-link']//p[text()='Operation']")
	WebElement operation;
	
	
	@FindBy(xpath = "//*[@class='nav-link']//span[text()='Students']")
	WebElement student;

	@FindBy(xpath = "//p[text()=' Account ']")
	WebElement account;
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement logout;
	

	public void Agentcolumngendr() throws Throwable {
		
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;

			
			operation.click();
			Thread.sleep(3000); 
			Assert.assertEquals(true, student.isDisplayed());
			System.out.println("student Tab Is Visible");
			wait.until(ExpectedConditions.elementToBeClickable(student)).click();
			Thread.sleep(3000);
			 String expected1 = "Students";
			 String actual1 = driver.findElement(By.
			 xpath("(//span[text()='Students'])[2]")).getText();
			 Assert.assertEquals(actual1, expected1);
			 System.out.println("Enter in Application grid page");
			 Thread.sleep(5000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 
	System.out.println("====================");
	List<WebElement> agbuttons = driver.findElements(By.xpath("(//table/tbody/tr[@class='dx-row dx-column-lines dx-header-row'])[2]"));
	
	for(WebElement agbutton:agbuttons)
	 {
		
		 System.out.println(agbutton.getText());
	 }
	System.out.println("====================");
	 
	/*
	 * exi.executeScript("arguments[0].scrollIntoView();",account );
	 * Thread.sleep(3000); account.click(); Thread.sleep(3000); logout.click();
	 */
}
}
