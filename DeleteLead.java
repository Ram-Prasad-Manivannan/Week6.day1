package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClassTL
{
    @Test
	public void DeleteLead1() 
    {

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String leadId = driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).getText();
		System.out.println("leadId is :" + leadId);

		driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).click();

		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		if (driver.getTitle().contains("TestLeaf")) 
		{
			System.out.println("The Title is Correct");
		} 
		else 
		{
			System.out.println("Something wrong check again...");
		}
		
	}

}