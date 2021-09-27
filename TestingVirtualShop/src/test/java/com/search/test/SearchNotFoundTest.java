package com.search.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SearchNotFoundTest {

	private WebDriver driver;
	SearchNotFound searchNotFound;
	
	@Before
	public void setUp() throws Exception {
		searchNotFound = new SearchNotFound(driver);
		driver = searchNotFound.chromeDriverConnection();
		searchNotFound.visit("http://automationpractice.com/index.php");
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
	
		searchNotFound.checkSearch();
		
		assertEquals("No results were found for your search \"perro\"", searchNotFound.SearchAnswer());
		
	}

}
