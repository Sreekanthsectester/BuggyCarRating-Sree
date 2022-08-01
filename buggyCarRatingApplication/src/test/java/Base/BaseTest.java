package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties properties = new Properties();
	public static FileReader  configFile;
	public static Properties locators = new Properties();
	public static FileReader  locatorFile;
	public static Properties registerdetails = new Properties();
	public static FileReader  registerFile;
   	

	@BeforeTest
	public void setup() throws IOException, InterruptedException
	{
		
		if(driver == null )
		{
			configFile = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			properties.load(configFile);
			locatorFile = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locator.properties");
			locators.load(locatorFile);
			registerFile = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\register.properties");
			registerdetails.load(registerFile);
		}
		if(properties.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			driver.get(properties.getProperty("testURL"));
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}
		else if(properties.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
			driver.get(properties.getProperty("testURL"));
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}
		else if(properties.getProperty("browser").equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(properties.getProperty("testURL"));
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}
		else if(properties.getProperty("browser").equalsIgnoreCase("InternetExplorer"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.get(properties.getProperty("testURL"));
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
		}		
	}
	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		
	}

	
}
