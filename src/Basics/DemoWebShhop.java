package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.cli.CliCommand;

public class DemoWebShhop {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Govardhan");
		driver.findElement(By.id("LastName")).sendKeys("Raj");
		driver.findElement(By.id("Email")).sendKeys("raj121@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("raj11@gmail.com");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("raj11@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("BOOKS")).click(); //driver.findElement(By.LinkText("Books")).click();
		

	}

}

