package com.Taskpopupwindow.pom;

import java.util.ArrayList;
import java.util.List;
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

import com.Taskpopupwindow.base.Base;
import com.Taskpopupwindow.utility.UtilityFile;


public class Taskui extends Base {
	

	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public Taskui(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//p[text()='Operation']")
	  WebElement operation;
	@FindBy(xpath = "//a[@class='nav-link child-menu ng-star-inserted']//span[text()='Applications']")
	WebElement application;
	@FindBy(xpath = "//span[text()='Task']")
	WebElement task;
	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[1]")
	WebElement additional;
	
	@FindBy(xpath = "//div[1]/div[7]/app-hours[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]")
	WebElement starthours;
	
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	WebElement hours;
	
	@FindBy(xpath ="//mat-label[text()='Start Minutes']")
	WebElement startmin;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	WebElement mins;

	@FindBy(xpath ="//*[@class='mat-form-field-infix']//textarea[@name='TaskDescription']")
	WebElement description;
	@FindBy(xpath ="//div[@class='mat-dialog-actions']//button[text()='Add']")
	WebElement add;
	
	@FindBy(xpath ="//div[@class='swal2-actions']//button[text()='OK']")
	WebElement ok;
	public void Taskkfield() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;

			Thread.sleep(3000); 
			operation.click();
			Thread.sleep(3000); 
			Assert.assertEquals(true, application.isDisplayed());
			System.out.println("application Tab Is Visible");
			/*
			 * wait.until(ExpectedConditions.elementToBeClickable(application)).click();
			 * Thread.sleep(3000); String expected1 = "Applications"; String actual1 =
			 * driver.findElement(By.
			 * xpath("(//span[text()='Applications'])[2]")).getText();
			 * Assert.assertEquals(actual1, expected1);
			 * System.out.println("Enter in Application grid page");
			 */
			 Thread.sleep(3000);
			 
			 task.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 additional.click();
			 
			 Thread.sleep(3000);
			 description.sendKeys("hi");
			 Thread.sleep(3000);
			 add.click();
			 Thread.sleep(3000);
			 ok.click();
			 Thread.sleep(3000);
			 starthours.click();
			 Thread.sleep(3000);
			 List<WebElement> agbuttons = driver.findElements(By.xpath("//*[@class='mat-option ng-star-inserted']"));
			  ArrayList<String> supbt = new ArrayList<>();
				for(WebElement agbutton:agbuttons)
				 {
					supbt.add(agbutton.getText());
				 }
				System.out.println("Time in Hours");
				System.out.print(supbt);

			 hours.click();
			 Thread.sleep(3000);
			
			a.moveToElement(startmin).click(startmin).build().perform();
			 //startmin.click();
			 Thread.sleep(3000);
			 
			 List<WebElement> agbuttons1 = driver.findElements(By.xpath("//*[@class='mat-option ng-star-inserted']"));
			 ArrayList<String> supbt1 = new ArrayList<>();
				for(WebElement agbutton1:agbuttons1)
				 {
					supbt1.add(agbutton1.getText());
					 }
				System.out.println("Time in Min");

				System.out.print(supbt1);

			 
			 
			 
				mins.click();
				
				
			 
}
}