package scripts;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testscript1 extends Open_close_appn{
	@Test
	public void test1()
	{
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text' and @placeholder='Search Amazon.in']")));
	  searchBox.sendKeys("puma shoes");
	  Actions a = new Actions(driver);
	  WebElement element = null;
	  for (int i = 0; i < 3; i++) {  // Retry up to 3 times
	      try {
	          element = driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type='submit']"));
	          element.click();
	          break; // Exit the loop if successful
	      } catch (StaleElementReferenceException e) {
	          System.out.println("Element became stale, retrying... Attempt: " + (i + 1));
	      }
	  }
	}

}
