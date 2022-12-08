package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");		
		driver.findElement(By.id("password")).sendKeys("crmsfa");		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Abhi");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("(//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]//a)[1]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Barclays");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		driver.close();
		
		
	}

}
