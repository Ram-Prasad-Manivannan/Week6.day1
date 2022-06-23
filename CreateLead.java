package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends BaseClassTL
{

	@Test
	public void createLead() throws InterruptedException 
	{
				
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram Prasad");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		
		
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(Source);
		dd.selectByVisibleText("Conference");
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(2000);
		
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstName);
		
		if(firstName.equals("Ram Prasad")) 
		{
			System.out.println("Success");
		} 
		else 
		{
			System.out.println("Fail");
		}
	}

}
