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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Locators1 obj = new Locators1();
		 obj.loca1();
		 
	}

}
