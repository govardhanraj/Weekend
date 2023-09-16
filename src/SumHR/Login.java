package SumHR;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-Notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();	
		driver.get("https://govardhan.sumhr.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("email")).sendKeys("govardhan.r+company2@jupiter.money");
		driver.findElement(By.id("password")).sendKeys("Pulwama@49");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dropdownarrow")));

		WebElement dropdown = driver.findElement(By.id("dropdownarrow"));
		dropdown.click();
		driver.findElement(By.xpath("(//span[contains(@class,\"menu-first-span\")])[2]")).click(); 

		//Handle Hidden Drop Down Values / Auto Suggestions using DOM Trick | EventListener -- Youtube

		
	}

}
