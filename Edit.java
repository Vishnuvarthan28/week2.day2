package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) 
	//LeafGround Assignments
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("a@test.com");
		
		System.out.println(driver.findElement(By.xpath("//input[@value][1]")).getAttribute("value"));
		
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		
	    System.out.println(driver.findElement(By.name("username")).getAttribute("align"));
		
	    WebElement clearElement = driver.findElement(By.xpath("(//input[@value])[3]"));
	    clearElement.clear();
	    
		/*
		 * WebElement colorElement = driver.findElement(By.xpath("(//input[@value])[3]"));
		 * System.out.println(colorElement.getCssValue("background-color"));
		 */
	    
	    WebElement disableElement = driver.findElement(By.xpath("(//input[@value])[3]"));
	    System.out.println(disableElement.isEnabled());
	}

}
