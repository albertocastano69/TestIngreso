package com.search.test;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SuccessfulSearchTest {

	private WebDriver driver;
	SuccessfulSearch successfulSearch;
	
	@Before
	public void setUp() throws Exception {
		successfulSearch = new SuccessfulSearch(driver);
		driver = successfulSearch.chromeDriverConnection();
		successfulSearch.visit("http://automationpractice.com/index.php");
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		successfulSearch.checkSearch();
		assertEquals("1 result has been found.", successfulSearch.SearchAnswer());

	}

}
