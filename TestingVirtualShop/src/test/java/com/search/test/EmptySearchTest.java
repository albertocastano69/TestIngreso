package com.search.test;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class EmptySearchTest {

	private WebDriver driver;
	EmptySearch emptySearch;
	@Before
	public void setUp() throws Exception {
		emptySearch = new EmptySearch(driver);
		driver = emptySearch.chromeDriverConnection();
		emptySearch.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException{
		emptySearch.checkSearch();
		assertEquals("Please enter a search keyword", emptySearch.SearchAnswer());

	}

}
