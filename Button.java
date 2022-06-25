package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) 
	{
		//LeafGround Assignments

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		System.out.println("Homepage Tag Name is " +  driver.findElement(By.id("home")).getTagName());
		System.out.println("The Position of button is " + driver.findElement(By.id("position")).getLocation());
		System.out.println("The color is " + driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("The height and width is " + driver.findElement(By.id("size")).getSize());
		
	}

}
