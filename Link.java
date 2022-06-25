package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) 
	{
		//LeafGround Assignments

				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.leafground.com/pages/Link.html");
				
				System.out.println(driver.findElement(By.linkText("Go to Home Page")).getAttribute("href"));
				System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
				System.out.println(driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href"));
				System.out.println(driver.findElement(By.linkText("Go to Home Page")).getAttribute("href"));
				System.out.println(driver.findElement(By.linkText("How many links are available in this page?")).getAttribute("href"));
	}

}
