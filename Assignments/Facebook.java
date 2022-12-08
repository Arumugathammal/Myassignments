package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();		
		driver.get("https://en-gb.facebook.com/");		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anitha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gopi");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9840189159");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("boys@123");
        	
		WebElement date=driver.findElement(By.name("birthday_day"));
		Select DA= new Select(date);
		DA.selectByIndex(16);
		
		WebElement month = driver.findElement(By.name("birthday_month"));
        Select MO = new Select(month);
        MO.selectByIndex(0);
        
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select Yr = new Select(year);
        Yr.selectByIndex(34);
	
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}



}
