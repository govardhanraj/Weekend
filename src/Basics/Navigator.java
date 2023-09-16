package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigator {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		List<WebElement> img = driver.findElements(By.tagName("img"));
		List<WebElement> a = driver.findElements(By.tagName("a"));
		List<WebElement> b = driver.findElements(By.tagName("Table"));
		List<WebElement> c = driver.findElements(By.tagName("div"));
		Thread.sleep(3000);
		driver.quit();
		System.out.println(img.size());
		System.out.println(a.size());
		System.out.println(b.size());
		System.out.println(c.size());
		
	}

}
