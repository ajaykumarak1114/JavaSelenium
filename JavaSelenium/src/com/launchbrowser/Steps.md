Steps to download and configure selenium jar:-
	1-Go to https://www.selenium.dev/downloads/
	2-Click on latest version of Selenium Standalone server and save that file
	3-Copy the selenium jar and paste it in inside the jarFiles folder
	4-Right click on Selenium jar which is present inside the jarFiles Folder
	5-Click on Build Path and then click on add to build path
	
Steps to download and configure chromedriver:-
	1-Go to https://chromedriver.chromium.org/downloads
	2-Click on the respective version of chromedriver which chrome version you are using. (To check browser version- open chrome > click on 3          	  dots which is showing below cross button > hover on help option > click on About Google Chrome)
	3-Click on respective driver based on your operation system and save that file, click on chromedriver_win32.zip if you are using windows
	4-Then extract that file
	5-Copy chromedriver.exe and paste it inside exeFiles Folder
	
Steps to download and configure geckodriver:-
	1-Go to https://github.com/mozilla/geckodriver/releases/
	2-Click on the latest gecko driver based on your operating system and save that file
	3-Then extract that file
	4-Copy geckodriver.exe and paste it inside exeFiles Folder
	
Steps to download and configure edgedriver:-
	1-Go to https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
	2-Click on the respective version of edgedriver which edge version you are using. (To check browser version- open edge > click on 3          	  dots which is showing below cross button > hover on help option > click on About Microsoft edge)
	3-Click on respective driver based on your operation system and save that file
	4-Then extract that file
	5-Copy edgedriver.exe and paste it inside exeFiles Folder
	
	
	
If browser version and exe file version is not same then Session not created Exception will throw:- org.openqa.selenium.SessionNotCreatedException	

If you want to remove different version of exe file from exeFiles Folder then:-
Run command in cmd- taskkill /f /im {name of exefile}
After this you can able to delete exefile from the exeFiles folder in ide

For eg- if you want to remove chromedriver.exe file then run command:-
taskkill /f /im chromedriver.exe


	