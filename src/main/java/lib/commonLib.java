package lib;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class commonLib {
	public static List<WebElement> elements;
	public static WebDriver driver = new ChromeDriver();

	@Test()
	public static void main() throws InterruptedException, IOException {

		// using chromedriver to open the web page
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// Wait For Page To Load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Navigate to URL
		driver.get("http://uptake.com/");
		// maximize window
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	public static String isElementPresentWithXpath(String xpathLocator) {

		// elements = driver.findElements(By.xpath(xpathLocator));

		try {
			elements = driver.findElements(By.xpath(xpathLocator));
			return elements.get(0).getText();
		} catch (TimeoutException e) {
			return null;
		}

		finally {
		}
	}

}
