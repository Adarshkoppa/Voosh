package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestScript7 extends Open_close_appn  {
	@Test
	public void test7() {
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobile.click();
		WebElement op_radio = driver.findElement(By.xpath("//span[text()='OnePlus']/../..//label"));
		op_radio.click();
		WebElement op_ele = driver.findElement(By.xpath("//span[text()='OnePlus 13R | Smarter with OnePlus AI (12GB RAM, 256GB Storage Nebula Noir)']"));
		Actions act = new Actions(driver);
		act.moveToElement(op_ele).perform();
		WebElement Addtocart = driver.findElement(By.xpath("//button[text()='Add to cart']/../../../../../../../../../..//span[text()='OnePlus 13R | Smarter with OnePlus AI (12GB RAM, 256GB Storage Nebula Noir)']/../../../..//button"));
		Addtocart.click();
		WebElement cart = driver.findElement(By.xpath("//div[@id='nav-cart-count-container']"));
		act.click(cart).perform();

	}

}
