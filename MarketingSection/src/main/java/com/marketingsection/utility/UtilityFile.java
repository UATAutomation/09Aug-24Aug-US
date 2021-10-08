package com.marketingsection.utility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
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
			FileUtils.copyFile(src, new File("C:\\Users\\funak\\AutomationTester\\MarketingSection\\ScreenShots\\"+d+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void NewTab(WebDriver driver)  
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
			driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?trialshow=true&to=studdnt");

			 Thread.sleep(5000);
		} catch (Throwable e) {
			
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

			driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?trialshow=true&to=studdnt");

		}
		
	}
	public static void Tab0(WebDriver driver)
	{
		try {
			
		
		tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
		} catch (Exception e) {
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));
			
		}
	}
	public static void Tab1(WebDriver driver)
	{
		try {
			
		tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		} catch (Exception e) {
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
		}
	}

}
