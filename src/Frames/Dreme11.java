package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dreme11 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("9663393682");
		driver.findElement(By.id("regUser")).click();
		driver.switchTo().parentFrame();
	}

}
