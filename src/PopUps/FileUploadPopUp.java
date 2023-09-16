package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.freshersworld.com/user/register");
		driver.findElement(By.id("file-upload")).sendKeys("D:\\govar\\OneDrive\\Desktop\\Documents sent by Guru Sir\\05 August 2022.pdf");
	}

}
