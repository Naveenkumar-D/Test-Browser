

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static String browser = "Firefox";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		if (browser.equals("Edge")) {
			WebDriverManager.iedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("http://way2automation.com");
		String Title = driver.getTitle();

		System.out.println(Title);
		System.out.println(Title.length());

		//driver.close();
		driver.quit();
	}

}
