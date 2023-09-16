package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TenWebElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("govardhan.r");
		System.out.println("Max Length = "+username.getAttribute("maxlength"));
//		String max = username.getAttribute("maxlength");
//		System.out.println("Max Length = "+max);
		System.out.println(username.getTagName());
		System.out.println(username.getText());
		System.out.println(username.getCssValue("position"));
		System.out.println(username.getLocation());
		System.out.println(username.getSize());
		driver.findElement(By.name("password")).sendKeys("demo@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in']")).submit();
		Thread.sleep(2000);
		driver.quit();
	}

}
