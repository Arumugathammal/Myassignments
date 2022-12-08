package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class duplicateLead {


	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click(); 
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		WebElement cname = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		cname.sendKeys("Test");
		cname.clear();
		cname.sendKeys("Anitha");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Abhi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sankar");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("AG");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("anithag1701@gmail.com");

		driver.findElement(By.name("submitButton")).click();
		String a = driver.getTitle();
		System.out.println(a);
	}

}
