package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestScript3 extends Open_close_appn {
	@Test
	public void test3()
	{
	  WebElement ele = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	  Actions a = new Actions(driver);
	  a.moveToElement(ele).perform();
	  WebElement ele2 = driver.findElement(By.xpath("//span[text()='Your Account']"));
	  a.click(ele2).perform();
	  
	}
}
