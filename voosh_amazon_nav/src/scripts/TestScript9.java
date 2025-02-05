package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestScript9 extends Open_close_appn{
	@SuppressWarnings("static-access")
	@Test
	public void test9() {
		WebElement AcLi = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions a=new Actions(driver);
		a.moveToElement(AcLi).perform();
		WebElement orders = driver.findElement(By.xpath("//span[text()='& Orders']"));
		a.sendKeys(orders,Keys.TAB.ENTER).perform();
		
	}
}
