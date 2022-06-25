package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args)
	{
		//LeafGround Assignments

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		System.out.println(driver.findElement(By.xpath("(//div/label)[1]")).isSelected());

		System.out.println(driver.findElement(By.xpath("(//input[@type])[6]")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("(//input[@type])[9]")).isSelected());
	}

}
