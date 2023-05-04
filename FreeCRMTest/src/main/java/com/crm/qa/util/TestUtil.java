package com.crm.qa.util;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	/*public static void takeScreenshotAtEndOfTest() throws IOException{
		java.io.File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}*/
	
	//screenshot
	//switch to the another frame
	
	/*public void switchToFrame() {
		driver.switchTo().frame("")
	}*/
}
