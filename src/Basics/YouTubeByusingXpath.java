package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeByusingXpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("singara siriye kannada song");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		driver.findElement(By.xpath("(//*[text()='Kantara - Singara Siriye |Vijay Prakash|Ananya Bhat |Ajaneesh Loknath |Rishab Shetty|Hombale Films'])[1]")).click();
	}

}
    