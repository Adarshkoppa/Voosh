package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestScript4 extends Open_close_appn{
	@Test
	public void test4()
	{
	  WebElement deliverto = driver.findElement(By.xpath("//div[@id='glow-ingress-block']"));
	  deliverto.click();
	  WebElement pincode = driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']"));
	  pincode.sendKeys("560094");
	  WebElement button = driver.findElement(By.xpath("//span[text()='Apply']"));
	  Actions a = new Actions(driver);
	  a.click(button).perform();
	}

}
