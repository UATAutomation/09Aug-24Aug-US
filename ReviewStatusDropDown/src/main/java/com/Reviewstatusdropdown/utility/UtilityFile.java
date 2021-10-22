package com.Reviewstatusdropdown.utility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityFile
{
	static ArrayList<String> tab; 
	
	public static void screenShot(WebDriver driver) 
	{
		DateFormat dateFormate=new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date =new Date();
		String d=dateFormate.format(date);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\BASHA\\eclipse-workspace1\\ReviewStatusDropDown\\Screenshort\\"+d+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void Newtabone(WebDriver driver) throws Throwable 
	{
		try {
			
			Robot b = new Robot();
			b.keyPress(KeyEvent.VK_CONTROL);
			b.keyPress(KeyEvent.VK_SHIFT);
			b.keyPress(KeyEvent.VK_N);
			b.keyRelease(KeyEvent.VK_CONTROL);
			b.keyRelease(KeyEvent.VK_SHIFT);
			b.keyRelease(KeyEvent.VK_N);
		
			 Thread.sleep(3000);
			 tab = new ArrayList<>(driver.getWindowHandles());
			 driver.switchTo().window(tab.get(1));
			

			 driver.get("https://unify-qa.azurewebsites.net");

		} catch (IndexOutOfBoundsException e) {
			
			 tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

			driver.get("https://unify-qa.azurewebsites.net");

		}
		
	}
	public static void Newtabtwo(WebDriver driver) throws Throwable 
	{
		try {
			
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(2));


		} catch (Exception e) {
			
		}
	}

	public static void Newtabzero(WebDriver driver) throws Throwable 
	{
		try {
			
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));


		} catch (Exception e) {
			
		}
	}
	public static void frame(WebDriver driver) throws Throwable 
	{
		int size = driver.findElements(By.tagName("iframe")).size();
	   
	    driver.switchTo().frame(0);   		
		
	  
	}
	
	public static void Windowhandle(WebDriver driver) throws Throwable 
	{
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
  		 }
	}

}