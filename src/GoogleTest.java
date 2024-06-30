import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public void HomePageCheck() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome"); //This will set on which browser it should run
		//caps.setPlatform(Platform.); - This will set on which platform this needs to run 
		//caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); -- Will accept the certificates in that browser
		//caps.setCapability(CapabilityType.BROWSER_NAME, "chrome"); - Otherway of setting the Browser
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.157.110:4444/"), caps);		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("rahul shetty");
		driver.close();
	}

}
