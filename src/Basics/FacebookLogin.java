package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		driver.findElement(By.name("firstname")).sendKeys("Govardhan");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Raj");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("raj12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Govardhan");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Raj");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("raj12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("raj12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();

	}

}
