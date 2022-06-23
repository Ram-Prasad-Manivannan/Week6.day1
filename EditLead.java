package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead extends BaseClassTL 
{
  @Test
  public void editLead()throws InterruptedException
  {
		
		driver.findElement(By.linkText("Leads")).click();
		
		
		driver.findElement(By.linkText("Find Leads")).click();

		
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='firstName']")).sendKeys("Ram Prasad");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).click();				
		
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("The title of the page is verified");
		}
		else 
		{
			System.out.println("The title is null");
		} 
		
		boolean isTitleEnabled = driver.findElement(By.xpath("//title[text()='View Lead | opentaps CRM']")).isEnabled();
		System.out.println(isTitleEnabled);
		
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Thread.sleep(5000);
		
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Test Leaf Technologies - Edit changes");
		
		
		driver.findElement(By.xpath("//input[@class='smallSubmit' and @value='Update']")).click();		
		
		Thread.sleep(5000);

  }
}
