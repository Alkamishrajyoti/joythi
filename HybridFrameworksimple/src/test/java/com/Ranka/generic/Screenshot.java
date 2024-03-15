package com.Ranka.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Base_class
{
public static void screen(WebDriver driver) throws IOException
{
	
	Date d=new Date(0);
	String d1= d.toString();
	String date = d1.replace(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("./Photos/"+date+"jpeg");
	FileHandler.copy(src, dst);
	
}
}

