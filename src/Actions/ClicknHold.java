package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClicknHold {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("userName")).sendKeys("govardhan");
		driver.findElement(By.id("password")).sendKeys("Raj@123");
		Actions action = new Actions(driver);
		action.moveByOffset(1280, 303).clickAndHold().perform();
		
		
	}

}
