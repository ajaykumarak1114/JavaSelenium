package com.launchbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox
{
	public static void main(String[] args)
	{
		String key = "webdriver.gecko.driver"; // key for the firefox browser
		String value ="./exeFiles/geckodriver.exe";// location of the geckodriver
		
		/*
		 * System is a class which provide facilities like standard input, standard output, error output streams,
		 * access to externally defined properties and environment variables, a means of loading files and libraries; 
		 * and a utility method for quickly copying a portion of an array
		 * */
	
		System.setProperty(key, value);
		
		String keyValue = System.getProperty(key); // getProperty method will return value of the given key
		System.out.println(keyValue);
		
		FirefoxDriver fd = new FirefoxDriver();// creating firefox driver object and it will launch firefox browser
		
		// fd is the reference variable of the FirefoxDriver by which methods of FirefoxDriver will be called
		
		fd.manage().window().maximize(); // maximize the firefox window
				
		fd.get("https://www.google.com"); // navigate to the given url
		
	}	

}
