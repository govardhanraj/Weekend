package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWoodenSteet {

	public static void main(String[] args) 
	{
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.woodenstreet.com");
	List<WebElement> img = driver.findElements(By.tagName("img"));
	System.out.println(img.size());

	}

}
