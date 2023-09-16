package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependedntXpath {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dunzo.com/bangalore");
		driver.findElement(By.xpath("//p[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Search for item or a store\"]")).sendKeys("Orange");
		
		driver.findElement(By.xpath("//div[@class=\"sc-fzqBZW czCluA sc-fzqPZZ kDXrhw sc-nukjgu-1 azWIq\"]")).click();
		driver.findElement(By.xpath("(//p[text()='Orange - Nagpur'])[1]/../../..//button[text()='ADD']")).click();
		
		

	}

}
