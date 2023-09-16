package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Actions action = new Actions(driver);
		action.moveByOffset(789, 420).click().perform();
//		action.contextClick().perform();
//		action.moveByOffset(40, 30).doubleClick()
		
		
	}

}
