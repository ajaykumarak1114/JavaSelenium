package com.launchbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox
{
	public static void main(String[] args)
	{
		String key = "webdriver.gecko.driver";
		String value ="./exeFiles/geckodriver.exe";
	
		System.setProperty(key, value);
		
		FirefoxDriver fd = new FirefoxDriver();
		
		fd.manage().window().maximize();
		
		fd.navigate().to("https://www.google.co.in");
		
	}	

}
