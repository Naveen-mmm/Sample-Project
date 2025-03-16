package Test.Sample_Project;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationCommands {
	
	
	public void commands()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in"); 
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		String title = driver.getTitle();
		System.out.println("Current Title is :"+title);
		System.out.println("Current URL :"+driver.getCurrentUrl());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigationCommands s = new NavigationCommands();
		s.commands();
		

	}

}
