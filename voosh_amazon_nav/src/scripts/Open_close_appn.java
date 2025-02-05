package scripts;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Open_close_appn{
		public WebDriver driver;
		@BeforeMethod
		public void openApp()
		{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		@AfterMethod
		public void closeApp()
		{
		driver.close();	
		}

	}