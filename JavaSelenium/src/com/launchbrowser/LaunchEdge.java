package com.launchbrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge
{
	public static void main(String[] args)
	{
		String key = "webdriver.edge.driver"; // key for the edge driver
		String value = "./exeFiles/msedgedriver.exe"; //value is the location of edge driver
		/*
		 * System is a class which provide facilities like standard input, standard output, error output streams,
		 * access to externally defined properties and environment variables, a means of loading files and libraries; 
		 * and a utility method for quickly copying a portion of an array
		 * */
		
		System.setProperty(key, value);
		
		String keyValue = System.getProperty(key); // getProperty method will return value of the given key
		System.out.println(keyValue);
		
		EdgeDriver ed = new EdgeDriver(); // creating edge driver object and it will launch edge browser
		
		// ed is the reference variable of the edgeDriver by which methods of edgeDriver will be called
		
		ed.manage().window().maximize(); // maximize the edge window
		
		ed.get("https://www.google.com"); // navigate to the given url
	}

}
