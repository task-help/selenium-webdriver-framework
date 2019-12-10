package configuration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class Capabilities {
	
	@BeforeTest
	public void setup() {
		
		DesiredCapabilities dc= DesiredCapabilities.firefox();
		dc.setCapability("version", "5");
	}

}
