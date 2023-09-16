package TakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EntireWebpage {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Udemy.com/");
		TakesScreenshot shot = (TakesScreenshot) driver;
		File f = shot.getScreenshotAs(OutputType.FILE);
		System.out.println(f);
		FileHandler.copy(f, new File("./ScreenShot/image2.png"));
		FileHandler.copy(f, new File("./ScreenShot/image3.png"));
		
	}

}
