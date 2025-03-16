package Test.MyProject;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;


public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("AC");
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.name("field-keywords")).sendKeys("watch");
		driver.findElement(By.name("field-keywords")).clear();
		//driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("Mobile");
		//driver.findElement(By.linkText("Mobiles")).click();
		//driver.findElement(By.partialLinkText(" Service")).click();
		//driver.findElement(By.linkText("Best Sellers")).click();
		//driver.findElement(By.partialLinkText("Sellers")).click();
		driver.findElement(By.cssSelector("input[class='nav-input nav-progressive-attribute']")).sendKeys("Fancy dress");
		driver.findElement(By.xpath("//input[@aria-controls='sac-autocomplete-results-container']")).sendKeys("Shoes");
		//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		driver.findElement(By.cssSelector("input[class^='nav-inpu']")).clear();
		driver.findElement(By.cssSelector("input[class^='nav-inpu']")).sendKeys("Clock");
		driver.findElement(By.cssSelector("input[class^='nav-inpu']")).clear();
		driver.findElement(By.cssSelector("input[class*='input nav-progr']")).sendKeys("Game");
		driver.findElement(By.cssSelector("input[class*='input nav-progr']")).clear();
		
		
		//cssSelector :
		/*
		 * 1)Tag and id => # => Tag#id
		 * 2) Tag and Class =>. => Tag.class
		 * 
		 * 
		 * 
		 *
		 */
		
         driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Books");
         driver.findElement(By.cssSelector("input#twotabsearchtextbox")).clear();
	}  

}
