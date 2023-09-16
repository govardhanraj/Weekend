package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowPopoUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		childwindow.remove(parentwindow);
		for(String w:childwindow)
		{
			driver.switchTo().window(w);
			driver.findElement(By.linkText("Log in")).click();
		}
			
	}

}
