package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) 
	{
		//LeafGround Assignments

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement indexElement = driver.findElement(By.xpath("//select[@id]"));
		Select dd = new Select (indexElement);
		dd.selectByIndex(1);
		
		WebElement textElement = driver.findElement(By.xpath("//select[@name]"));
		Select dd1 = new Select (textElement);
		dd1.selectByVisibleText("Appium");
		
		WebElement valueElement = driver.findElement(By.xpath("(//select[@name])[2]"));
		Select dd2 = new Select (valueElement);
		dd2.selectByValue("3");
		
		WebElement sizeElement = driver.findElement(By.xpath("(//select)[4]"));
		System.out.println(sizeElement.getSize());
		
		driver.findElement(By.xpath("(//select)[5]")).sendKeys("UFT/QTP");
			
		//System.out.println(driver.findElement(By.xpath("//div/select/option[@text='UFT/QTP'][4]")).isSelected());

		}

}
