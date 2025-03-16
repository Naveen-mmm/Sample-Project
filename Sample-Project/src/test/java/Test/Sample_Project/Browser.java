package Test.Sample_Project;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Browser {
	
	public void BL()
	{
		WebDriver driver = new EdgeDriver();
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser ob = new Browser();
		ob.BL();
	}

}
