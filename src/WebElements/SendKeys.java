package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Govardhan");
		firstname.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		firstname.sendKeys(Keys.CONTROL+"C");
		WebElement lastname = driver.findElement(By.name("lastname"));
		Thread.sleep(2000);
		lastname.sendKeys(Keys.CONTROL+"V");
		
		
	}

}
