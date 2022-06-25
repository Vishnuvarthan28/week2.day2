package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftaps {

	public static void main(String[] args) 
	{
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://leaftaps.com/opentaps/control/main"); 
       
       WebElement userNameElement = driver.findElement(By.id("username"));
       userNameElement.sendKeys("Demosalesmanager");
       
       WebElement passwordElement = driver.findElement(By.name("PASSWORD"));
       passwordElement.sendKeys("crmsfa");
       
       WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
       loginButton.click();
       
       WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
       crmsfa.click();
       
       WebElement leadsElement = driver.findElement(By.linkText("Leads"));
       leadsElement.click();
       
       WebElement createLeadElement = driver.findElement(By.linkText("Create Lead"));
       createLeadElement.click();
       
       WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
       companyName.sendKeys("Testleaf");
       
       WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
       firstName.sendKeys("Vishnuvarthan");
       
       WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
       lastName.sendKeys("Muthusamy");
       
      //WebElement createLead = driver.findElement(By.linkText("Create Lead"));
      //createLead.click();
       
      driver.findElement(By.name("submitButton")).click();
      
      WebElement elementSourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId")); 
      Select dd = new Select (elementSourceDropdown);
      dd.selectByIndex(2);
      dd.selectByVisibleText("Public Relations");
      dd.selectByValue("LEAD_SELFGEN");
      
      
	}

}
