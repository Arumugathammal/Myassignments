package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteLead {

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
		
		driver.findElement(By.xpath("//span[@class='x-tab-strip-text'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("98");
		
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("32");
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.className("x-form-text x-form-field")).sendKeys("166370");
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.close();

	}

}
