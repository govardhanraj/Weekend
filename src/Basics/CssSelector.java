package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.cli.CliCommand;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver(); //WebDriver driver= new GeckoDiver
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com");
		String c = driver.getCurrentUrl();
		System.out.println(c);
		String i = driver.getTitle();
		System.out.println(i);
		Set<String> y = driver.getWindowHandles();
		System.out.println(y);
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.cssSelector("img[alt=\"Home Decor Items \"]"));
	    a.click();
	    String aa = driver.getTitle();
		System.out.println(aa);
		String d = driver.getCurrentUrl();
		System.out.println(d);
		//img[alt="Home Decor Items "] //search above line on web, if its duplicated.
//		System.out.println(a);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
