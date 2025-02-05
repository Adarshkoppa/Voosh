package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestScript10 extends Open_close_appn {
	@Test
	public void test10() {
		long startTime = System.currentTimeMillis();
		 WebElement newReleases = driver.findElement(By.xpath("//div/a[text()='New Releases']"));
		 newReleases.click();
	     long loadTime = System.currentTimeMillis() - startTime;
	     System.out.println("Page load time: " + loadTime + " milliseconds");
	     if(loadTime < 7000 )
	     {
	    	 System.out.println("passed");
	     }
	     else
	     {
	    	 System.out.println("Failed");
	     }

}
}
