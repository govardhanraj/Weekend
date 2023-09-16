package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		Rectangle emailtextfield = email.getRect();
		Rectangle passwordtextfield = password.getRect();
		System.out.println(emailtextfield.getDimension());
		System.out.println(passwordtextfield.getDimension());
		
		
		if(emailtextfield.getX()== passwordtextfield.getX())
		{
			System.out.println("X alignments are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
		if(emailtextfield.getY()== passwordtextfield.getY())
		{
			System.out.println("X alignments are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		System.out.println(login.isSelected());
		
		
		
	}

}
