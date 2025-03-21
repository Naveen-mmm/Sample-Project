package Test.Sample_Project;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {
	
	
	public void locator()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		driver.findElement(By.id("menuform:j_idt40")).click();
		driver.findElement(By.id("menuform:m_input")).click();
		driver.findElement(By.id("j_idt88:name")).sendKeys("Naveenkumar");
		driver.findElement(By.name("j_idt88:j_idt91")).clear();
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys("Thevaram");
		
		boolean check =driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
		System.out.println("Is Check box is Enabled :"+check);
		
		boolean check1 = driver.findElement(By.name("j_idt88:j_idt93")).isDisplayed();
		System.out.println("Is Visible :"+check1);
		
		driver.findElement(By.cssSelector("input[value='Can you clear me, please?']")).clear();
		
		String ret =  driver.findElement(By.cssSelector("input[id='j_idt88:j_idt97']")).getAttribute("value");
		System.out.println("Reterieve Test is :"+ret);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locators obj = new Locators();
		obj.locator();

	}

}
