package TakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PerticularWebElement {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Udemy.com/");
		File f = driver.findElement(By.xpath("(//img[@alt=\"Udemy\"])[1]")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("./ScreenShot/image4.png"));

	}

}
