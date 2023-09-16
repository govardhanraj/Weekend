package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {

//********************Absolute X-Path********************************
		//Navigating from parent to immediate child
		
		//html/body/div[1]/input[1]   ---A
		//html/body/div[1]  --AB Entire row will select.
		//html/body/div[1]/input[1]|html/body/div[1]/input[2]  ---AB Single Single
		//html/body/div[1]/input|html/body/div[2]/input[1]    ---ABC
		//html/body/div[3]/input[1]   --E
		//html/body/div[2]/input[2]   --D
		
//********************Relative X-Path********************************
		//Navigating from parent to any child
		
		//div[2]/input[2]  --D
		//div[3]/input[1]|//div[3]/input[2]  --EF
		////div[3]/input[1]|//div[2]/input[2] --ED
		////div[3]/input[1]|//div[2]/input[2]|//div[1]/input[1]   --ADE
		
		
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("govardhan.r");
		driver.findElement(By.name("password")).sendKeys("demo@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in']")).submit(); //X-Path by Text Function
		
		

	}

}
