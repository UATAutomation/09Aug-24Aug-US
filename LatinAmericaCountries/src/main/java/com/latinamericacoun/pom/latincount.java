package com.latinamericacoun.pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
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

import com.latinamericacoun.Base.Base;
import com.latinamericacoun.utility.UtilityFile;



public class latincount extends Base {
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public latincount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[@data-toggle='collapse']//p[text()='Operation']")
	WebElement operation;
	@FindBy(xpath ="//span[text()='Applications']")
	  WebElement applications; 
	@FindBy(xpath ="(//input[@class='dx-texteditor-input'])[3]")
	  WebElement searchapp;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	WebElement edit;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button//span//*[text()='filter_list']")
	WebElement nexttab;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement additional;
	@FindBy(xpath = "(//input[@name='keyword'])[2]")
	WebElement search;
	@FindBy(xpath = "//span[text()='Search']")
	WebElement searchclick;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[4]/tr[1]/td[1]")
	  WebElement editapplication;
	@FindBy(xpath = "//*[@name='InstitutionId']//span[text()='Institution']")
	WebElement institutionselect;
	@FindBy(xpath ="//*[@name='instFilter']//input[@aria-label='dropdown search']")
	  WebElement instFilter;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	  WebElement selectclickclick;
	@FindBy(xpath ="(//*[@name='ProgramId']//div/div)[1]")
	  WebElement selectprogram;
	@FindBy(xpath ="//button[text()='Continue']")
	  WebElement continuetab; 
	@FindBy(xpath ="//span[text()='Country of Citizenship']")
	  WebElement countryofcitizen; 
	
	@FindBy(xpath ="//*[@class='mat-form-field-infix']//mat-select[@name='IntekId']")
	  WebElement intake;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	  WebElement intakeclick;
	@FindBy(xpath ="//*[@aria-label='Student Presence']//span[text()='Student Presence']")
	  WebElement studentpre; 
	@FindBy(xpath ="//span[text()='OnShore']")
	  WebElement studentpreclick;
	 @FindBy(xpath = "(//div//mat-option//span)[2]")
		WebElement citizenshipvalue;
	 @FindBy(xpath ="//button[text()=' Save ']")
	  WebElement savetab;
	 @FindBy(xpath ="//button[text()='Submit Application']")
	  WebElement submittab;
	 @FindBy(xpath ="//button[@type='button'][text()=' Yes']")
	  WebElement yestab;
	 @FindBy(xpath ="//button[text()='Submit To Institute']") 
	  WebElement submitinstitute;
	  @FindBy(xpath ="//button[@type='button'][text()=' Yes']")
	  WebElement yes;
	  @FindBy(xpath ="//span[text()='Applications']")
		WebElement app;
	  
	  @FindBy(xpath ="//*[@class='mat-form-field-infix']//input[@name='inputText']")
	  WebElement email;
	  @FindBy(xpath ="//*[@name='iAggreeed']/label/div[@class='mat-checkbox-inner-container']")
	  WebElement checkbox;
	  @FindBy(xpath ="//button[text()=' OK ']")
	  WebElement ok;
	  
	  @FindBy(xpath ="//*[@class='mat-form-field-infix']//input[@name='MobileNo']")
	  WebElement contactno;
	  
	  
	  @FindBy(xpath ="//*[@name='MobileNoCountryCode']//span[text()='Country code']")
	  WebElement countrycode;
	  @FindBy(xpath ="//*[@name='countryCodeFilter']//input[@aria-label='dropdown search']")
	  WebElement countrysearchclick;
	  
		@FindBy(xpath = "//*[@class='mat-form-field-infix']//input[@name='FirstName']")
		WebElement firsrname;
		@FindBy(xpath = "//*[@class='mat-form-field-infix']//input[@placeholder='Date of Birth']")
		WebElement datebirth;
		@FindBy(xpath = "//*[@class='mat-form-field-infix']//input[@name='Email']")
		WebElement email1;
		@FindBy(xpath = "(//*[@class='mat-select-value']//span[text()='Country'])[1]")
		WebElement country;
		@FindBy(xpath ="//*[@name='contyFilter']//input[@aria-label='dropdown search']")
		WebElement countrysearch;
		@FindBy(xpath ="//*[@class='mat-form-field-infix']//mat-select[@name='Citizenship']")
		WebElement coutryofcitizen2;
		@FindBy(xpath ="//*[@name='countryCodeFilter']//input[@aria-label='dropdown search']")
		WebElement coutrycodesearch;
		
		
	public void assignaplicanumber(){

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	 	wait=new WebDriverWait(driver,60);
		exi=(JavascriptExecutor)driver;
		a=new Actions(driver);
		 try 
		 {
				/*
				 * String dexpected="Dashboard"; String
				 * dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
				 * Assert.assertEquals(dactual, dexpected);
				 */
			 System.out.println("Enter In Dashboard Page");	
				Thread.sleep(3000);
				operation.click();
				Thread.sleep(2000);
				applications.click();
				UtilityFile.screenShot(driver);
				String aexpected="Applications";
				String aactual=driver.findElement(By.xpath("//span[text()='Applications']")).getText();
				Assert.assertEquals(aactual, aexpected);	
				System.out.println("Enter In Applications Page");
				Thread.sleep(2000);
				
				
				additional.click();
				Thread.sleep(3000);
				
				String dcexpected="NEW STUDENT";
				String dcactual=driver.findElement(By.xpath("//button[text()='New Student']")).getText();
				Assert.assertEquals(dcactual, dcexpected);	
				System.out.println("Enter In Select Student Page");
				search.sendKeys(prop.getProperty("inst"));
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				searchclick.click();
				Thread.sleep(3000);
				editapplication.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				String ncexpected="New Application";
				String ncactual=driver.findElement(By.xpath("//span[text()='New Application']")).getText();
				Assert.assertEquals(ncactual, ncexpected);	
				System.out.println("Enter In New Application Page");
				institutionselect.click();
				instFilter.sendKeys(prop.getProperty("pro"));
				Thread.sleep(3000);
				selectclickclick.click();
				Thread.sleep(3000);
				selectprogram.click();
				Thread.sleep(3000);
				selectclickclick.click();
				
				Thread.sleep(3000);
				intake.click();
				Thread.sleep(3000);
				intakeclick.click();
				
				Thread.sleep(3000);
				studentpre.click();
				Thread.sleep(3000);
				studentpreclick.click();
				
				
				Thread.sleep(3000);
				exi.executeScript("arguments[0].scrollIntoView();",continuetab);
				continuetab.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				Thread.sleep(3000);
				
				
				
				countryofcitizen.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				
		  		 List<WebElement> agbuttons = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
		  	 ArrayList<String> supbt = new ArrayList<>();
		  		for(WebElement agbutton:agbuttons)
		  		 {
		  			
		  		supbt.add(agbutton.getText());
		  			
		  		 }
		  		 System.out.print("Elements present in the filter list :"+supbt);
				 System.out.println("Taking ScreenShort");
	             System.out.println(" ");
	             
					/*
					 * for(String str : supbt) {
					 * 
					 * System.out.println(str);
					 * 
					 * }
					 */
	             Thread.sleep(3000);
				
			
				citizenshipvalue.click();
				exi.executeScript("arguments[0].scrollIntoView();",savetab);
				Thread.sleep(3000);
				savetab.click();
				exi=(JavascriptExecutor)driver;
				exi.executeScript("arguments[0].scrollIntoView();",submittab);
				Thread.sleep(3000);
				submittab.click();
				Thread.sleep(3000);
				yestab.click();	
				Thread.sleep(3000);
				submitinstitute.click();
				Thread.sleep(3000);
				yes.click();
				Thread.sleep(3000);
				app.click();
		 
		 }           
	 catch (Exception e) 
	 {
		e.printStackTrace();	
	 }
		
	}
	public void NewTabShifting() throws Throwable   
	{
		ArrayList<String> tab;
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
			driver.get("https://appuatmsm.azurewebsites.net");

			 Thread.sleep(3000);
		} catch (IndexOutOfBoundsException e) {
			
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

			driver.get("https://appuatmsm.azurewebsites.net");

		}
		
	}
	
	public void assignaplicanumberAgent(){

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	 	wait=new WebDriverWait(driver,60);
		exi=(JavascriptExecutor)driver;
		a=new Actions(driver);
		 try 
		 {
			 String dexpected="Dashboard";
			 String dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
			 Assert.assertEquals(dactual, dexpected);	
			 System.out.println("Enter In Dashboard Page");	
				Thread.sleep(3000);
				operation.click();
				Thread.sleep(2000);
				applications.click();
				UtilityFile.screenShot(driver);
				String aexpected="Applications";
				String aactual=driver.findElement(By.xpath("//span[text()='Applications']")).getText();
				Assert.assertEquals(aactual, aexpected);	
				System.out.println("Enter In Applications Page");
				Thread.sleep(2000);
				
				
				additional.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				UtilityFile.screenShot(driver);
				email.sendKeys(prop.getProperty("emm"));
				Thread.sleep(3000);
				a.moveToElement(checkbox).click(checkbox).build().perform();
				//checkbox.click();
				Thread.sleep(3000);
				ok.click();
				Thread.sleep(3000);
				
				String ncexpected="New Application";
				String ncactual=driver.findElement(By.xpath("//span[text()='New Application']")).getText();
				Assert.assertEquals(ncactual, ncexpected);	
				System.out.println("Enter In New Application Page");
				
				
				
				institutionselect.click();
				instFilter.sendKeys(prop.getProperty("pro"));
				Thread.sleep(3000);
				selectclickclick.click();
				Thread.sleep(3000);
				selectprogram.click();
				Thread.sleep(3000);
				selectclickclick.click();
				
				Thread.sleep(3000);
				intake.click();
				Thread.sleep(3000);
				intakeclick.click();
				
				Thread.sleep(3000);
				studentpre.click();
				Thread.sleep(3000);
				studentpreclick.click();
				
				
				Thread.sleep(3000);
				exi.executeScript("arguments[0].scrollIntoView();",continuetab);
				continuetab.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				Thread.sleep(3000);
				/*
				 * firsrname.sendKeys("houdai"); Thread.sleep(3000);
				 * datebirth.sendKeys("07/07/2008"); Thread.sleep(3000);
				 */
				coutryofcitizen2.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				
		  		 List<WebElement> agbuttons = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
		  	     ArrayList<String> supbt = new ArrayList<>();
		  		 for(WebElement agbutton:agbuttons)
		  		 {
		  			
		  		supbt.add(agbutton.getText());
		  			
		  		 }
		  		 System.out.println("Elements present in the filter list :"+supbt);
				 System.out.println("Taking ScreenShort");
	             System.out.println(" ");
	            
					/*
					 * for(String str : supbt) { System.out.println(str);
					 * 
					 * }
					 */
	             Thread.sleep(3000);
	             citizenshipvalue.click();
	             Thread.sleep(3000);
				
					
				 countrycode.click();
					  Thread.sleep(3000); 
					  coutrycodesearch.sendKeys("354");
					  Thread.sleep(3000);
					  coutrycodesearch.sendKeys(Keys.ENTER); 
					  Thread.sleep(3000);
					  
					  contactno.sendKeys("8965874525");
					  Thread.sleep(3000);
					  
					  exi.executeScript("arguments[0].scrollIntoView();",country); country.click();
					  Thread.sleep(3000);
					  
					  countrysearch.sendKeys("Algeria");
					  Thread.sleep(3000);
					  countrysearch.sendKeys(Keys.ENTER);
					  Thread.sleep(3000);
					  
					 
				
				
				exi.executeScript("arguments[0].scrollIntoView();",savetab);
				Thread.sleep(3000);
				savetab.click();
				exi=(JavascriptExecutor)driver;
				exi.executeScript("arguments[0].scrollIntoView();",submittab);
				Thread.sleep(3000);
				submittab.click();
				Thread.sleep(3000);
				yestab.click();	
				
				app.click();
		 
		 }           
	 catch (Exception e) 
	 {
		e.printStackTrace();	
	 }
		
	}
	
}
