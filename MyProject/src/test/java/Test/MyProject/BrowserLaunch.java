package Test.MyProject;

import org.openqa.selenium.*;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;



public class BrowserLaunch {
	
	
	public void browser()
	{
	   
		//WebDriver driver = new EdgeDriver();
	    WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
	   // driver.get("https://www.leafground.com/dashboard.xhtml");
	    driver.manage().window().minimize();
	    //driver.close();
	   // driver.quit();
	    driver.manage().window().maximize();
	    driver.navigate().back();
	    driver.get("https://www.makemytrip.com/");
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserLaunch sh = new BrowserLaunch();
		sh.browser();

	}

}
