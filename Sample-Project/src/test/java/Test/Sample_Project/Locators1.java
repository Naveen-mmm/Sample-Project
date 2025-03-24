package Test.Sample_Project;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators1 {
	
	public void loca1()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		// Tag and Id : Syntax : Tag#id
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("AC");
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).clear();
		driver.findElement(By.cssSelector("input.nav-input")).sendKeys("Mobile");
		driver.findElement(By.cssSelector("input.nav-input")).clear();
		driver.findElement(By.cssSelector("input[aria-controls='sac-autocomplete-results-container']")).sendKeys("Sketing Cycle");
		driver.findElement(By.cssSelector("input[aria-controls='sac-autocomplete-results-container']")).clear();
		driver.findElement(By.cssSelector("input.nav-input[placeholder='Search Amazon.in']")).sendKeys("bridge");
		driver.findElement(By.cssSelector("input.nav-input[placeholder='Search Amazon.in']")).clear();
		driver.findElement(By.cssSelector("input[class^='nav-input']")).sendKeys("ball");
		driver.findElement(By.cssSelector("input[class^='nav-input']")).clear();
		driver.findElement(By.cssSelector("input[name$='words']")).sendKeys("toys");
		driver.findElement(By.cssSelector("input[name$='words']")).clear();
		driver.findElement(By.cssSelector("input[aria-controls*='plete-results-']")).sendKeys("Laptop");
		driver.findElement(By.cssSelector("input[aria-controls*='plete-results-']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Bluestar AC");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'searchtextbox')]")).sendKeys("Samsung AC");
		driver.findElement(By.xpath("//input[contains(@id,'searchtextbox')]")).clear();
		driver.findElement(By.xpath("//input[contains(@aria-controls,'-results-container')]")).sendKeys("Gift");
		driver.findElement(By.xpath("//input[contains(@aria-controls,'-results-container')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@class,'nav-input nav-')]")).sendKeys("Honda Bike");
		driver.findElement(By.xpath("//input[starts-with(@class,'nav-input nav-')]")).clear();
		
		driver.findElement(By.xpath("//a[text()='New Releases']")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		 Locators1 obj = new Locators1();
		 obj.loca1();
		 
	}

}
