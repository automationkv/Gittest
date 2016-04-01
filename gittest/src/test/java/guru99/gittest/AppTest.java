package guru99.gittest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest 
{
	protected WebDriver driver;
	
	@Test
	public void guru99tutorials()
	{
		Logger log = Logger.getLogger("devpinoyLogger");
		
		driver = new FirefoxDriver();
		log.debug("Firefox Browser Opened");
		
		
		String eTitle = "Meet Guru99";
		String aTitle = "";
		
		driver.get("http://www.guru99.com");
		log.debug("Guru99 Site Opened");
		
		driver.manage().window().maximize();
		log.debug("Window Maximized");
		
		aTitle = driver.getTitle();
		log.debug("Title of the Window is: "+eTitle);
		if (aTitle.contentEquals(eTitle))
		{
			System.out.println("Test Passed");
			log.debug("Title matching with expected");
		}
		else
		{
			System.out.println("Test Failed");
			log.debug("Title Not matching with expected");
		}
		
		driver.close();
	}
}