package launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch {
	@Test
	public void launch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
}
