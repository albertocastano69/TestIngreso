package com.chekinckingLinks.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class CheckLinksTest {
	WebDriver driver;
	CheckingLinksPage page;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chrome1\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		page = new CheckingLinksPage(driver);
		driver.get("http://automationpractice.com/index.php");
		
	}

	@Test
	public void checkingList() {
		assertTrue(page.checkingLinksPage(), "There are broken list");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
