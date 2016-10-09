package uptake;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import lib.commonLib;

public class uptakeTest extends commonLib {

	@Test()
	public static void ApproachPage() throws InterruptedException, IOException {

		// invoking main class to open the web page using chromedriver
		main();

		driver.findElement(By.xpath("/html/body/header/div/div[1]/div/ul/li[1]/a")).click();
		isElementPresentWithXpath(
				"//*[contains(text(), 'How we build our products is just as important as what we build.')]");
		// click Arrow Down Button
		driver.findElement(By.xpath("/html/body/div[4]/div/main/div[1]/a")).click();
		// Verify that text is present
		isElementPresentWithXpath("//*[contains(text(), 'Partnerships with Industry Leaders')]");
		isElementPresentWithXpath("//*[contains(text(), 'On-The-Ground Research')]");
		isElementPresentWithXpath("//*[contains(text(), 'A Platform Approach')]");
		isElementPresentWithXpath("//*[contains(text(), 'Integration into Workflow')]");
		isElementPresentWithXpath("//*[contains(text(), 'A Multidisciplinary Team of Entrepreneurs')]");

		Thread.sleep(3000);
		// close the browser
		driver.close();
	}

	@Test()
	public static void ApproachPage_responsive() throws InterruptedException, IOException {

		// invoking main class to open the web page using chromedriver
		main();

		// find element in the page using xpath

		driver.findElement(By.xpath("/html/body/header/div/div[1]/div/ul/li[1]/a")).click();

		Dimension dimension = new Dimension(650, 800);
		driver.manage().window().setSize(dimension);
		driver.findElement(By.cssSelector("#top > div > div.l-site-header__hamburger > a")).click();
		isElementPresentWithXpath("//*[contains(text(), 'Approach')]");
		isElementPresentWithXpath("//*[contains(text(), 'Platform')]");
		isElementPresentWithXpath("//*[contains(text(), 'Solutions')]");
		isElementPresentWithXpath("//*[contains(text(), 'People')]");
		isElementPresentWithXpath("//*[contains(text(), 'Join Us')]");
		isElementPresentWithXpath("//*[contains(text(), 'Contact Us')]");
		isElementPresentWithXpath("//*[contains(text(), 'Blog')]");
		driver.findElement(By.cssSelector("#top > div > div.l-site-header__hamburger > a")).click();

		Thread.sleep(3000);
		// close the browser
		driver.close();
	}

	@Test()
	public static void HomePage() throws InterruptedException, IOException {

		// invoking main class to open the web page using chromedriver
		main();

		// click Arrow Down Button
		driver.findElement(
				By.cssSelector("body > div.wrap.container > div > main > div.l-section.l-section--hero > a > svg"))
				.click();
		// Verify that text is present
		isElementPresentWithXpath(
				"//*[contains(text(), 'We help companies understand and act on their data. Uptake is building the singular platform that defines data-driven insight in major global industries.  We unlock answers, and our answers create value.')]");

		Thread.sleep(3000);
		// close the browser
		driver.close();
	}

}
