package com.launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome
{
	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver"; // key for the chrome driver
		String value = "./exeFiles/chromedriver.exe"; //value is the location of chrome driver
		/*
		 * System is a class which provide facilities like standard input, standard output, error output streams,
		 * access to externally defined properties and environment variables, a means of loading files and libraries; 
		 * and a utility method for quickly copying a portion of an array
		 * */
		
		System.setProperty(key, value);
		
		String keyValue = System.getProperty(key); // getProperty method will return value of the given key
		System.out.println(keyValue);
		
		ChromeDriver cd = new ChromeDriver(); // creating chrome driver object and it will launch chrome browser
	}

}
