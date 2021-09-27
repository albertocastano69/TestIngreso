package com.register.test;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.search.test.EmptySearch;

public class EmptyRegisterTest {

	private WebDriver driver;
	EmptyRegister emptyRegister;
	@Before
	public void setUp() throws Exception {
		emptyRegister = new EmptyRegister(driver);
		driver = emptyRegister.chromeDriverConnection();
		emptyRegister.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		emptyRegister.EmptyrequiredFields();
		assertEquals("There are 8 errors", emptyRegister.ErrorAnswer());
	}

}
