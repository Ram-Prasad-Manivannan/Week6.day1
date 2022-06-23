package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTL 
{
	public ChromeDriver driver;

	@BeforeMethod
	public void preCondition() 
	{
		//setting up driver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		//opening url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//submit button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click 
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod
	public void postCondition() 
	{
		driver.close();
	}
}