package launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Foxlaunch {
	@Test
	public void Launch2() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless");
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
