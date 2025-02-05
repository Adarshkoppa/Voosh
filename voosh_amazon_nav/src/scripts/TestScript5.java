package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestScript5 extends Open_close_appn {
	public void test5() {
	WebElement ddm = driver.findElement(By.id("searchDropdownBox"));
	  Select s = new Select(ddm);
	  s.selectByVisibleText("Books");
	  
	  WebElement search = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search Amazon.in']"));
	  search.sendKeys("Wings of fire");
	  WebElement button = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	  button.click();
	  
	}
}
