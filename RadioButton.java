package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) 
	{
		//LeafGround Assignments

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/radio.html");
		

		System.out.println(driver.findElement(By.xpath("//*[@id=\"yes\"]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]")).isSelected());
		
	}

}
