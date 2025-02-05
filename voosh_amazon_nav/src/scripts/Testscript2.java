package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testscript2 extends Open_close_appn {
	@Test
	public void test2()
	{
	  WebElement ele = driver.findElement(By.xpath("//span[text()='Prime']"));
	  Actions a = new Actions(driver);
	  a.moveToElement(ele).perform();
	  WebElement ele2 = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
	  ele2.click();
	
	}

}
