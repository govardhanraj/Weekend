package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("//span[text()='September']/../../..//a[text()='24']")).click();//dependentandIndipendentXpath
	}

}
