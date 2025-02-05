package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestScript6 extends Open_close_appn{
	@Test
	public void test6() {
		WebElement eng = driver.findElement(By.xpath("//div[text()='EN']"));
		  Actions act = new Actions(driver);
		  act.moveToElement(eng).perform();
		  WebElement kn = driver.findElement(By.xpath("(//span[text()='ಕನ್ನಡ'])[1]"));
		  act.moveToElement(kn).perform();
		  act.click(kn).perform();
		  kn.isDisplayed();
		}

}
