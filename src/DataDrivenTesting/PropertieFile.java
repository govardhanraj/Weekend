package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertieFile {

	public static void main(String[] args) throws IOException {

		//Path of the file
		FileInputStream fis = new FileInputStream("./TestData/Testdata.properties");
		
		//Object for properties
		Properties prop=new Properties();
		
		//Load or fetch the values
		prop.load(fis);
		String testdata = (String) prop.get("url");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(testdata);
		
	}

}
