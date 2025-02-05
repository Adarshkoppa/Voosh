package scripts;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class TestScript8 extends Open_close_appn{
	@Test
	public void test8() {
		driver.manage().window().setSize(new Dimension(1280,720));
	}

}
