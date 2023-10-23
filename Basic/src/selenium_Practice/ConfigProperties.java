package selenium_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigProperties {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		File file = new File("C:\\Users\\Shree-Swami\\eclipse-practice\\Selenium_Raw_Project\\Config.properties");
		FileInputStream fis = new FileInputStream(file);

		prop.load(fis);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(prop.getProperty("url"));

	}

}
