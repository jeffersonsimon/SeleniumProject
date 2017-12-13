package SamplePack;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jegatheseje43\\Downloads\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		
		
		ProfilesIni profile = new ProfilesIni();
		
		FirefoxProfile myprofile = profile.getProfile("default");
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, myprofile);
		
		FirefoxDriver driver = new FirefoxDriver(dc);
		
		
		driver.get("https://www.google.de");
		driver.findElement(By.name("q")).sendKeys("spain");
		driver.findElement(By.name("q")).submit();
		
		
		
		
	}

}
