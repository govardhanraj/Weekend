package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SumHR {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://govardhan.sumhr.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='small-blue']")).click();
	}

}
